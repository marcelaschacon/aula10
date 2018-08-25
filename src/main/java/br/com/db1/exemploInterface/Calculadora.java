package br.com.db1.exemploInterface;

import br.com.db1.exemploInterface.OperacaoMatematica;

public class Calculadora {
	private Integer resultado;
	
	public Calculadora() {
		zerarCalculo();
	}
	
	public void realizarCalculo(OperacaoMatematica operacao, Integer valor1, Integer valor2){
		resultado = operacao.calcula(valor1, valor2);
	}

	public void zerarCalculo() {
		resultado = 0;
	}

	public Integer exibirResultado() {
		return resultado;
	}
}