package com.senai.DaviCampos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name ="nCliente")
	private String nCliente;
	
	@Column
	private String fone;
	//geter
	//setters
	public Long getidcCliente() {
		return idcCliente; 
	}
	public void setidcCliente(long id) {
		this.idcCliente =id;
	}
	public String getCliente() {
		return nCliente;
	}
	public void setidcCliente(String nCliente) {
		this.nCliente = nCliente;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
}
