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
import main.Terreno;

/**
 * @author mayra
 *
 */
public class TerrenoTest {

	/**
	 * @throws java.lang.Exception
	 */
	private Terreno terreno = new Terreno(0,0);
	private Posicao posicao;
	private Sonda s;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		terreno.setTerreno(5, 5);
		posicao = new Posicao(5, 5, Direcao.NORTH);
		s = new Sonda();
	}

	@Test
	public void testLimiteX() {
		assertEquals(5, terreno.tamanhoTerrenoX());
	}
	
	@Test
	public void testLimiteY() {
		assertEquals(5, terreno.tamanhoTerrenoY());
	}

	@Test
	public void testAddSonda() {
		terreno.addSonda(s);
		assertNotNull(terreno.getSonda());
	}
	
	@Test
	public void testTerreno() {
		assertTrue(terreno.tamanhoTerrenoX()>0);
        assertTrue(terreno.tamanhoTerrenoY()>0);
        assertTrue(terreno.tamanhoTerrenoX()>=posicao.getX());
        assertTrue(terreno.tamanhoTerrenoY()>=posicao.getY());
	}
}
