package br.com.zup.vacinaai.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuario_id")
	private Integer usuario_id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "email", unique=true, nullable = false)
	private String email;
	
	@Column(name = "cpf", unique=true, nullable = false)
	private String cpf;
	
	@Column(name = "dataNascimento", nullable = false)
	private Date dataNascimento;

	public Usuario(String nome, String email, String cpf, Date dataNascimento) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuario_id == null) ? 0 : usuario_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (usuario_id == null) {
			if (other.usuario_id != null)
				return false;
		} else if (!usuario_id.equals(other.usuario_id))
			return false;
		return true;
	}

	public Integer getUser_id() {
		return usuario_id;
	}

	public void setUser_id(Integer user_id) {
		this.usuario_id = user_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	

}
