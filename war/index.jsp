<%-- 
    Document   : index
    Created on : 28-mei-2014, 8:46:47
    Author     : Jeffrey
--%>



<%@page import="topgear.AutoOverzicht"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    String merknaam="";
    AutoOverzicht overzicht = new AutoOverzicht();
    
    merknaam = overzicht.getAutoMerk();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Auto Lijst</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
        
    </head>
    <body>
        <div class="logo" align="center">
            <img src="images/KeezBV.png">
        </div>
        
        <div class="content" align="center">
            <h3>Welkom bij de webshop van KeezBV</h3>
            
            <img src="images/carshop.jpg"><br>
            
            Hier kunt u de nieuwste auto's bekijken met de actuele prijzen en specs.<br>
            
            Klik op deze knop om verder te gaan!
            </p>
            <form action="auto.jsp" method="get">
                <input type="submit" name="overzicht" value="Overzicht" class="Button">
            </form>
        </div>    
            
                
    </body>
</html>
