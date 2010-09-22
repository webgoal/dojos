package br.com.webgoal.test;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import br.com.webgoal.*;
import br.com.webgoal.arma.Papel;
import br.com.webgoal.arma.Pedra;
import br.com.webgoal.arma.Tesoura;

public class PapelTest extends TestCase{

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testLutarPapelContraPedra(){
		assertEquals(Resultado.GANHA, (new Papel()).lutarContra(new Pedra()));
	}
	
	@Test
	public void testLutarPapelContraTesoura(){
		assertEquals(Resultado.PERDE, (new Papel()).lutarContra(new Tesoura()));
	}
	
	@Test
	public void testLutarPapelContraPapel(){
		assertEquals(Resultado.EMPATA, (new Papel()).lutarContra(new Papel()));
	}
	
}
