<%-- 
    Document   : login
    Created on : 30-apr-2016, 17.57.00
    Author     : sara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Login </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Sara Sulis">
        <meta name="keywords" content="accessori per la casa login">  
        <meta name="description" content="pagina di login">
        <meta charset="utf-8"/>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen"/>
    </head>
    <body>
        <div class="page">
        <div class="header">
            <div logo> 
            <h1>Login</h1>
            </div>
        </div>
        <div class="navigazione">
        <!--sezione di navigazione con Collegamenti alle pagine-->
        <nav>
            <div class="link">
            <a href="cliente.html">Vai nell'area clienti</a>
            <div>
            <a href="venditore.html">Vai nell'area venditori</a>
            </div>
            <a href="descrizione.html">Chi siamo</a>
            </div>
        </nav>
        </div>
        <div class="content">
        
        <!--Inserisco gli input per richiedere username e password-->
            <div>
                <c:if test="${errore == true}">
                   <p>"Errore di autentiticazione"</p>;
                </c:if>
                <label for="primo"> USERNAME </label>
                <input type='text' name='primo' id="primo" value="username"/> 
                <label for="pass"> PASSWORD </label>
                <input type='password' name='pass' id="pass" value="password"/>
            </div>
           
            <!--Inserisco i bottoni invio e reset-->
            <div class="pulsanti">
                <input type="submit" value="Invia"> 
                <input type="reset"  value="Azzera">
            </div>
        
        </div>
        
        <div class="footer">
            <jsp:include page="Web Pages/M2/ripetuti.jsp"/>
        </div>
        </div>
    </body>
</html>
