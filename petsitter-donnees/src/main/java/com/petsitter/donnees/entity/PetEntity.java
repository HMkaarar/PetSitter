package com.petsitter.donnees.entity;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pet")
public class PetEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;

	public Long age;

	public String sexe;

	public Long poids;

	public String race;

	public Blob imagePet;
	
	public String typePet;

	public Long getId() {
		return id;
	}
	

	public PetEntity() {
		super();
	}



	public void setId(Long id) {
		this.id = id;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Long getPoids() {
		return poids;
	}

	public void setPoids(Long poids) {
		this.poids = poids;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Blob getImagePet() {
		return imagePet;
	}

	public void setImagePet(Blob imagePet) {
		this.imagePet = imagePet;
	}

	public String getTypePet() {
		return typePet;
	}

	public void setTypePet(String typePet) {
		this.typePet = typePet;
	}
	
}
