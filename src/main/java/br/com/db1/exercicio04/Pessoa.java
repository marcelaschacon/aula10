package br.com.db1.exercicio04;

import br.com.db1.exercicio04.Sexo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Pessoa {
	
	private String nome;
	
	private Date dataNascimento;
	
	private Sexo sexo;
	
	private List<Telefone>	listTelefone;
	
	public Pessoa(){
		listTelefone = new ArrayList<Telefone>();
	}

	public List<Telefone> getListTelefone() {
		return listTelefone;
	}

	public void addListTelefone(Telefone listTelefone) {
		this.listTelefone.add(listTelefone);
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

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
	
	
}
