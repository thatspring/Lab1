package polynomial;

import static org.junit.Assert.*;

import org.junit.Test;

public class PolynomialTest3 {


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
