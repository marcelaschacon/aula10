package br.com.db1.exercicio06;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import br.com.db1.exercicio08.Endereco;

public class Restaurante {

	private String nome;
	
	private Boolean serveAlmoco, serveJantar, serveCafeDaManha;
	
	private List <Endereco> enderecos;
	
	private List<Telefone> telefones;
	
	private List<Pedido> pedidos;
	
	public Restaurante() {
		telefones = new ArrayList<Telefone>();
		pedidos = new ArrayList<Pedido>();
	}
	
public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getServeAlmoco() {
		return serveAlmoco;
	}

	public void setServeAlmoco(Boolean serveAlmoco) {
		this.serveAlmoco = serveAlmoco;
	}

	public Boolean getServeJantar() {
		return serveJantar;
	}

	public void setServeJantar(Boolean serveJantar) {
		this.serveJantar = serveJantar;
	}

	public Boolean getServeCafeDaManha() {
		return serveCafeDaManha;
	}

	public void setServeCafeDaManha(Boolean serveCafeDaManha) {
		this.serveCafeDaManha = serveCafeDaManha;
	}
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	
	public void addEndereco(Endereco endereco) {
		this.enderecos.add(endereco);
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void addTelefones(Telefone telefones) {
		this.telefones.add(telefones);
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void addPedidos(Pedido pedidos) {
		this.pedidos.add(pedidos);
	}
}

