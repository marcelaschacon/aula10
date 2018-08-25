package br.com.db1.exercicio06;

import java.util.Date;

public class Pedido extends Restaurante{

	private Integer numero, numeroMesa;
	
	private Date dataPedido;
	
	public void cadastrarPedido(){
		
	}
	public void fecharPedido(){
		
	}
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	
}
