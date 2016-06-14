<%-- 
    Document   : cliente
    Created on : 30-apr-2016, 17.47.57
    Author     : sara
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Area clienti </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Sara Sulis">
        <meta name="keywords" content="accessori per la casa"> 
        <meta name="description" content="pagina indirizzata al cliete">
        <meta charset="utf-8"/>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen"/>
    </head>
    
    <body>
    <div class="page">
        <div class="header">
        <h1> Area Clienti </h1>
        <h2> In questa pagina potete trovare la descrizione di alcuni oggetti </h2>
        <!--ho creato la tabella con 7 oggetti, ho pensato di inserire nella prima riga l'intestazione 
        di ogni colonna e nelle successive righe il nome, l'immagine, il prezzo e la quantità dell'oggetto-->
        </div>
        <!-- Sezione di navigazione con due collegamenti alle pagine descrizione e login-->
        <div class="navigazione">
        <nav> 
            <div class="link">
            <a href="descrizione.html"> Chi siamo </a> 
            <div>
            <a href="login.html"> Vai al login </a>
            </div>
            </div>
        </nav>
        </div>
        

        <!-- Tasto Ricerca -->
        <label for="ricerca"> Filtra </label>
        <input id="ricerca" size="25"/>
 
        <table>
            <tr>
                <th> Nome </th>
                <th> Foto </th>
                <th> Quantità disponibile </th>
                <th> Prezzo in euro </th>
                <th> Aggiungi al carrello </th>
            </tr>
            <tr>
                <c:forEach var = "oggetto" items = "${listaOggetti}">
                    <!--genero gli oggetti dinamicamente-->
                    <td> "${oggetto.getNome}" </td>
                    <td> <img src="${oggetto.getUrl}" title="${oggetto.getNome()}"
                              alt="${oggetto.getNome}"></td>
                    <td> "${oggetto.getPrezzo()}" </td>
                    <td> "${oggetto.getQuantita()}" </td>
                    <td> <a href="cliente.html=${oggetto.getIdoggetto}"> Aggiungi al carrello </a> </td>

                  
            </c:forEach>
            </tr>

        </table> 

        
        <div class="footer">
            <jsp:include page="ripetuti.jsp"/>           
        </div>
    </div>
    </body>
</html>

