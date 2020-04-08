package com.mamiland.backend.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Embarazada implements Serializable{
	private static final long serialVersionUID = -4275534803720385072L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String apellido;
	private String descripcion;
	private String estado; //TODO ver 
	private String profesion;
	private String fechaEstimativoParto; // string para poder poner entre fechas
	
	
	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;
	
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@PrePersist
	public void prePersist() {
		fechaIngreso = new Date();
	}
	
	
	public Embarazada() {}
	
	public Embarazada(String nombre, String apellido, String descripcion, String estado, String profesion,
			String fechaEstimativoParto, Date fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.descripcion = descripcion;
		this.estado = estado;
		this.profesion = profesion;
		this.fechaEstimativoParto = fechaEstimativoParto;
		this.fechaNacimiento = fechaNacimiento;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getFechaEstimativoParto() {
		return fechaEstimativoParto;
	}

	public void setFechaEstimativoParto(String fechaEstimativoParto) {
		this.fechaEstimativoParto = fechaEstimativoParto;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fechaEstimativoParto == null) ? 0 : fechaEstimativoParto.hashCode());
		result = prime * result + ((fechaIngreso == null) ? 0 : fechaIngreso.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((profesion == null) ? 0 : profesion.hashCode());
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
		Embarazada other = (Embarazada) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fechaEstimativoParto == null) {
			if (other.fechaEstimativoParto != null)
				return false;
		} else if (!fechaEstimativoParto.equals(other.fechaEstimativoParto))
			return false;
		if (fechaIngreso == null) {
			if (other.fechaIngreso != null)
				return false;
		} else if (!fechaIngreso.equals(other.fechaIngreso))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (profesion == null) {
			if (other.profesion != null)
				return false;
		} else if (!profesion.equals(other.profesion))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Embarazadas [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", descripcion="
				+ descripcion + ", estado=" + estado + ", profesion=" + profesion + ", fechaEstimativoParto="
				+ fechaEstimativoParto + ", fechaIngreso=" + fechaIngreso + ", fechaNacimiento=" + fechaNacimiento
				+ "]";
	}
}
