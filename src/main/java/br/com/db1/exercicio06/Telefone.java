package br.com.db1.exercicio06;

public class Telefone extends Restaurante{

	private Integer ddd, numero;
	
	public String exibirTelefoneFormatado(){
		return "(" + ddd + ")" + numero;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
}
