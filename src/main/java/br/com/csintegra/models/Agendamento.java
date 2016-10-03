package br.com.csintegra.models;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@javax.persistence.Table(name = "AGENDAMENTO", indexes = {
		@Index(name = "ag_unique", columnList = "data", unique = true) })
public class Agendamento {
	@Id
	@GeneratedValue
	private Long id;

	@Temporal(TemporalType.DATE)
	private Calendar data;

	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY, targetEntity = Recurso.class, cascade = CascadeType.ALL)
	private Recurso recurso;
	
	@Column(name = "local", length = 200, nullable = true)
	private String local;
	@Column(name = "trabalho", length = 200, nullable = true)
	private String trabalho;
	@Column(name = "projeto", length = 200, nullable =  true)
	private String projeto;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the data
	 */
	public Calendar getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Calendar data) {
		this.data = data;
	}

	/**
	 * @return the recurso
	 */
	public Recurso getRecurso() {
		return recurso;
	}

	/**
	 * @param recurso
	 *            the recurso to set
	 */
	public void setRecurso(Recurso recurso) {
		this.recurso = recurso;
	}

	/**
	 * @return the local
	 */
	public String getLocal() {
		return local;
	}

	/**
	 * @param local
	 *            the local to set
	 */
	public void setLocal(String local) {
		this.local = local;
	}

	/**
	 * @return the trabalho
	 */
	public String getTrabalho() {
		return trabalho;
	}

	/**
	 * @param trabalho
	 *            the trabalho to set
	 */
	public void setTrabalho(String trabalho) {
		this.trabalho = trabalho;
	}

	/**
	 * @return the projeto
	 */
	public String getProjeto() {
		return projeto;
	}

	/**
	 * @param projeto
	 *            the projeto to set
	 */
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((projeto == null) ? 0 : projeto.hashCode());
		result = prime * result + ((recurso == null) ? 0 : recurso.hashCode());
		result = prime * result + ((trabalho == null) ? 0 : trabalho.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (projeto == null) {
			if (other.projeto != null)
				return false;
		} else if (!projeto.equals(other.projeto))
			return false;
		if (recurso == null) {
			if (other.recurso != null)
				return false;
		} else if (!recurso.equals(other.recurso))
			return false;
		if (trabalho == null) {
			if (other.trabalho != null)
				return false;
		} else if (!trabalho.equals(other.trabalho))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agendamento [id=" + id + ", data=" + data + ", local=" + local + ", trabalho=" + trabalho + ", projeto="
				+ projeto + "]";
	}

}
