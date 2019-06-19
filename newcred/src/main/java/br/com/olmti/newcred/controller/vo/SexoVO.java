package br.com.olmti.newcred.controller.vo;

public class SexoVO {
	
	private Integer id;
	private String nome;
	
	public SexoVO(Integer id , String nome) {
		this.id = id;
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

}
