package topgear;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 
 * @author janjaap
 */
public class AutoOverzicht {

	private ArrayList<Auto> autolijst;
	private ArrayList<String> merklijst;
	private ArrayList<String> klasselijst;

	public AutoOverzicht() {
		autolijst = new ArrayList<Auto>();
		merklijst = new ArrayList<String>();
		klasselijst = new ArrayList<String>();

		autolijst.add(new Auto("Audi", "A1", "Economyklasse", "180 km/h",
				86, "Benzine/ Diesel", "5,1 l/100 km", 2010, 23000));
		autolijst.add(new Auto("Audi", "A3", "Economyklasse", "185 km/h",
				102, "Benzine/ Diesel", "", 2003, 23000));
		autolijst.add(new Auto("Audi", "R8", "Sportwagen", "301 km/h",
				420, "Benzine", "14,6 l/100 km", 2007, 123000));
		autolijst.add(new Auto("Buggati", "Veyron", "Sportwagen", "407 km/h",
				1002, "Benzine", "115 l/100 km", 2005, 2150000));
		autolijst.add(new Auto("Ferrari", "Enzo", "Sportwagen", "355 km/h",
				666, "Benzine", "", 2002, 200000));
		autolijst.add(new Auto("Ferrari", "Testarossa", "Sportwagen",
				"290 km/h", 390, "Benzine", "", 1984, 209000));
		autolijst.add(new Auto("Fiat", "500", "Stadsauto", "160 km/h", 69,
				"Benzine", "4.8 L/100 km", 2007, 12000));
		autolijst.add(new Auto("Fiat", "Bravo", "Stadsauto", "179 km/h",
				90, "Benzine", "", 2007, 23000));
		autolijst.add(new Auto("Fiat", "Punto", "Stadsauto", "155 km/h",
				85, "Benzine/ Diesel", "", 2012, 16000));
		autolijst.add(new Auto("Ford", "Fiesta", "Stadsauto", "151 km/h",
				80, "Benzine", "", 2013, 14000));
		autolijst.add(new Auto("Ford", "Focus", "Compacte klasse", "263 km/h",
				80, "Benzine/ Diesel", "4,7 - 9,4 L/100km", 2005,
				25000));
		autolijst.add(new Auto("Ford", "GT", "Sportwagen", "330 km/h", 500,
				"Benzine", "", 2004, 245300));
		autolijst.add(new Auto("Ford", "Mondeo", "Middenklasse", "245km/h",
				220, "Benzine/ Diesel", "", 1993, 28000));
		autolijst.add(new Auto("Koenigsegg", "CCX", "Sportwagen", "395 km/h",
				806, "Benzine", "", 2006, 1100000));
		autolijst.add(new Auto("Lamborghini", "Gallardo", "Sportwagen",
				"309 km/h", 560, "Benzine", "14,7 Liter/100 km", 2008,
				263028));
		autolijst.add(new Auto("Maserati", "Ghibli", "Sportwagen", "285 km/h",
				410, "Benzine/ Diesel", "", 2013, 120000));
		autolijst.add(new Auto("Maserati", "Quattroporte", "Super Sedan",
				"307", 530, "Benzine", "", 2013,
				160000));
		autolijst.add(new Auto("Opel", "Astra", "Stadsauto", "250 km/h",
				87, "Benzine/ Diesel", "", 2009, 22000));
		autolijst.add(new Auto("Opel", "Corsa", "Stadsauto",
				"Niet beschikbaar", 130, "Benzine", "", 2006,
				14000));
		autolijst.add(new Auto("Opel", "Mokka", "SUV", "Niet beschikbaar",
				140, "Diesel", "", 2012, 11000));
		autolijst.add(new Auto("Pagani", "Huayra", "Sportwagen", "370 km/h",
				700, "Benzine", "", 2011, 850000));
		autolijst.add(new Auto("Porsche", "Cayenne", "SUV", "212 km/h",
				400, "Diesel", "", 2009, 85000));
		autolijst.add(new Auto("Porsche", "Panamera", "Sportwagen", "242 km/h",
				250, "Diesel", "", 2011, 120000));
		autolijst.add(new Auto("Porsche", "911 Turbo", "Sportwagen",
				"315 km/h", 520, "Benzine", "9,7 liter/100 km", 2010,
				126000));

		for (Auto a : autolijst) {
			if (!merklijst.contains(a.getMerk())) {
				merklijst.add(a.getMerk());
			}
		}
		
		for (Auto a : autolijst) {
			if (!klasselijst.contains(a.getKlasse())) {
				klasselijst.add(a.getKlasse());
			}
		}
	}

	public String zoekAutoOpPrijsmin(int min_prijs) {

		String s = "";

		for (Auto a : autolijst) {
			if (a.getPrijs() >= min_prijs) {
				s += "<div class='lijst'>";
				s += "<p class='autos'<br>" + a.getMerk() + " " + a.getType()
						+ "</br>";
				s += "&#8364; " + a.getPrijsFormat() + "<br></p>";
				s += a.getPlaatjes()+"<br>";
				s += "Klasse: "+ a.getKlasse()+"<br>Topsnelheid: " + a.getTopsnelheid() + "<br>Vermogen in pk: "+ a.getVermogen() +"<br>Brandstof: "+a.getBrandstof();
				s += "<br>Brandstofverbruik: " + a.getVerbruik() + "<br>Jaar: " + a.getJaar();
				s += "</div>";
			}
		}
		return s;
	}

	public String zoekAutoOpPrijsmax(int max_prijs) {

		String s = "";

		for (Auto a : autolijst) {
			if (a.getPrijs() <= max_prijs) {
				s += "<div class='lijst'>";
				s += "<p class='autos'<br>" + a.getMerk() + " " + a.getType()
						+ "</br>";
				s += "&#8364; " + a.getPrijsFormat() + "<br></p>";
				s += a.getPlaatjes()+"<br>";
				s += "Klasse: "+ a.getKlasse()+"<br>Topsnelheid: " + a.getTopsnelheid() + "<br>Vermogen in pk: "+ a.getVermogen() +"<br>Brandstof: "+a.getBrandstof();
				s += "<br>Brandstofverbruik: " + a.getVerbruik() + "<br>Jaar: " + a.getJaar();
				s += "</div>";
			}
		}
		return s;
	}

	public String zoekAutoOpPrijs(int max_prijs, int min_prijs) {

		String s = "";

		for (Auto a : autolijst) {
			if (a.getPrijs() >= min_prijs && a.getPrijs() <= max_prijs) {
				s += "<div class='lijst'>";
				s += "<p class='autos'<br>" + a.getMerk() + " " + a.getType()
						+ "</br>";
				s += "&#8364; " + a.getPrijsFormat() + "<br></p>";
				s += a.getPlaatjes()+"<br>";
				s += "Klasse: "+ a.getKlasse()+"<br>Topsnelheid: " + a.getTopsnelheid() + "<br>Vermogen in pk: "+ a.getVermogen() +"<br>Brandstof: "+a.getBrandstof();
				s += "<br>Brandstofverbruik: " + a.getVerbruik() + "<br>Jaar: " + a.getJaar();
				s += "</div>";
			}
		}
		return s;
	}

	public String zoekAutoOpMerk(String merk) {
		String s = "";

		for (Auto a : autolijst) {
			if (a.getMerk().equals(merk)) {
				s += "<div class='lijst'>";
				s += "<p class='autos'<br>" + a.getMerk() + " " + a.getType()
						+ "</br>";
				s += "&#8364; " + a.getPrijsFormat() + "<br></p>";
				s += a.getPlaatjes()+"<br>";
				s += "Klasse: "+ a.getKlasse()+"<br>Topsnelheid: " + a.getTopsnelheid() + "<br>Vermogen in pk: "+ a.getVermogen() +"<br>Brandstof: "+a.getBrandstof();
				s += "<br>Brandstofverbruik: " + a.getVerbruik() + "<br>Jaar: " + a.getJaar();
				s += "</div>";
			}
		}

		return s;
	}
	
	public String zoekAutoOpKlasse(String klasse) {
		String s = "";

		for (Auto a : autolijst) {
			if (a.getKlasse().equals(klasse)) {
				s += "<div class='lijst'>";
				s += "<p class='autos'<br>" + a.getMerk() + " " + a.getType()
						+ "</br>";
				s += "&#8364; " + a.getPrijsFormat() + "<br></p>";
				s += a.getPlaatjes()+"<br>";
				s += "Klasse: "+ a.getKlasse()+"<br>Topsnelheid: " + a.getTopsnelheid() + "<br>Vermogen in pk: "+ a.getVermogen() +"<br>Brandstof: "+a.getBrandstof();
				s += "<br>Brandstofverbruik: " + a.getVerbruik() + "<br>Jaar: " + a.getJaar();
				s += "</div>";
			}
		}

		return s;
	}

	public String getAutolijst() {
		String s = "";

		for (Auto a : autolijst) {
			s += "<div class='lijst'>";
			s += "<div class='autos'<br>" + a.getMerk() + " " + a.getType()
					+ "</br>";
			s += "&#8364; " + a.getPrijsFormat() + "</div>";
			s += "<div class='specs'>" + a.getPlaatjes()+"<br>";
			s += "Klasse: "+ a.getKlasse()+"<br>Topsnelheid: " + a.getTopsnelheid() + "<br>Vermogen in pk: "+ a.getVermogen() +"<br>Brandstof: "+a.getBrandstof();
			s += "<br>Brandstofverbruik: " + a.getVerbruik() + "<br>Jaar: " + a.getJaar()+ "</div>";
			s += "</div>";
		}
		return s;

	}

	public String getAutoMerk() {
		String s = "";

		for (String z : merklijst) {
			s += "<option value='" + z + "'>" + z + "</option>";

		}

		return s;
	}
	
	public String getAutoKlasse() {
		String s = "";

		for (String z : klasselijst) {
			s += "<option value='" + z + "'>" + z + "</option>";

		}

		return s;
	}

}
