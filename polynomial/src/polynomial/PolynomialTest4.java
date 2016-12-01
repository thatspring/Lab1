package polynomial;


import static org.junit.Assert.*;

import org.junit.Test;

public class PolynomialTest4 {

	
	@Test
	public void testSimplify() {
		Polynomial poly = new Polynomial();
		String[] testExpre = {"1","2*x*y","3*x*z"};
		String[] testValue = {"x","1 y=2"};
		String result = poly.Simplify(testExpre, testValue);
		String expectResult = "Error";
		//assertEquals(expectResult, result);
	}

	@Test
	public void testDerivative() {
		Polynomial poly = new Polynomial();
		String[] testExpre = {"1","2*x*y","3*x*z"};
		String testValue = "x y";
		String result = poly.Derivative(testExpre, testValue);
		String expectResult = "Error";
		assertEquals(expectResult, result);
	}
	public void testcmd_pro() {
		simplify poly = new simplify();
		String testExpre = "!Simplify x=1";
		int flag = 0;
		String testValue = "x y";
		String result = poly.cmd_pro(testExpre, flag);
		String expectResult = "1+2*y";
		assertEquals(expectResult, result);
	}
}
	
