package calculations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowerTest {

	@Test
	void test() {
		MathPower test = new MathPower();
		double output = test.execute(4, 3);
		assertEquals(64, output);
	}

}
