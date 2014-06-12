<%-- 
    Document   : auto
    Created on : 28-mei-2014, 9:49:07
    Author     : Jeffrey
--%>

<%@page import="topgear.AutoOverzicht"%>


<%
	AutoOverzicht overzicht = new AutoOverzicht();

	String cellen = "", warning = "", merknaam = "", klassenaam ="";
	merknaam = overzicht.getAutoMerk();
	klassenaam = overzicht.getAutoKlasse();

	try {
		if (request.getParameter("overzicht") != null) {
			cellen = overzicht.getAutolijst();
		}
		if (request.getParameter("zoekmerk") != null) {
			String s = "" + request.getParameter("autos");
			cellen = overzicht.zoekAutoOpMerk(s);
		}
		if (request.getParameter("zoekklasse") != null) {
			String s = "" + request.getParameter("klasse");
			cellen = overzicht.zoekAutoOpKlasse(s);
		}
		if (request.getParameter("zoekprijs") != null) {
			if (request.getParameter("maxiprijs").equals("")
					&& request.getParameter("miniprijs").equals("")) {

			}
			if (request.getParameter("maxiprijs").equals("")) {
				int min_prijs;
				min_prijs = Integer.parseInt(request
						.getParameter("miniprijs"));
				cellen = overzicht.zoekAutoOpPrijsmin(min_prijs);
			}
			if (request.getParameter("miniprijs").equals("")) {
				int max_prijs;
				max_prijs = Integer.parseInt(request
						.getParameter("maxiprijs"));
				cellen = overzicht.zoekAutoOpPrijsmax(max_prijs);
			}

		}
	} catch (NumberFormatException e) {
		warning = "Geen prijs of Auto ingevuld";
	}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Lato" />

</head>
<body>
	<div class="logo" align="center">
		<img src="images/KeezBV.png">
	</div>

	<form action="auto.jsp" method="get">
		<div class="autoprijs" align="center">

			<h3>Zoeken op Prijs</h3>
			Vul een minimale en maximale prijs in<br> Minimale prijs:<br> <input
				type="number" name="miniprijs" id="text3"><br> Maximale prijs:<br><input
				type="number" name="maxiprijs" id="text3">
			<p>

				<input type="submit" name="zoekprijs" value="Zoek op prijs"
					class="Button">
		</div>
	</form>


	<form action="auto.jsp" method="get" class="merken">
		<div class="automerk" align="center">

			<h3>Zoeken op merk</h3>
			Selecteer een merk van de lijst,<br>De autos worden van dat merk
			weergegeven
			<p>
				<select name="autos" class="black">
				<option value="">Kies een merk</option>
					<%=merknaam%>
				</select> <br>
				<br> <input type="submit" name="zoekmerk"
					value="Zoeken op merk" class="Button">
		</div>
	</form>
	
	<form action="auto.jsp" method="get" class="merken">
		<div class="automerk" align="center">

			<h3>Zoeken op Klasse</h3>
			Selecteer een Klasse van de lijst,<br>De autos worden van die klasse
			weergegeven
			<p>
				<select name="klasse" class="black">
				<option value="">Kies een klasse</option>
					<%=klassenaam%>
				</select> <br>
				<br> <input type="submit" name="zoekklasse"
					value="Zoeken op klasse" class="Button">
		</div>
	</form>

	<form action="auto.jsp" method="get">
		<div class="overzicht" align="center">

			<h3>Overzicht</h3>
			Klik hier om het gehele overzicht te kunnen zien<br>
			<br>
			
			<br> <input type="submit" name="overzicht" value="Overzicht"
				class="Button">
	</form>
	</div>
	<h5 align="center"><%=warning%></h5>
	<div class="autolijstje container" align="center">

		<%=cellen%>
	</div>
</body>
</html>
