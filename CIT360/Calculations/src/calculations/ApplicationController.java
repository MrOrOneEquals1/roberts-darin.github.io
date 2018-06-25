package calculations;

import java.util.HashMap;

public class ApplicationController {
    
    public static HashMap<String, DoMathCalculation> mathCommands = new HashMap<String, DoMathCalculation>();
    
    public void ApplicationController() {
        
    }
    
    public static double handleMathCommands(String operator, int number1, int number2) {
        
        mathCommands.put("+", new MathAddition());
        mathCommands.put("-", new MathSubtraction());
        mathCommands.put("*", new MathMultiplication());
        mathCommands.put("/", new MathDivision());
        mathCommands.put("^", new MathPower());
        mathCommands.put("Mean", new MathMean());

        DoMathCalculation mathCalc = mathCommands.get(operator);
        
        return mathCalc.execute(number1, number2);
    }
    
}
