package polynomial;

import static org.junit.Assert.*;

import org.junit.Test;

public class PolynomialWhite1 {

	@Test
	public void testSimplify() {
		Polynomial poly = new Polynomial();
		String[] testExpre = {"-2","-2*x","-2*y"};
		String[] testValue = {"y","-1"};
		String result = poly.Simplify(testExpre, testValue);
		String expectResult = "-2*x";
		assertEquals(expectResult, result);
	}

}
