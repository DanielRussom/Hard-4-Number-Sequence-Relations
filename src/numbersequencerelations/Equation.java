package numbersequencerelations;

public class Equation {
	private double result;
	private String equation;
	
	/**
	 * @param result
	 * @param equation
	 */
	public Equation(double result, String equation) {
		super();
		this.result = result;
		this.equation = equation;
	}

	public double getResult() {
		return result;
	}

	public String getEquation() {
		return equation;
	}	
}
