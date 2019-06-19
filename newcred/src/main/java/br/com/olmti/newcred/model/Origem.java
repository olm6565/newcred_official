package br.com.olmti.newcred.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table ( name = "ORIGEM")
public class Origem {
	
	@Id
	@Column (name = "id_origem")
	private Long id;
	
	@Column ( name = "descricao")
	private String descricao;
	
	@Column ( name = "nome")
	private String nome;
	
	@Column(name = "ativo")
	private Integer ativo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
