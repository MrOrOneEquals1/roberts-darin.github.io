package calculations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideTest {

	@Test
	void test() {
		MathDivision test = new MathDivision();
		double output = test.execute(15, 3);
		assertEquals(5, output);
	}

}
