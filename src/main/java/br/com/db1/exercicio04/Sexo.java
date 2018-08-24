package br.com.db1.exercicio04;

public enum Sexo {
	
	MASCULINO("MASCULINO"),
	FEMININO("FEMININO");
		
	private String sexo;
	
	Sexo(String sexo){
		this.sexo = sexo;
	}
	public String sexo(){
		return sexo;
	}

}
