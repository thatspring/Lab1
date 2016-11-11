package polynomial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PolynomialTest2 {

	@Before
	public void setUp() throws Exception {
	}


	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSimplify() {
		//fail("Not yet implemented");
		Polynomial poly = new Polynomial();
		String[] testExpre = {"1","2*x*y","3*x*z"};
		String[] testValue = {"2",""};
		String result = poly.Simplify(testExpre, testValue);
		String expectResult = "Error";
		//assertEquals(expectResult, result);
	}
	@Test
	public void testDerivative() {
		//fail("Not yet implemented");
		Polynomial poly = new Polynomial();
		String[] testExpre = {"1","2*x*y","3*x*z"};
		String testValue = "";
		String result = poly.Derivative(testExpre, testValue);
		String expectResult = "Error";
		//assertEquals(expectResult, result);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testExpression() {
		//fail("Not yet implemented");
		Polynomial poly = new Polynomial();
		String testExample = "1+2^x";
		String[] result = poly.expression(testExample);
		String[] expectResult = {"illegal char"};
		//assertEquals(expectResult,result);
	}

}
