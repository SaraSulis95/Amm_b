<%-- 
    Document   : filter
    Created on : 10-giu-2016, 11.49.48
    Author     : sara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page contentType="application/json" pageEncoding="UTF-8"%>
<%@taglib prefix="json" uri="http://java.sun.com/jsp/jstl/core"%>
    
<json:array>
    <c:forEach var="oggetto" items="${listaOggetti}">
        <json:object>
            <json:property name="nome" value="${oggettp.nome}"/>
            <json:proprety name="img" value="${oggetto.url}"/>
            <json:property name="prezzo" value="${oggetto.prezzo}"/>
            <json:property name="id" value="${oggetto.idoggetto}"/>
            <json:property name="quantita" value="${oggetto.quantita}"/>
            
        </json:object>
    </c:forEach>
</json:array>
        
       
                