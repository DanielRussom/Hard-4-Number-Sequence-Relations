package numbersequencerelations;

public class Controller {

	public static void main(String[] args) {
		new Controller();
	}

	Controller(){
		// Initial problem sets
		int[] problemSet1 = { 4, 2, 8 };
		evaluateProblemSet(problemSet1);
		int[] problemSet2 = { 6, 2, 12 };
		evaluateProblemSet(problemSet2);
		int[] problemSet3 = { 6, 2, 3 };
		evaluateProblemSet(problemSet3);
		int[] problemSet4 = { 9, 12, 108 };
		evaluateProblemSet(problemSet4);
		int[] problemSet5 = { 4, 16, 64 };
		evaluateProblemSet(problemSet5);
	}
	
	public void evaluateProblemSet(int[] problemSet) {
		Equation[] results = generateResults(problemSet[0], problemSet[1]);
		compareValue(results, problemSet[2]);
	}
	
	public Equation[] generateResults(int firstNumber, int secondNumber) {
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
	 * @param results
	 * @param number
	 */
	public void compareValue(Equation[] results, int number) {
		for(int i = 0; i < results.length; i++) {
			if(results[i].getResult() == number) {
				System.out.println(results[i].getEquation() + " = " + number);
			}
		}
	}
}
