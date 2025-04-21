package br.dev.gabriel.tabuada.model;

public class Tabuada {
	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}

	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}

	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

<<<<<<< HEAD
	public void mostrarTabuada() {
		if (minimoMultiplicador > maximoMultiplicador) {
			double troca = minimoMultiplicador;
=======
	public String[] mostrarTabuada() {

		if (minimoMultiplicador > maximoMultiplicador) {
			double troca;
			troca = minimoMultiplicador;
>>>>>>> a86f7df (Painel e scroll adicionados)
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = troca;
		}

<<<<<<< HEAD
		System.out.println("TABUADA DO " + multiplicando);
		System.out.println("===================================");
		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			System.out.println(multiplicando + " * " + minimoMultiplicador + " = " + produto);
			minimoMultiplicador++;
		}
		System.out.println("FIM DA TABUADA DO " + multiplicando);
		System.out.println("===================================");
=======
		// Criar vetor que vai guardar a tabuada
		// Cada elemento do vetor será uma linha da tabuada
		int i = 0;
		double tamanhoLista = (maximoMultiplicador - minimoMultiplicador) + 1;
		String[] tabuada = new String[(int) tamanhoLista];

		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			tabuada[i] = multiplicando + " X " + minimoMultiplicador + " = " + produto;
			minimoMultiplicador++;
			i++;
		}

		return tabuada;

>>>>>>> a86f7df (Painel e scroll adicionados)
	}

}