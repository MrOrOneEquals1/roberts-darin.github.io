package JUnit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

class JUnitTests {

	@Test
	public void testAssertNotSame() throws Exception {
		String test1 = new String("NBA");
		String test2 = new String("NBA");
		String test3 = "NBA";
		String test4 = "NBA";
		String test5 = null;

		assertNull(test5);
		assertNotNull(test1);
		assertNotSame(test1, test5);
		assertSame(test3, test4);
	}

	@Test
	public void testAssertThat() throws Exception {
		int x = 5;
		assertThat(x, is(5));
	}

    @Test
    public void testArrayEquals() throws Exception {
        String[] Array1 = {"A","B","C","D","E","F","G"};       
        String[] Array2 = {"A","B","C","D","E","F","G"};
        assertArrayEquals(Array1, Array2);
    } 

    public void testAssertFalseTrue(){
        double payment1 = 200.0;
        double payment2 = 350.0;
        double payment3 = 150.0;
        double totalpayment = payment1 + payment2 + payment3;
        assertFalse(totalpayment > 800.0);
        assertTrue(totalpayment > 600.0);
        
    }

}