/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Direcao;

/**
 * @author mayra
 *
 */
public class DirecaoTest {

	@Test
	public void testDirecao() {
		assertEquals("N", Direcao.NORTH.toString());
        assertEquals("S", Direcao.SOUTH.toString());
        assertEquals("E", Direcao.EAST.toString());
        assertEquals("W", Direcao.WEST.toString());
	}

}
