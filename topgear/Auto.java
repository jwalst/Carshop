package topgear;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Auto {

    private String merk, type, klasse, topsnelheid,  brandstof, verbruik ;
    private int prijs, jaar, vermogen;


	public Auto(String merk, String type, String klasse, String topsnelheid,
			int vermogen, String brandstof, String verbruik,int jaar,
			int prijs) {
		this.merk = merk;
		this.type = type;
		this.klasse = klasse;
		this.topsnelheid = topsnelheid;
		this.vermogen = vermogen;
		this.brandstof = brandstof;
		this.verbruik = verbruik;
		this.jaar = jaar;
		this.prijs = prijs;
	}

	public int getJaar() {
		return jaar;
	}

	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}

	public String getTopsnelheid() {
		return topsnelheid;
	}

	public void setTopsnelheid(String topsnelheid) {
		this.topsnelheid = topsnelheid;
	}

	public int getVermogen() {
		return vermogen;
	}

	public void setVermogen(int vermogen) {
		this.vermogen = vermogen;
	}

	public String getBrandstof() {
		return brandstof;
	}

	public void setBrandstof(String brandstof) {
		this.brandstof = brandstof;
	}

	public String getVerbruik() {
		return verbruik;
	}

	public void setVerbruik(String verbruik) {
		this.verbruik = verbruik;
	}
	public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public String getPlaatjes() {
        String pre = "<img class='auto' src='images/";
        String post = ".jpg'>";
        switch (type) {
            case "A1":
                return pre + "audi_a1" + post;
            case "A3":
                return pre + "audi_a3" + post;
            case "R8":
                return pre + "audi_r8" + post;
            case "Enzo":
                return pre + "ferrari_enzo" + post;
            case "Testarossa":
                return pre + "ferrari_testarossa" + post;
            case "500":
                return pre + "fiat_500" + post;
            case "Bravo":
                return pre + "fiat_bravo" + post;
            case "Punto":
                return pre + "fiat_punto" + post;
            case "Fiesta":
                return pre + "ford_fiesta" + post;
            case "Focus":
                return pre + "ford_focus" + post;
            case "Mondeo":
                return pre + "ford_mondeo" + post;
            case "Ghibli":
                return pre + "maserati_ghibli" + post;
            case "Quattroporte":
                return pre + "maserati_quattroporte" + post;
            case "Astra":
                return pre + "opel_astra" + post;
            case "Corsa":
                return pre + "opel_corsa" + post;
            case "Mokka":
                return pre + "opel_mokka" + post;
            case "Cayenne":
                return pre + "porsche_cayenne" + post;
            case "Panamera":
                return pre + "porsche_panamera" + post;
            case "911 Turbo":
                return pre + "porsche_911" + post;
            case "Veyron":
                return pre + "bugatti_veyron" + post;
            case "CCX":
                return pre + "koenigsegg_ccx" + post;
            case "Huayra":
                return pre + "pagani_huayra" + post;
            case "Gallardo":
                return pre + "lamborghini_gallardo" + post;
            case "GT":
                return pre + "ford_gt" + post;
            default:
                return "";
        }
        
        
    }
    public String getPrijsFormat() {
    	DecimalFormatSymbols dfs = new DecimalFormatSymbols();
       	dfs.setDecimalSeparator(',');
       	dfs.setGroupingSeparator('.');
       	DecimalFormat df = new DecimalFormat("#,##0.-", dfs);
       	double prijs = (double) this.getPrijs();
       	String sPrijs = df.format(prijs);
       	return sPrijs;
    }
}
