/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amm.Servlet;

import Amm.Classi.Cliente_factory;
import Amm.Classi.Utenti_cliente;
import Amm.Classi.Utenti_venditori;
import Amm.Classi.Venditore_factory;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sara
 */
@WebServlet(name = "Cliente", urlPatterns = {"/cliente.html"})


public class Cliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);
      
        /*controllare se si sono autenticati in modo esatto*/
        if (request.getParameter("submit") != null) {
            String username = request.getParameter("Username");
            String password = request.getParameter("Password");

            //ArrayList<Utenti_cliente> listaClienti = Cliente_factory.getInstance()
                    //.getClientilist();
            
            /*controllo che sia un cliente*/
            Utenti_cliente c = Cliente_factory.getInstance().getCliente(username, password);
                 if(c.getUsername().equals(username) && 
                        c.getPassword().equals(password)) {
                     
                      session.setAttribute("loggedIn", true);
                      session.setAttribute("id", c.getId());
                 }
                    request.setAttribute("cliente", c);
                    request.getRequestDispatcher("cliente.jsp").forward(request, response);
                 }
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


