package numbersequencerelations;

public class Controller {

	public static void main(String[] args) {
		new Controller();
	}

	Controller() {
		System.out.println("Sets of 3");
		// Initial problem sets
		double[] problemSet1 = { 4, 2, 8 };
		evaluateProblemSetOf3(problemSet1);
		double[] problemSet2 = { 6, 2, 12 };
		evaluateProblemSetOf3(problemSet2);
		double[] problemSet3 = { 6, 2, 3 };
		evaluateProblemSetOf3(problemSet3);
		double[] problemSet4 = { 9, 12, 108 };
		evaluateProblemSetOf3(problemSet4);
		double[] problemSet5 = { 4, 16, 64 };
		evaluateProblemSetOf3(problemSet5);

		System.out.println("Sets of 4");
		double[] problemSet6 = { 2, 4, 6, 3 };
		evaluateProblemSetOf4(problemSet6);
		double[] problemSet7 = { 1, 1, 2, 3 };
		evaluateProblemSetOf4(problemSet7);
		double[] problemSet8 = { 4, 4, 3, 4 };
		evaluateProblemSetOf4(problemSet8);
		double[] problemSet9 = { 8, 4, 3, 6 };
		evaluateProblemSetOf4(problemSet9);
		double[] problemSet10 = { 9, 3, 1, 7 };
		evaluateProblemSetOf4(problemSet10);

	}

	/**
	 * Evaluates a problem set of 3
	 * 
	 * @param problemSet
	 *            - Problem set
	 */
	public void evaluateProblemSetOf3(double[] problemSet) {
		// Generates all possible results for first two numbers in problem set
		Equation[] results = generateResults(problemSet[0], problemSet[1]);
		// Compares results with the third value
		compareValue(results, problemSet[2]);
	}

	/**
	 * Evaluates a problem set of 4
	 * 
	 * @param problemSet
	 *            - Problem set
	 */
	public void evaluateProblemSetOf4(double[] problemSet) {
		// Generates all possible results for passed in numbers from problem set
		Equation[] results1 = generateResults(problemSet[0], problemSet[1]);
		Equation[] results2 = generateResults(problemSet[2], problemSet[3]);
		// Compares arrays of results
		compareValue(results1, results2);

		results1 = generateResults(problemSet[0], problemSet[2]);
		results2 = generateResults(problemSet[1], problemSet[3]);
		compareValue(results1, results2);

		results1 = generateResults(problemSet[0], problemSet[3]);
		results2 = generateResults(problemSet[1], problemSet[2]);
		compareValue(results1, results2);
	}

	public Equation[] generateResults(double firstNumber, double secondNumber) {
		Equation[] results = new Equation[6];
		results[0] = new Equation(firstNumber + secondNumber, firstNumber + " + " + secondNumber);
		results[1] = new Equation(firstNumber - secondNumber, firstNumber + " - " + secondNumber);
		results[2] = new Equation(secondNumber - firstNumber, secondNumber + " - " + firstNumber);
		results[3] = new Equation(firstNumber * secondNumber, firstNumber + " * " + secondNumber);
		results[4] = new Equation(firstNumber / secondNumber, firstNumber + " / " + secondNumber);
		results[5] = new Equation(secondNumber / firstNumber, secondNumber + " / " + firstNumber);
		return results;
	}

	/**
	 * Compares values of result array and third value of problem set
	 * 
	 * @param results
	 *            - set of results
	 * @param number
	 *            - third value in problem set
	 */
	public void compareValue(Equation[] results, double number) {
		// Iterates through all results and compares with extra number
		for (int i = 0; i < results.length; i++) {
			// If the result matches, the equation and result are output
			if (results[i].getResult() == number) {
				System.out.println(results[i].getEquation() + " = " + number);
			}
		}
	}

	/**
	 * Compares values of both result arrays
	 * 
	 * @param results1
	 *            - first set of results
	 * @param results2
	 *            - second set of results
	 */
	private void compareValue(Equation[] results1, Equation[] results2) {
		// Iterates through all results and compares them together
		for (int i = 0; i < results1.length; i++) {
			for (int j = 0; j < results2.length; j++) {
				// If two results match, the equations used to calculate and results are output
				if (results1[i].getResult() == results2[j].getResult()) {
					System.out.println(results1[i].getEquation() + " = " + results1[i].getResult() + " = "
							+ results2[j].getEquation());
				}
			}
		}
	}
}
