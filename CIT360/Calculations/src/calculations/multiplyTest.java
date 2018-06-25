package calculations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class multiplyTest {

	@Test
	void test() {
		MathMultiplication test = new MathMultiplication();
		double output = test.execute(9, 2);
		assertEquals(18, output);
	}

}
