// The Model performs all the calculations needed
// and that is it. It doesn't know the View 
// exists
package calculator;

public class CalculatorModel {

	// Holds the value of the sum of the numbers
	// entered in the view
	
	private double calculationValue;
	
	public void doCalc(int firstNumber, int secondNumber, String function){
		if(function=="+") {
			calculationValue = firstNumber + secondNumber;
		}
		else if(function=="-") {
			calculationValue = firstNumber - secondNumber;
		}
		else if(function=="*") {
			calculationValue = firstNumber * secondNumber;
		}
		else{
			calculationValue = firstNumber / (double) secondNumber;
		}
		
	}
	
	
	
	public double getCalculationValue(){
		
		return calculationValue;
		
	}
	
}