/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amm.Servlet;

import Amm.Classi.Utenti_venditori;
import Amm.Classi.Venditore_factory;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Venditore", urlPatterns = {"/venditore.html"})
public class Venditore extends HttpServlet {

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
        if (request.getParameter("submit") == null) {     
            request.getRequestDispatcher("venditore.jsp").forward(request, response);
        }    
        
                
                String nome =  request.getParameter("nome");
                String url = request.getParameter("url");
                String quantita_string = request.getParameter("quantita");
                String prezzo_string = request.getParameter("prezzo");
                int prezzo = -1;
                int quantita = -1;
                
                //converto
                try{
                    prezzo = Integer.parceInt(prezzo_string);
                    quantita = Integer.parceInt(quantita_string);
                }
                catch(RuntimeException error){
                    request.setAttribute("error", true);
                    request.getRequestDispatcher("venditore.jsp").forward(request, response);
                }
        
                 
        }
     Integer.parse//per convertire
          
               devo recuperare tutto dal form guardare se sono diversi da null 
               passa solo string quindi bisogna convertire
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
