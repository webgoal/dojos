package br.com.webgoal;

import br.com.webgoal.arma.Arma;

public class Ppt {
	
	public static void main(String[] args) {
		if (args.length == 2 ) {
			Arma arma1 = Arma.novaInstanciaDe(args[0]);
			Arma arma2 = Arma.novaInstanciaDe(args[1]);
			
			try {
				Resultado resultado = arma1.lutarContra(arma2);
				if (resultado == Resultado.GANHA) {
					System.out.println(arma1.getClass().getName() + " ganha");
				} else if (resultado == Resultado.EMPATA){
					System.out.println(arma1.getClass().getName() + " empata com " + arma2.getClass().getName());
					
				} else {
					System.out.println(arma2.getClass().getName() + " ganha");
				}
			} catch (Exception e) {
				System.out.println("erro");
			}
			
		} else {
			System.out.println("Voce deve informar 2 armas entre (Papel, Tesoura ou Pedra)");
		}
	}
}
