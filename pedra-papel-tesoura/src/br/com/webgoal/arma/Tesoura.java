package br.com.webgoal.arma;

import br.com.webgoal.Resultado;

public class Tesoura extends Arma {
	
	public Resultado lutarContra(Arma arma) {
		if (arma instanceof Papel)
			return Resultado.GANHA;
		else if (arma instanceof Pedra)
			return Resultado.PERDE;
		return Resultado.EMPATA;
	}

}
