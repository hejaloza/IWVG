package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	
	private Fraction frac;
	
	  @Before
	    public void before() {
	        frac = new Fraction(2, 3);
	    }
	  
	  @Test
	  public void testFraccionNumeradorDenominador() {
	        assertEquals(2, frac.getNumerator());
	        assertEquals(3, frac.getDenominator());
	    }
	  

	  @Test
	  public void testDecimal() {
		  assertEquals(0.66, frac.decimal(), 10e-3);
	    }


}
