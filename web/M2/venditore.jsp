<%-- 
    Document   : venditore
    Created on : 30-apr-2016, 17.56.18
    Author     : sara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <title> Venditore </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Sara Sulis">
        <meta name="keywords" content="accessori per la casa"> 
        <meta name="description" content="pagina indirizzta al venditore">
        <meta charset="utf-8"/>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen"/>
    </head>
    <body>
        <div class="page">
        <div class="header">
        <h1> Area Venditori </h1>
  
        <h2> In questa pagina è possibile inserire gli oggetti che si vogliono vendere</h2> 
        <!--Richiesta dei dati per la descrizione dell'oggetto che il venditore vuole vendere
            le richiste vengono fatte attraverso le diverse tipologie di input -->
        </div>
        <div class="navigazione">
        <!--la sezione di navigazione con i collegamenti che rimandano alle 
        pagine descrizione e login-->
        <nav>
            <div>
            <a href="descrizione.html"> Chi siamo </a>
            </div>
            <a href="login.html"> Vai al login. </a>
        </nav>
        </div>
        <div class="content">
        <form name="dati"  method="get">
               <label for="oggetto"> Nome oggetto </label>
               <input type='text' name='oggetto' id='oggetto'> 
               <label for="percorso" > Inserisci l'URL di un' immagine descrittiva dell'oggetto </label>
               <input type='url' name="percorso" id="percorso">
            
               <label for="testo"> Inserisci una descrizione dell'oggetto </label>
               <textarea name="testo" id="testo"> </textarea>
      
               <label for="prezzo"> Inserisci il prezzo dell'oggetto </label>
               <input type="number" name="prezzo" id="prezzo">
               <label for="pezziDisponibili"> Inserisci la quantità disponibile </label>
               <input type="number" name="pezziDisponibili" id="pezziDisponibili">
            
            <!--I due bottoni invio e reset-->
            <div class="pulsanti">
               <input type="submit" value="Invia"> 
               <input type="reset"  value="Azzera">
            </div>
            
        </form>
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

