package rules_engine;

public class Start {

	
	/**
	 * The customer can order a 
	 * 
	 * 
	 * 
	 */
	
	public Start() {
		
		Regel regelKundeKannOrdern = new Regel("Falls outlet an einer Kundenadresse existiert, dann kann der Kunde an der Adresse bestellen");
		Regel regelKundeKannBlechen = new Regel("Falls an Adresse Bestellbarkeit exisitert, dann bestellt der Kunde das Produkt Internet");
		SemantischerBaumCoverter sb = new SemantischerBaumCoverter();
		RegelNomalisiert rn = sb.konvertieren(regelKundeKannOrdern);
		
		
		
		// if address has cable-outlet
		// if outletExists equals 1 
		
		// Operator -> + - =
		// Left Operand outletExists
		// Right Operand 1
		// Expression: outletExists equals 1

		WertEinheit wLinksDoesOutletExist = new WertEinheit(0);
		WertEinheit wRechtsOutletExists = new WertEinheit(0);
		
		
	}

	public static void main(String[] args) {
		new Start();
		
	}

}
