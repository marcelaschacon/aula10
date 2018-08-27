package br.com.db1.exercicio08;

public class Endereco {

	private TipoLogradouro tipologradouro;
	
	private String logradouro;
	
	private Integer cep;
	
	public String exibirCepFormatado() {
		String temp = Integer.toString(cep);
		return temp.substring(0, 5) + "-" + temp.substring(5);
	}
	
	public TipoLogradouro getTipologradouro() {
		return tipologradouro;
	}

	public void setTipologradouro(TipoLogradouro tipologradouro) {
		this.tipologradouro = tipologradouro;
	}

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
	
}
