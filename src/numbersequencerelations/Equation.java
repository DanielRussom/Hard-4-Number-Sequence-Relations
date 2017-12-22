package numbersequencerelations;

public class Equation {
	private int result;
	private String equation;
	
	/**
	 * @param result
	 * @param equation
	 */
	public Equation(int result, String equation) {
		super();
		this.result = result;
		this.equation = equation;
	}

	public int getResult() {
		return result;
	}

	public String getEquation() {
		return equation;
	}	
}
