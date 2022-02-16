package rules_engine;

public class RegelNomalisiert {

	LinkerOperand linkerOperand;
	RechterOperand rechterOperand;
	Operator operator;
	
	public RegelNomalisiert() {
		linkerOperand = new LinkerOperand("outlet Customer", new WertEinheit(1));
		rechterOperand = new RechterOperand("Parameter Outlet existiert", new WertEinheit(1));
		operator = new Operator(Operator.Typ.EQUALS);
	}
	

}
