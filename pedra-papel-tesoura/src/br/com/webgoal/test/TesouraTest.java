package br.com.webgoal.test;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import br.com.webgoal.*;
import br.com.webgoal.arma.Papel;
import br.com.webgoal.arma.Pedra;
import br.com.webgoal.arma.Tesoura;

public class TesouraTest extends TestCase{

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testLutarTesouraContraPapel(){
		assertEquals(Resultado.GANHA, (new Tesoura()).lutarContra(new Papel()));
	}
	
	@Test
	public void testLutarTesouraContraTesoura(){
		assertEquals(Resultado.EMPATA, (new Tesoura()).lutarContra(new Tesoura()));
	}
	
	@Test
	public void testLutarTesouraContraPedra(){
		assertEquals(Resultado.PERDE, (new Tesoura()).lutarContra(new Pedra()));
	}
}
