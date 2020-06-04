package com.petsitter.donnees.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserInfoSup")
public class UserInfoSupEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
	
	public Long nbreMaxPetAcc;
	
	public List<PetEntity> userPets;
	
	public Long rayonDeplacement;
	
	public String services;
	
	public String UserCompetences;
	
	
	public UserInfoSupEntity() {
		super();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNbreMaxPetAcc() {
		return nbreMaxPetAcc;
	}

	public void setNbreMaxPetAcc(Long nbreMaxPetAcc) {
		this.nbreMaxPetAcc = nbreMaxPetAcc;
	}

	public List<PetEntity> getUserPets() {
		return userPets;
	}

	public void setUserPets(List<PetEntity> userPets) {
		this.userPets = userPets;
	}

	public Long getRayonDeplacement() {
		return rayonDeplacement;
	}

	public void setRayonDeplacement(Long rayonDeplacement) {
		this.rayonDeplacement = rayonDeplacement;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getUserCompetences() {
		return UserCompetences;
	}

	public void setUserCompetences(String userCompetences) {
		UserCompetences = userCompetences;
	}
	
}
