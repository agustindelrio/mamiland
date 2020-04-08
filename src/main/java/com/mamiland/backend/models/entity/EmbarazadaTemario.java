package com.mamiland.backend.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmbarazadaTemario implements Serializable {
	private static final long serialVersionUID = 5926415720717341165L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Embarazada embarazada;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Temario temario;
	
	private boolean finalizado;

	
	public EmbarazadaTemario() {}
	
	public EmbarazadaTemario(Embarazada embarazada, Temario temario, boolean finalizado) {
		this.embarazada = embarazada;
		this.temario = temario;
		this.finalizado = finalizado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Embarazada getEmbarazada() {
		return embarazada;
	}

	public void setEmbarazada(Embarazada embarazada) {
		this.embarazada = embarazada;
	}

	public Temario getTemario() {
		return temario;
	}

	public void setTemario(Temario temario) {
		this.temario = temario;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((embarazada == null) ? 0 : embarazada.hashCode());
		result = prime * result + (finalizado ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((temario == null) ? 0 : temario.hashCode());
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
		EmbarazadaTemario other = (EmbarazadaTemario) obj;
		if (embarazada == null) {
			if (other.embarazada != null)
				return false;
		} else if (!embarazada.equals(other.embarazada))
			return false;
		if (finalizado != other.finalizado)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (temario == null) {
			if (other.temario != null)
				return false;
		} else if (!temario.equals(other.temario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmbarazadaTemario [id=" + id + ", embarazada=" + embarazada + ", temario=" + temario + ", finalizado="
				+ finalizado + "]";
	}
	
	
	
	
}
