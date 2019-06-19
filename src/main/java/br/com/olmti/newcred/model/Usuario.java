package br.com.olmti.newcred.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column (name = "usuario")
	private String usuario;
	
	@Column(name = "senha")
	private String senha;
	
	@Column ( name = "nome")
	private String nome;
	
	@ManyToOne
	@JoinColumn (name = "id_tp_acesso")
	private TpAcesso tpAcesso;											
	
	@Column (name = "cpf")
	private String cpf;
	
	@Column (name = "parceria")
	private Integer parceria;
	
	
	public Integer getParceria() {
		return parceria;
	}
	public void setParceria(Integer parceria) {
		this.parceria = parceria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TpAcesso getTpAcesso() {
		return tpAcesso;
	}
	public void setTpAcesso(TpAcesso tpAcesso) {
		this.tpAcesso = tpAcesso;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
