package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
    public void testMultipleNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }
	@Test
        public void testOneNumberAgain() {
                assertEquals(5, Calculator.add("5"));
        }

	@Test
	public void testWithNewline(){
		assertEquals(4, Calculator.add("1\n3"));
	}
	
	@Test
        public void testWitwNegative() 
        {
		RuntimeExeption ex = null;
		try
		{
			StingCalculator.add("2,-4,3-5");
		} catch (RuntimeExeption e)
		{ exeption = e;
		assertNotNull(exception);
                assertEquals("Negatives not allowed: [-4, -5]"), ex.getMessage());
        }
	@Test
	public void testWithDelimiter() 
	{
		assertEquals(3, Calculator.add("\\;\n1;2"));
	}
}
