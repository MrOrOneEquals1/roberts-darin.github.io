package calculations;

import calculations.ApplicationController;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class MathStart {

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathCalculatorView mcv = new MathCalculatorView();
		try {
			mcv.doMathInput();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}