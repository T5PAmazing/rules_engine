package rules_engine;

public class WertEinheit {

	public enum Typ {
    ZEICHEN, ZAHL
    }
	
	private String wertAlsZeichen;
	private double wertAlsZahl;
	private Typ typ;
	
	public WertEinheit(double d) {
		this.typ = Typ.ZAHL;
		this.wertAlsZahl = d;
	}

	public WertEinheit(String s) {
		this.typ = Typ.ZEICHEN;
		this.wertAlsZeichen = s;
	}


	public Typ getTyp() {
		return typ;
	}
	
	public Double getWertAlsZahl(){
		return this.wertAlsZahl;
	}
	
	public String getWertAlsZeichen(){
		return this.wertAlsZeichen;
	}
	
	
	

}
