package br.com.db1.exercicio06;

public class Endereco extends Restaurante{

	private String logradouro;
	
	private Integer cep;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}
	
	public String exibirCepFormatado(){
		 
	}
}
