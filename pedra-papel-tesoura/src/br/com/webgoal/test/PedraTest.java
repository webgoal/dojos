package br.com.webgoal.test;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import br.com.webgoal.*;
import br.com.webgoal.arma.Papel;
import br.com.webgoal.arma.Pedra;
import br.com.webgoal.arma.Tesoura;

public class PedraTest extends TestCase{

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testLutarPedraContraTesoura(){
		assertEquals(Resultado.GANHA, (new Pedra()).lutarContra(new Tesoura()));
	}
	
	@Test
	public void testLutarPedraContraPapel(){
		assertEquals(Resultado.PERDE, (new Pedra()).lutarContra(new Papel()));
	}
	
	@Test
	public void testLutarPedraContraPedra(){
		assertEquals(Resultado.EMPATA, (new Pedra()).lutarContra(new Pedra()));
	}
}
