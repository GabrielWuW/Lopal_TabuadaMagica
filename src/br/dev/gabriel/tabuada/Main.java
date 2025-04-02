package br.dev.gabriel.tabuada;

import br.dev.gabriel.tabuada.model.Tabuada;

public class Main {

	public static void main(String[] args) {
		Tabuada tabuada = new Tabuada();
		
		tabuada.setMultiplicando(2);
		tabuada.setMinimoMultiplicador(1);
		tabuada.setMaximoMultiplicador(90);
		tabuada.mostrarTabuada();
		
		System.out.println(tabuada.getMultiplicando());
	}
}