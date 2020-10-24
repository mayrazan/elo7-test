/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Movimento;

/**
 * @author mayra
 *
 */
public class MovimentoTest {

	@Test
	public void test() {
		assertEquals("M", Movimento.MOVE.toString());
        assertEquals("L", Movimento.LEFT.toString());
        assertEquals("R", Movimento.RIGTH.toString());
	}

}
