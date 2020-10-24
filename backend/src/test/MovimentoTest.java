/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Movimento;

/**
 * @author mayra
 *
 */
public class MovimentoTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("M", Movimento.MOVE.toString());
        assertEquals("L", Movimento.LEFT.toString());
        assertEquals("R", Movimento.RIGTH.toString());
	}

}
