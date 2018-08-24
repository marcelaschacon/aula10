package br.com.db1.exercicio03;

public class Calculadora {
	private Double resultado, primeiroValor, segundoValor;
	
public Calculadora(){
		
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Double getPrimeiroValor() {
		return primeiroValor;
	}

	public void setPrimeiroValor(Double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}

	public Double getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}
	
	public void zerarCalculo(Double resultado){
		resultado = (double) 0;
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
