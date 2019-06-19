package br.com.olmti.newcred.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "CEP")
public class Cep {
	@Id
	@Column (name = "id_cep")
	private Long id;
	
	@Column (name = "cep")
	private Integer cep;
	
	@Column (name = "municipio")
	private String municipio;
	
	@Column (name = "uf")
	private String uf; 
	
	@Column (name = "bairro")
	private String bairro;
	
	@Column (name = "endereco" , columnDefinition = "NVARCHAR(100)")
	private String endereco;
	
	@Column (name = "observacao")
	private String observacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
