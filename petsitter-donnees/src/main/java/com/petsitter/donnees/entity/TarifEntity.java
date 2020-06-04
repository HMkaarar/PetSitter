/**
 * 
 */
package com.petsitter.donnees.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.petsitter.donnees.enums.TypeServices;

/**
 * @author hokaarar
 *
 */
@Entity
@Table(name = "Tarif")
public class TarifEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
		
	public TypeServices typeService;
	
	public Float prix;

	
	
	public TarifEntity() {
		super();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public TypeServices getTypeService() {
		return typeService;
	}



	public void setTypeService(TypeServices typeService) {
		this.typeService = typeService;
	}



	public Float getPrix() {
		return prix;
	}



	public void setPrix(Float prix) {
		this.prix = prix;
	}		
	
}
