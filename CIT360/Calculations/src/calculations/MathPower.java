package calculations;

import static java.lang.Math.pow;

public class MathPower implements DoMathCalculation {
    
    public double execute(int number1, int number2) {
        double result = pow(number1,number2);
        return result;
    }
}
