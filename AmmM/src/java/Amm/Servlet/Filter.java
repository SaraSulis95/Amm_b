/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amm.Servlet;

import Amm.Classi.OggettiFactory;
import Amm.Classi.Oggetti_vendita;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sara
 */
@WebServlet(name = "Filter", urlPatterns = {"/filter.json"})
public class Filter extends HttpServlet {

    
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                // Controlla se è stato inviato un commando
        
        String command = request.getParameter("cmd");
        if (command != null) 
        {
            // Verifica che commando e id siano stati impostati
            if (command.equals("search")) 
            {
                // ID oggetto
                
                // Esegue la ricerca
                ArrayList<Oggetti_vendita> listaOggetti = OggettiFactory.getInstance()
                        .getrecuperaOggetto(request.getParameter("text"));
                // Imposto la lista come attributo della request, come facevamo per l'HTML
                request.setAttribute("listaOggetti", listaOggetti);
                
                // Quando si restituisce del json e' importante segnalarlo ed evitare il caching
                response.setContentType("application/json");
                response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT");
                response.setHeader("Cache-Control", "no-store, no-cache, "
                        + "must-revalidate");
                // Genero il json con una jsp
                request.getRequestDispatcher("filter.jsp").
                        forward(request, response);
            }
        }
    }
}
