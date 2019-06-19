package br.com.olmti.newcred.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table ( name = "CLIENTE")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column ( name = "nome")
	private String nome;
	
	//@Temporal(TemporalType.DATE)
	@Column (name = "dt_nascimento")
	private Date dtNascimento;
	
	@Column (name = "sexo")
	private Integer sexo;
	
	@OneToOne
	@JoinColumn (name = "estado_civil")
	private TpEstadoCivil estadoCivil;
	
	@Column ( name = "cpf")
	private String cpf;

	@OneToOne
	@JoinColumn ( name = "cep")
	private Cep cep  ;
	
	@Column ( name = "compl_endereco")
	private String complEndereco;
	
	@OneToOne
	@JoinColumn ( name = "id_parceiro")
	private Usuario parceiro;
			
	@Column ( name = "rg")
	private String	rg;
	
	@Column ( name = "email")
	private String email;
	
	@Column ( name = "profissao")
	private String profissao ;
	
	@Column ( name = "anotacoes")
	private String anotacoes ;
	
	@OneToOne
	@JoinColumn ( name = "id_status")
	private StatusCliente status;
	
	@OneToOne
	@JoinColumn ( name = "id_origem")
	private Origem origem  ;
	
	@OneToOne
	@JoinColumn ( name = "id_tp_parceria")
	private TpParceria tpParceria  ;
	
	@Column ( name = "telefone1")
	private Long telefone1;
	
	@Column ( name = "telefone2")
	private Long telefone2;
	
	@Column ( name = "telefone3")
	private Long telefone3;
	
	@OneToOne
	@JoinColumn( name = "id_operadora1")
	private Operadora operadora;
	
	@OneToOne
	@JoinColumn( name = "id_operadora2")
	private Operadora operadora2;
	
	@OneToOne
	@JoinColumn( name = "id_operadora3")
	private Operadora operadora3;
			
	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora1) {
		this.operadora = operadora1;
	}

	public Operadora getOperadora2() {
		return operadora2;
	}

	public void setOperadora2(Operadora operadora2) {
		this.operadora2 = operadora2;
	}

	public Long getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(Long telefone1) {
		this.telefone1 = telefone1;
	}

	public Long getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(Long telefone2) {
		this.telefone2 = telefone2;
	}

	public Long getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(Long telefone3) {
		this.telefone3 = telefone3;
	}

	public TpParceria getTpParceria() {
		return tpParceria;
	}

	public void setTpParceria(TpParceria tpParceria) {
		this.tpParceria = tpParceria;
	}

	public Origem getOrigem() {
		return origem;
	}

	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

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

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dt_nascimento) {
		this.dtNascimento = dt_nascimento;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public TpEstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(TpEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cep getCep() {
		return cep;
	}

	public void setCep(Cep cep) {
		this.cep = cep;
	}

	public String getComplEndereco() {
		return complEndereco;
	}

	public void setComplEndereco(String complEndereco) {
		this.complEndereco = complEndereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public StatusCliente getStatus() {
		return status;
	}

	public void setStatus(StatusCliente status) {
		this.status = status;
	}

	public Operadora getOperadora3() {
		return operadora3;
	}

	public void setOperadora3(Operadora operadora3) {
		this.operadora3 = operadora3;
	}

	public Usuario getParceiro() {
		return parceiro;
	}
		
	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	public void setParceiro(Usuario parceiro) {
		this.parceiro = parceiro;
	}
	
	
}
