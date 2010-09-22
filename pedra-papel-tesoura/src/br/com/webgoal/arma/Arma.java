package br.com.webgoal.arma;

import br.com.webgoal.Resultado;

public abstract class Arma {

	public static Arma novaInstanciaDe(String arma) {
		if (arma.equals("pedra")) {
			return new Pedra();
		} else if (arma.equals("tesoura")) {
			return new Tesoura();
		} else if (arma.equals("papel")) {
			return new Papel();
		}

		return null;
	}

	public abstract Resultado lutarContra(Arma arma);

}
