/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Direcao;
import main.Posicao;

/**
 * @author mayra
 *
 */
public class PosicaoTest {

	/**
	 * @throws java.lang.Exception
	 */
	private Posicao posicao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		posicao = new Posicao(2,3,Direcao.SOUTH);
	}

	@Test
	public void testCoordenadas() {
		assertEquals(2, posicao.getX());
		assertEquals(3, posicao.getY());
	}
	
	@Test
	public void testDirecao() {
		assertEquals(Direcao.SOUTH, posicao.getDirecao());	
	}
	
	@Test
	public void testPosicaoNegativa() throws IllegalArgumentException {
		new Posicao(-1,-3, Direcao.NORTH);
	}

}
