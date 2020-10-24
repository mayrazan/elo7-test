/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Direcao;
import main.Posicao;
import main.Sonda;

/**
 * @author mayra
 *
 */
public class SondaTest {

	/**
	 * @throws java.lang.Exception
	 */
	private Posicao p;
	private Sonda s;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		p = new Posicao(0,0,Direcao.NORTH);
		s = new Sonda();
	}

	@Test
	public void testMover() {
		p.setX(1);
		p.setY(2);
		s.mover(p);
		assertEquals(1, p.getX());
		assertEquals(3, p.getY());
	}
	
	@Test
	public void testViraDireita() {
		s.viraDireita(p);
		assertEquals(Direcao.EAST, p.getDirecao());
		
	}

	@Test
	public void testViraEsquerda() {
		s.viraEsquerda(p);
		assertEquals(Direcao.WEST, p.getDirecao());
	}
}
