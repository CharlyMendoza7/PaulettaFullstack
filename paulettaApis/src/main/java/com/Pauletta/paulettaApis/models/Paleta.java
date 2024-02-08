package com.Pauletta.paulettaApis.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Paletas")
public class Paleta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String url;
	
	@Column
	private String type;
	
	@Column
	private String descrip;
	
	@Column
	private float price;

	public Paleta() {
		
	}

	public Paleta(int id, String name, String url, String type, String descrip, float price) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.type = type;
		this.descrip = descrip;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Paleta [id=" + id + ", name=" + name + ", url=" + url + ", type=" + type + ", descrip=" + descrip
				+ ", price=" + price + "]";
	}
	
	
	
	
	
	
}
