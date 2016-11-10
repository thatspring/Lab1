package polynomial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PolynomialTest3 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSimplify() {
		Polynomial poly = new Polynomial();
		String[] testExpre = {"1","2*x*y","3*x*z"};
		String[] testValue = {"m","2"};
		String result = poly.Simplify(testExpre, testValue);
		String expectResult = "Error, no variable";
		//assertEquals(expectResult, result);
	}

	@Test
	public void testDerivative() {
		Polynomial poly = new Polynomial();
		String[] testExpre = {"1","2*x*y","3*x*z"};
		String testValue = "m";
		String result = poly.Derivative(testExpre, testValue);
		String expectResult = "Error, no variable";
		assertEquals(expectResult, result);
	}

}
