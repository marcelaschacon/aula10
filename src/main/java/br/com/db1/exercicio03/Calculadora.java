package br.com.db1.exercicio03;

public class Calculadora {
	private Double resultado;
	
public Calculadora(){
		zerarCalculo();
	}
	
	public void zerarCalculo(){
		resultado = 0d;
	}
	public void somar(Double primeiroValor, Double segundoValor){
		resultado = primeiroValor + segundoValor;
	}
	public void subtrair(Double primeiroValor, Double segundoValor){
		resultado = primeiroValor - segundoValor;
	}
	public void dividir(Double primeiroValor, Double segundoValor){
		resultado = primeiroValor / segundoValor;
	}
	public void multiplicar(Double primeiroValor, Double segundoValor){
		resultado = primeiroValor * segundoValor;
	}
	public Double exibirResultado(){
		return resultado;
	}
}
