package br.com.db1.exercicio08;

public enum TipoLogradouro {
	
	AVENIDA("AVENIDA"),
	RUA("RUA");

private String tipoLogradouro;
	
	TipoLogradouro(String tipoLogradouro){
		this.tipoLogradouro = tipoLogradouro;
	}
	public String tipoLogradouro(){
		return tipoLogradouro;
	}
	
}
