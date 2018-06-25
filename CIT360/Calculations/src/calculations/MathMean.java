package calculations;

import static java.lang.Math.sqrt;

public class MathMean implements DoMathCalculation {
    
    public double execute(int number1, int number2) {
        double result = Math.sqrt(number1*number2);
        return result;
    }
}
