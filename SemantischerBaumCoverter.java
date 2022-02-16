package rules_engine;

import java.util.StringTokenizer;
import java.util.Vector;

public class SemantischerBaumCoverter {

	// Regel auf gueltiges Format prueft
	// Die einzelnen Woerter aus der Regel parsed
	
	public SemantischerBaumCoverter() {
	}
	
	public RegelNomalisiert konvertieren(Regel regel){
		
		String ganzeRegelAlsText = regel.formulierung;
		StringTokenizer st = new StringTokenizer(ganzeRegelAlsText);
		System.out.println(st.countTokens());
		
		Vector<String> alleWoerter = new Vector<>();
		String wort;
		
		 while(st.hasMoreTokens()){
	      wort = st.nextToken();
	      alleWoerter.add(wort);	      
	    }
		 
		 if(alleWoerter.get(0).equalsIgnoreCase("IF")){
			 System.out.println("Ich als Regelconvertierer mache jetzt weiter");
		 }
		 else{
			 System.out.println("Regel fehlerhaft");
			 System.exit(1);
		 }
		 
		WertEinheit wLinksDoesOutletExist = new WertEinheit(0);
		WertEinheit wRechtsOutletExists = new WertEinheit(0);
		
		return new RegelNomalisiert();
	}

}
