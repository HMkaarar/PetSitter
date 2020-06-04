/**
 * 
 */
package com.petsitter.donnees.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author hokaarar
 *
 */
@Entity
@Table(name="Identite")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
	
	public IdentiteEntity identite;
	
	public Boolean statusInscp;
	
	public UserInfoSupEntity userInfoSup;
	
	public List<DemandeEntity> demandes;
	
	public List<OffreEntity> email;
	
	public List<AvisEntity> numTel;

	
	public UserEntity() {
		super();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IdentiteEntity getIdentite() {
		return identite;
	}

	public void setIdentite(IdentiteEntity identite) {
		this.identite = identite;
	}

	public Boolean getStatusInscp() {
		return statusInscp;
	}

	public void setStatusInscp(Boolean statusInscp) {
		this.statusInscp = statusInscp;
	}

	public UserInfoSupEntity getUserInfoSup() {
		return userInfoSup;
	}

	public void setUserInfoSup(UserInfoSupEntity userInfoSup) {
		this.userInfoSup = userInfoSup;
	}

	public List<DemandeEntity> getDemandes() {
		return demandes;
	}

	public void setDemandes(List<DemandeEntity> demandes) {
		this.demandes = demandes;
	}

	public List<OffreEntity> getEmail() {
		return email;
	}

	public void setEmail(List<OffreEntity> email) {
		this.email = email;
	}

	public List<AvisEntity> getNumTel() {
		return numTel;
	}

	public void setNumTel(List<AvisEntity> numTel) {
		this.numTel = numTel;
	}
	
	
}
