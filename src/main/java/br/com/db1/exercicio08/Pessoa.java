package br.com.db1.exercicio08;

import java.util.Date;
import java.util.List;

import br.com.db1.exercicio06.Telefone;

public abstract class Pessoa {

	private String nome;
	
	private Date dataNascimento;
	
	private List<Endereco> enderecos;
	
	private List<Telefone> telefones;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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
	
	
}
