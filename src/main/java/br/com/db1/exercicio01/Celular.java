package br.com.db1.exercicio01;

public class Celular {

	private String operadora, marca;
	
	private Boolean dualChip;
	
	private Double tamanhoTela;
	
	public boolean temSinal(){
		return Boolean.TRUE;
	
	}	

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Boolean getDualChip() {
		return dualChip;
	}

	public void setDualChip(Boolean dualChip) {
		this.dualChip = dualChip;
	}

	public Double getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(Double tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

}