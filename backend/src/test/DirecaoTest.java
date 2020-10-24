/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Direcao;

/**
 * @author mayra
 *
 */
public class DirecaoTest {

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
	public void testDirecao() {
		assertEquals("N", Direcao.NORTH.toString());
        assertEquals("S", Direcao.SOUTH.toString());
        assertEquals("E", Direcao.EAST.toString());
        assertEquals("W", Direcao.WEST.toString());
	}

}
