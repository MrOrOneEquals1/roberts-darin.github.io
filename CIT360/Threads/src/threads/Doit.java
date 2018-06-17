package threads;

import java.util.concurrent.ExecutionException;

public class Doit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorServiceExample es = new ExecutorServiceExample();
		try {
			es.ExecutorServiceExample();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
