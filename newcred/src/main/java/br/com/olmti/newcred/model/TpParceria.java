package br.com.olmti.newcred.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table ( name = "TP_PARCERIA")
public class TpParceria {
	@Id
	@Column ( name = "id_tp_parceria")
	private Long id;
	
	@Column ( name = "nome")
	private String nome;

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
	
	

}
