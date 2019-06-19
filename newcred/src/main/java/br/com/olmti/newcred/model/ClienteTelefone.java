package br.com.olmti.newcred.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table ( name = "CLIENTE_TELEFONE")
public class ClienteTelefone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn (name = "id_cliente")
	private Cliente cliente;
	
	@Column (name = "id_operadora")
	private Integer idOperadora;
	
	@Column (name = "numero")
	private Integer numero;
	
	@Column (name = "ddd")
	private Integer ddd;
	
	@Column ( name = "ativo")
	private Integer ativo;
	
	@Column ( name = "principal")
	private Integer principal;
			
	public Integer getPrincipal() {
		return principal;
	}

	public void setPrincipal(Integer principal) {
		this.principal = principal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getIdOperadora() {
		return idOperadora;
	}

	public void setIdOperadora(Integer idOperadora) {
		this.idOperadora = idOperadora;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}
}
