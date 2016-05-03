<%-- 
    Document   : descrizione
    Created on : 30-apr-2016, 17.56.40
    Author     : sara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Home Decor</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Sara Sulis">
        <meta name="keywords" content="accessori per la casa"> 
        <meta name="description" content="pagina di descrizione">
        <base href="descrizione.html">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen"/>
    </head>
    <body>
        <div class="page">
        <!--In questa pagina ho descritto brevemente il mio sito, nel tag
        h1 ho inserito il nome del sito.-->
     <div class="header">
    <h1> Home decor </h1>
    <p> Benvenuti in home decor , qui troverete tutti gli accessori per dare un tocco in più alla vostra casa</p>
    <!--ho utilizzato una lista per divvidere in sezioni il mio sito, con clienti venditori e oggettistica
        la sezione oggettistica è stata divvisa in base alle varie zone-->
    </div>
    <div class="navigazione">
    <nav>
    <ol>
        <li> <a href="#primo"> Clienti </a> </li>
        <li> <a href="#secondo"> Venditori </a> </li>
        <li> <a href="#terzo"> Oggettistica</a> 
          <ul>
              <li> <a href="#uno"> Sala da pranzo </a> </li>
              <li> <a href="#due"> Soggiorno </a> </li>
              <li> <a href="#tre"> Bagno </a> </li>
              <li> <a href="#quattro"> Camera da letto </a> </li>
              <li> <a href="#cinque"> Bambini</a> </li>
              <li> <a href="#sei"> Ufficio </a> </li>
              <li> <a href="#sette"> Esterni </a> </li>
          </ul>  
        </li>
        <li> <a href="login.html"> Vai al login</a> </li>
    </ol>
    </nav>
    </div>
    <div class="content">
    <!--breve descrizione della sezione cliente-->
    <h2 id="primo"> Clienti </h2>
    
    <p> 
        I clienti possono acquistare gli oggetti del nostro sito tramite un semplice login.
        il catalogo completo si trova nella sezione oggetti, mentre in questa sezione si trovano gli oggetti più venduti.
    </p>
    <!--breve descrizione della sezione venditori-->
    <h2 id="secondo"> Venditori </h2>
    <p>
        Questa sezione è dedicata ai venditori che hanno la possibilità di caricare
        i loro prodotti loggandosi tramite la sezione loging.
        Assicuriamo ai nostri clienti la massima sicurezza attraverso un controllo dei
        venditori da parte del nostro personale
    </p>
    <!--breve descrizone della sezione oggettistica-->
    <h2 id= "terzo"> Oggettistica </h2>
        <p>
        Questa sezione è dedicata al nostro catalogo completo di tutti gli accessori.
        Il catalogo viene divviso per ambienti.
        </p>
        <!--riferimento a ogni ambiente attraverso collegamenti interni-->
            <h3 id="uno"> Sala da pranzo </h3>
                <p>In questa sezione potete trovare tutti gli accessori per la vostra sala da pranzo.</p>
            <h3 id="due"> Soggiorno </h3>
                <p>In questa sezione potete trovare tutti gli accessori per la vostro soggiorno.</p>
            <h3 id="tre"> Bagno </h3>
                <p>In questa sezione potete trovare tutti gli accessori per il vostro bagno.</p>
            <h3 id="quattro"> Camera da letto </h3>
                <p>In questa sezione potete trovare tutti gli accessori per la vostra camera da letto.</p>
            <h3 id="cinque"> Bambini </h3>
                <p>In questa sezione potete trovare tutti gli accessori per la vostra stanza dei vostri bambini.</p>
            <h3 id="sei"> Ufficio </h3>
                <p>In questa sezione potete trovare tutti gli accessori per rendere più accogliente il vostro ufficio.</p>
            <h3 id="sette"> Esterni </h3>
                <p>In questa sezione potete trovare tutti gli accessori per il vostro giardino o per la vostra veranda.</p>
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

