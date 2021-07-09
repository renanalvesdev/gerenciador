package br.com.alura.gerenciador.model;

import java.io.Serializable;
import java.util.Date;

public class Empresa implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String nome;
	private Date dataCadastro = new Date();
	
	public Empresa() {		
	}
	
	public Empresa(String nome) {
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataCadastro(Date data) {
		this.dataCadastro = data;
	}
	
	public Date getDataCadastro() {
		return this.dataCadastro;
	}
	
	
	
}
