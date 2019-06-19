package br.com.olmti.newcred.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity 
@Table( name = "STATUS_CLIENTE")
public class StatusCliente {
	
	@Id
	@Column ( name = "id")
	private Long id;
	
	@Column ( name = "nome")
	private String nome;
	
	@Column ( name = "ativo")
	private Integer Ativo;
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAtivo() {
		return Ativo;
	}

	public void setAtivo(Integer ativo) {
		Ativo = ativo;
	}

}
