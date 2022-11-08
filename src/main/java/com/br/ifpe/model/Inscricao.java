package com.br.ifpe.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Entity
public class Inscricao {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate data;
	private Categ categ;
	private SEXO sexo;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate data_nascimento;
	private Integer idade;
	private String nome;
	@Embedded
	private Endereco endereco;
	private Integer telefone;
	private String email;
	private GS gs;
	private String convenio;
	private String equipe;
	
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	public Categ getCateg() {
		return categ;
	}
	public void setCateg(Categ categ) {
		this.categ = categ;
	}
	public SEXO getSexo() {
		return sexo;
	}
	public void setSexo(SEXO sexo) {
		this.sexo = sexo;
	}
	public LocalDate getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public GS getGs() {
		return gs;
	}
	public void setGs(GS gs) {
		this.gs = gs;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	@Override
	public String toString() {
		return "Inscricao [codigo=" + codigo + ", data=" + data + ", categorias="
				+ categ + ", sexo=" + sexo + ", data_nascimento=" + data_nascimento + ", idade=" + idade
				+ ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email
				+ ", tipo_sanguineo=" + gs + ", convenio=" + convenio + ", equipe=" + equipe + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(categ, codigo, convenio, data, data_nascimento, email, endereco, equipe, idade,
				nome, sexo, telefone, gs);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inscricao other = (Inscricao) obj;
		return categ == other.categ && Objects.equals(codigo, other.codigo)
				&& Objects.equals(convenio, other.convenio) && Objects.equals(data, other.data)
				&& Objects.equals(data_nascimento, other.data_nascimento) && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(equipe, other.equipe)
				&& Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome) && sexo == other.sexo && Objects.equals(telefone, other.telefone)
				&& Objects.equals(gs, other.gs);
	}
	

	
	
}
