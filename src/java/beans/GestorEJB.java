/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import persistence.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author dam
 */
@Stateless
public class GestorEJB {
    
    @PersistenceUnit
    EntityManagerFactory emf;

    public boolean insertarUser(User u) {
        if (!existeUser(u)) {
            EntityManager em = emf.createEntityManager();
            em.persist(u);
            em.close();
            return true;
        }
        return false;
    }
     
    public boolean existeUser(User u) {
        return (emf.createEntityManager().find(User.class, u.getUsername())) != null;
    } 
    
    
//    public boolean validar(String nombreUsu, String passUsu){
//        
//        Cliente cliente = (emf.createEntityManager().find(Cliente.class, nombreUsu));
//        
//          if (cliente == null) {
//              return false;
//                 
//          } 
//          else{
//              if((cliente.getNombreUsu() == nombreUsu) && (cliente.getPassUsu() == passUsu)){
//                  return true;
//              }else{
//                  return false;
//              }
//          }
//    }
    
    public User validar (User u){
        
        EntityManager em = emf.createEntityManager();
    User exist = em.find(User.class, u.getUsername());
        if(exist != null){
            if(!exist.getPass().equals(u.getPass())){
                exist = null;
            }
        }
            em.close();
            return exist;
        }
    }
    
