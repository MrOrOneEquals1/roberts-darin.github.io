package calculations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	void test() {
		MathAddition test = new MathAddition();
		double output = test.execute(5, 9);
		assertEquals(14, output);
	}

}
