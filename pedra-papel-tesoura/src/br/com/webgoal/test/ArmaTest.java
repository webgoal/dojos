package br.com.webgoal.test;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import br.com.webgoal.Resultado;
import br.com.webgoal.arma.Arma;
import br.com.webgoal.arma.Papel;
import br.com.webgoal.arma.Pedra;
import br.com.webgoal.arma.Tesoura;

public class ArmaTest extends TestCase{

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testArmaPapel() {
		Papel papel = new Papel();
		assertTrue(papel instanceof Arma);
	}
	
	@Test
	public void testArmaPedra() {
		Pedra pedra =  new Pedra();
		assertTrue(pedra instanceof Arma);
	}
	
	@Test
	public void testArmaTesoura() {
		Tesoura tesoura = new Tesoura();
		assertTrue(tesoura instanceof Arma);
	}
	
	@Test
	public void testLutarPapelContraPedra(){
		assertEquals(Resultado.PERDE, (new Pedra()).lutarContra(new Papel()));
	}
	
	@Test
	public void testNovaInstanciaDe(){
		assertTrue(Arma.novaInstanciaDe("pedra") instanceof Pedra);
		assertTrue(Arma.novaInstanciaDe("papel") instanceof Papel);
		assertTrue(Arma.novaInstanciaDe("tesoura") instanceof Tesoura);
		assertEquals(Arma.novaInstanciaDe("non-ecsiste"), null);
	}

}
