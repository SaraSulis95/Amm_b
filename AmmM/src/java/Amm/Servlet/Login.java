/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amm.Servlet;

import Amm.Classi.Cliente_factory;
import Amm.Classi.OggettiFactory;
import Amm.Classi.SaldoFactory;
import Amm.Classi.Utenti_cliente;
import Amm.Classi.Utenti_venditori;
import Amm.Classi.Venditore_factory;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "Login", urlPatterns = {"/login.html"},loadOnStartup = 0 )

public class Login extends HttpServlet {
    
    private static final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String DB_CLEAN_PATH = "../../web/WEB-INF/db/ammdb";
    private static final String DB_BUILD_PATH = "WEB-INF/db/ammdb";

    @Override 
    public void init(){
        String dbConnection = "jdbc:derby:" + this.getServletContext().getRealPath("/") + DB_BUILD_PATH;
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        SaldoFactory.getInstance().setConnectionString(dbConnection);
        OggettiFactory.getInstance().setConnectionString(dbConnection);
        Venditore_factory.getInstance().setConnectionString(dbConnection);
        Cliente_factory.getInstance().setConnectionString(dbConnection);
        
    }
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
        if (request.getParameter("Submit") != null) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

           Utenti_cliente u = Cliente_factory.getInstance().getCliente(username, password);
            
                if (username.equals(u.getUsername()) && password.equals(u.getPassword())) 

                /*controllo che sia un cliente o un venditore*/
                if (u.getUsername()!=  null && u.getUsername().equals(username) && 
                        u.getPassword() != null && u.getPassword().equals(password)) {
                    
                session.setAttribute("loggedIn", true);
                session.setAttribute("id", u.getId());
                
                request.setAttribute("cliente", u);
                //request.setAttribute("listaOgetti", OggettiFactory.getInstance().getOggettilist());
                
                session.setAttribute("loginVenditore", false);
                session.setAttribute("loginCliente", true);
                
                request.getRequestDispatcher("cliente.jsp").forward(request, response);
                }
            }
                
             Utenti_venditori v = Venditore_factory.getInstance().getVenditore(username, password);
            
                if (username.equals(v.getUsername()) && password.equals(v.getPassword())) 
                /*controllo che sia un cliente o un venditore*/ 
                    if (v.getUsername().equals(username) && 
                            v.getPassword().equals(password)) {

                        session.setAttribute("loggedIn", true);
                        session.setAttribute("id", v.getId());
                        
                        session.setAttribute("loginVenditore", true);
                        session.setAttribute("loginCliente", false);
                         

                        /*passo la pagina venditore*/
                        request.getRequestDispatcher("venditore.jsp").forward(request, response);

                    }
                }
    
            request.setAttribute("Errore", true);
        }    
            /*richiamare una pagina*/
            request.getRequestDispatcher("/login.jsp").forward(request, response);
    
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
