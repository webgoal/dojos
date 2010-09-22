package br.com.webgoal.arma;

import br.com.webgoal.Resultado;

public class Papel extends Arma{
	
	public Resultado lutarContra(Arma arma) {
		if (arma instanceof Tesoura)
			return Resultado.PERDE;
		else if (arma instanceof Pedra)
			return Resultado.GANHA;
		return Resultado.EMPATA;
	}

}
