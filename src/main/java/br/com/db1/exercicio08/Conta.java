package br.com.db1.exercicio08;

public abstract class Conta {

	private Integer numero;
	
	private String digitoVerificar;
	
	private Pessoa pessoa;
	
	private Agencia agencia;
	
	private Banco banco;
	
	public Conta(Pessoa pessoa, Agencia agencia){
		this.pessoa = pessoa;
		this.agencia = agencia;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDigitoVerificar() {
		return digitoVerificar;
	}

	public void setDigitoVerificar(String digitoVerificar) {
		this.digitoVerificar = digitoVerificar;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void calcularDigitoVerificador(){
		
	}
	
	public Boolean validarDigitoVerificador(){
		return null;

	}
	
}
