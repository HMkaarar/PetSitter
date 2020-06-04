package com.petsitter.donnees.entity;

import java.sql.Blob;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.petsitter.donnees.enums.TypeServices;

@Entity
@Table(name="Offre")
public class OffreEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
	
	//TODO list des blob
	public Blob imageOffre;
	
	public String description;
	
	public List<TypeServices> typeServices;
	
	public List<PetEntity> pets;
	
	public List<DisponibiliteEntity> disponibiltes;
	
	public List<TarifEntity> tarifs;	
	
	
	public OffreEntity() {
		super();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Blob getImageOffre() {
		return imageOffre;
	}

	public void setImageOffre(Blob imageOffre) {
		this.imageOffre = imageOffre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<TypeServices> getTypeServices() {
		return typeServices;
	}

	public void setTypeServices(List<TypeServices> typeServices) {
		this.typeServices = typeServices;
	}

	public List<PetEntity> getPets() {
		return pets;
	}

	public void setPets(List<PetEntity> pets) {
		this.pets = pets;
	}

	public List<DisponibiliteEntity> getDisponibiltes() {
		return disponibiltes;
	}

	public void setDisponibiltes(List<DisponibiliteEntity> disponibiltes) {
		this.disponibiltes = disponibiltes;
	}

	public List<TarifEntity> getTarifs() {
		return tarifs;
	}

	public void setTarifs(List<TarifEntity> tarifs) {
		this.tarifs = tarifs;
	}
	
}
