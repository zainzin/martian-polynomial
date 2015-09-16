package p4_testing;
import static org.junit.Assert.*;

import org.junit.Test;

import p4_martianpolynomial.MartianPolynomial;
import p4_utility.MyDouble;




public class YourTests {
	//SOME EXAMPLE JUNIT TESTS TO GET YOU STARTED THINKING ABOUT 
	//  WRITING JUNIT TESTS  
	//You'll want to un-comment them one by one as you go...
	
	
	
	@Test
	public void testDefaultConstructor() {
		MartianPolynomial testPoly = new MartianPolynomial();
		assertTrue(testPoly.getA().isZero()
				&& testPoly.getB().isZero()
				&& testPoly.getC().isZero());
	}
	
	@Test
	public void testSingleValConstructor() {
		MyDouble cVal = new MyDouble(27.8);
				
		MartianPolynomial testPoly = new MartianPolynomial(cVal);
		assertTrue(testPoly.getA().isZero()
				&& testPoly.getB().isZero()
				&& testPoly.getC().equals(cVal));
	}

	@Test
	public void testThreeValConstructor() {
		MyDouble aVal = new MyDouble(15.7);
		MyDouble bVal = new MyDouble(-23.7);
		MyDouble cVal = new MyDouble(4.3);
				
		MartianPolynomial testPoly = new MartianPolynomial(aVal, bVal, cVal);
		assertTrue(testPoly.getA().equals(aVal)
				&& testPoly.getB().equals(bVal)
				&& testPoly.getC().equals(cVal));
	}

	@Test
	public void testEval() {
		MyDouble aVal = new MyDouble(2);
		MyDouble bVal = new MyDouble(4);
		MyDouble cVal = new MyDouble(8);
		
		MartianPolynomial testPoly = new MartianPolynomial(aVal, bVal, cVal);
		assertTrue(testPoly.eval(new MyDouble(0)).equals(new MyDouble(8)));
		assertTrue(testPoly.eval(new MyDouble(1)).equals(new MyDouble(14)));
		assertTrue(testPoly.eval(new MyDouble(2)).equals(new MyDouble(24)));
		assertTrue(testPoly.eval(new MyDouble(3)).equals(new MyDouble(38)));
	}

	
	//YOU NEED TO IMPLEMENT AT LEAST THESE JUNIT TESTS BELOW
	@Test
	public void testGetters() {
		
	}

	@Test
	public void testAdd() {
		
	}

	@Test
	public void testSubtract() {
		
	}

	@Test
	public void testGlorp() {
		
	}

	@Test
	public void testSplee() {
		
	}

	@Test
	public void testCliff() {
		
	}

	@Test
	public void testEqualsAndCompareTo() {
		
	}

	@Test
	public void testToString() {
		
	}
	
	
}
