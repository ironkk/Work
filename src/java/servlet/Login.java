/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import beans.GestorEJB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static persistence.Task_.user;

/**
 *
 * @author dam
 */
public class Login extends HttpServlet {
@EJB GestorEJB gestor;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//    
//        String nombreUsu = request.getParameter("nombreUsu");
//        String passUsu = request.getParameter("passUsu");
//        if(gestor.validar(nombreUsu, passUsu)){
//            request.getSession(true).setAttribute("nombreUsu", nombreUsu);
//            request.getSession(true).setAttribute("passUsu", passUsu);
//            response.sendRedirect(request.getContextPath() + "/usuarioValidado.jsp");
//            
//        }else{
//            
//            response.sendRedirect(request.getContextPath() + "/login.jsp");
//        }
//        
//        
//        
//    }


protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String username = request.getParameter("username");
        String pass = request.getParameter("pass");
        if(gestor.validar(username,pass)){
            request.getSession(true).setAttribute("username", username);
            request.getSession(true).setAttribute("pass", pass);
            //response.sendRedirect(request.getContextPath() + "/usuarioValidado.jsp");
            request.getRequestDispatcher("/usuarioValidado.jsp").forward(request, response);
            
        }else{
            
            response.sendRedirect(request.getContextPath() + "/login.jsp");
        }
        
        
        
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
