<%-- 
    Document   : cliente
    Created on : 30-apr-2016, 17.47.57
    Author     : sara
--%>

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
        <div class="content">
        <table>
            <tr>
                <th> Nome </th>
                <th> Foto </th>
                <th> Quantità disponibile </th>
                <th> Prezzo in euro </th>
                <th> Aggiungi al carrello </th>
            </tr>
            <tr>
                <!--primo oggetto -->
                <td> Scatola da the </td>
                <td> <img title="scatola da the" alt="Foto scatola da the"
                          src="img/scatola.jpg" width="150" height="150"></td>
                <td> 5 pezzi </td>
                <td> €5.8 </td>
                <td> <a href="cliente.html"> Aggiungi al carrello </a> </td>
            </tr>
            <tr>
                <!--secondo oggetto-->
                <td> Cuscino moderno </td>
                <td><img title="cuscino" alt="cuscino"
                         src="img/cuscino.jpeg" width="150" height="150"></td>
                <td> 8 pezzi </td>
                <td> €10.8 </td>
                <td> <a href="cliente.html"> Aggiungi al carrello </a> </td>
            </tr>
            <tr>
                <!--terzo oggetto-->
                <td> Candela profumata </td>
                <td><img title="Candela profumata" alt="Candela profumata"
                         src="img/candela.jpeg" width="150" height="150"></td>
                <td> 7 pezzi </td>
                <td> €2.5 </td>
                <td> <a href="cliente.html"> Aggiungi al carrello </a> </td>
            </tr>
            <tr>
                <!--quarto oggetto-->
                <td> Tappeto </td>
                <td><img title="tappeto salone" alt="Foto tappeto salone"
                         src="img/tappeto.jpg" width="150" height="150"></td>
                <td> 4 pezzi </td>
                <td> €50.00 </td>
                <td> <a href="cliente.html"> Aggiungi al carrello </a> </td>
            </tr>
            <tr>
                <!--quinto oggetto-->
                <td> Adesivi luminosi per bambini </td>
                <td><img title="Adesivi luminosi" alt="Foto adesivi luminosi"
                         src="img/adesivo.jpg" width="150" height="180"></td>
                <td> 3 pezzi </td>
                <td> €8.90 </td>
                <td> <a href="cliente.html"> Aggiungi al carrello </a> </td>
            </tr>
            <tr>
                <!--sesto oggetto-->
                <td> Quadro Marilyn </td>
                <td><img title="Quadro" alt="Foto quadro"
                         src="img/quadro.JPG" width="150" height="150"></td>
                <td> 2 pezzi </td>
                <td> €45.23 </td>
                <td> <a href="cliente.html"> Aggiungi al carrello </a> </td>
            </tr>
            <tr>
                <!--settimo oggetto-->
                <td> Vaso da giardino </td>
                <td><img title="Vaso da giardino" alt="Foto vaso da giardino"
                         src="img/vaso.jpg" width="150" height="150"></td>
                <td> 4 pezzi </td>
                <td> €9.00 </td>
                <td> <a href="cliente.html"> Aggiungi al carrello </a> </td>
            </tr>
        </table> 
        
        </div>
        <div class="footer">
            <p> HOMEDECOR, 
            © Homedecor S.n.c - Copyright 2016 - 2020 - Tutti i diritti riservati
                        Via Sulis 76/85, Cagliari
                    P.Iva: 0787361086 n. iscrizione - Rea MI - 1987381
            </p>
        </div>
    </div>
    </body>
</html>

