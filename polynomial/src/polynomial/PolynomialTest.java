package polynomial;

import static org.junit.Assert.*;

import org.junit.Test;

public class PolynomialTest {

	

	@Test
	public void testSimplify() {
		//fail("Not yet implemented");
		Polynomial poly = new Polynomial();
		String[] testExpre = {"1","2*x*y","3*x*z"};
		String[] testValue = {"x","2"};
		String result = poly.Simplify(testExpre, testValue);
		String expectResult = "1+4*y+6*z";
		assertEquals(expectResult, result);
	}
	//测试
	@Test
	public void testDerivative() {
		//fail("Not yet implemented");
		Polynomial poly = new Polynomial();
		String[] testExpre = {"1","2*x*y","3*x*z"};
		String testValue = "x";
		String result = poly.Derivative(testExpre, testValue);
		String expectResult = "2*y+3*z";
		assertEquals(expectResult, result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testExpression() {
		//fail("Not yet implemented");
		Polynomial poly = new Polynomial();
		String testExample = "1+2*x*y+3*x*z";
		String[] result = poly.expression(testExample);
		String[] expectResult = {"1","2*x*y","3*x*z"};
		assertEquals(expectResult,result);
	}
	
}
