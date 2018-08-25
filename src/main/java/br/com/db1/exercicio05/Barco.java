package br.com.db1.exercicio05;

public class Barco extends TransporteAquatico {

	private Boolean pesqueiro;
	
	public Boolean isPesqueiro(){
		return Boolean.TRUE;
	}

	public Boolean getPesqueiro() {
		return pesqueiro;
	}

	public void setPesqueiro(Boolean pesqueiro) {
		this.pesqueiro = pesqueiro;
	}
	
}
