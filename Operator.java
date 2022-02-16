package rules_engine;

import rules_engine.WertEinheit.Typ;

public class Operator {

	private Typ typ;
	
	public enum Typ {
    EQUALS, GREATER, SMALLER, GREATER_EQUALS, SMALLER_EQUALS
    }

	public Operator(Typ typ) {
		this.typ = typ;
	}

}
