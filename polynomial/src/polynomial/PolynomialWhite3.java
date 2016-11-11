package polynomial;

import static org.junit.Assert.*;

import org.junit.Test;

public class PolynomialWhite3 {

	@Test
	public void testSimplify() {
		Polynomial poly = new Polynomial();
		String[] testExpre = {"2","3*x","4*y"};
		String[] testValue = {"x","1"};
		String result = poly.Simplify(testExpre, testValue);
		String expectResult = "5+4*y";
		assertEquals(expectResult, result);
	}

}
