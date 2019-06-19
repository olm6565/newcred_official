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
@Table( name = "TP_ACESSO")
public class TpAcesso {
	
	@Id
	@Column ( name = "id_tp_acesso")
	private Integer idTpAcesso;
	
	@Column ( name = "nome")
	private String nome;
	
	@Column ( name = "ativo")
	private Integer Ativo;
	
//	@ManyToMany
//	@JoinTable(name="TP_ACESSO_REGRA", 
//	  joinColumns= {@JoinColumn(name="id_regra")},
//	  inverseJoinColumns= {@JoinColumn(name="id_tp_Acesso")})
//	private Set <Regra> regras;

	public Integer getId_tp_acesso() {
		return idTpAcesso;
	}

	public void setId_tp_acesso(Integer id_tp_acesso) {
		this.idTpAcesso = id_tp_acesso;
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

//	public Set <Regra> getRegras() {
//		return regras;
//	}
//
//	public void setRegras(Set <Regra> regras) {
//		this.regras = regras;
//	}
}
