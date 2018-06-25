package calculations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class subtractTest {

	@Test
	void test() {
		MathSubtraction test = new MathSubtraction();
		double output = test.execute(9, 2);
		assertEquals(7, output);
	}

}
