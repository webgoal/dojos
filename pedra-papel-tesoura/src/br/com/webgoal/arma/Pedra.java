package br.com.webgoal.arma;

import br.com.webgoal.Resultado;

public class Pedra extends Arma {
	
	public Resultado lutarContra(Arma arma) {
		if (arma instanceof Tesoura)
			return Resultado.GANHA;
		else if (arma instanceof Papel)
			return Resultado.PERDE;
		return Resultado.EMPATA;
	}

}
