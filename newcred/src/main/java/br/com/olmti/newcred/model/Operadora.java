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
@Table( name = "OPERADORAS_TELEFONE")
public class Operadora {
	
	@Id
	@Column ( name = "id")
	private Integer id;
	
	@Column ( name = "nome")
	private String nome;
	
	@Column ( name = "ativo")
	private Integer ativo;
	
//	@ManyToMany
//	@JoinTable(name="TP_ACESSO_REGRA", 
//	  joinColumns= {@JoinColumn(name="id_regra")},
//	  inverseJoinColumns= {@JoinColumn(name="id_tp_Acesso")})
//	private Set <Regra> regras;

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

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

//	public Set <Regra> getRegras() {
//		return regras;
//	}
//
//	public void setRegras(Set <Regra> regras) {
//		this.regras = regras;
//	}
}
