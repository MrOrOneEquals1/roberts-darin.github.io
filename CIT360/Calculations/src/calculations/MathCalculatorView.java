package calculations;

import calculations.ApplicationController;
import java.io.IOException;
import java.util.Scanner;

public class MathCalculatorView {
    
    public void MathCalculatorView() {
        
    }
    
    public void doMathInput() throws IOException {
        ApplicationController handle = new ApplicationController();
        int number1;
        int number2;
        String operator;
        
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter your first number: ");
            number1 = Integer.parseInt(in.nextLine());
            System.out.println("Enter a math operator (+, -, *, /, ^, Mean): ");
            operator = in.nextLine();
            System.out.println("Enter your second number: ");
            number2 = Integer.parseInt(in.nextLine());

            System.out.print("\n" + number1 + " " + operator + " " + number2 + " = ");
            System.out.println(handle.handleMathCommands(operator, number1, number2));
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
