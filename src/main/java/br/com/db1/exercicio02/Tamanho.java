package br.com.db1.exercicio02;

public enum Tamanho {
	PEQUENO("P"),
	MEDIO("M"),
	GRANDE("G");

	private String tamanho;
	
	Tamanho(String tamanho){
		this.tamanho = tamanho;
	}
	public String tamanho(){
		return tamanho;
	}
}
