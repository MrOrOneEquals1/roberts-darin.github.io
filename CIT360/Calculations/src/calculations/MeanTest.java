package calculations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MeanTest {

	@Test
	void test() {
		MathMean test = new MathMean();
		double output = test.execute(4, 9);
		assertEquals(6, output);
	}

}
