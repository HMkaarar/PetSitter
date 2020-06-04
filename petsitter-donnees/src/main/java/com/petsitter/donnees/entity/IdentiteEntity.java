/**
 * 
 */
package com.petsitter.donnees.entity;

import java.sql.Blob;
import java.sql.Date;

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
public class IdentiteEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
	
	public String userName;
	
	public Blob imageId;
	
	public String nom;
	
	public String prenom;
	
	public String email;
	
	public String numTel;
	
	public String telAppelUrgence;
	
	public String nomAppelUrgence;
	
	public Date dateNaissance;
	
	// TODO cascade
	public AdresseEntity adresse;

	
	
	public IdentiteEntity() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Blob getImageId() {
		return imageId;
	}

	public void setImageId(Blob imageId) {
		this.imageId = imageId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getTelAppelUrgence() {
		return telAppelUrgence;
	}

	public void setTelAppelUrgence(String telAppelUrgence) {
		this.telAppelUrgence = telAppelUrgence;
	}

	public String getNomAppelUrgence() {
		return nomAppelUrgence;
	}

	public void setNomAppelUrgence(String nomAppelUrgence) {
		this.nomAppelUrgence = nomAppelUrgence;
	}

	public AdresseEntity getAdresse() {
		return adresse;
	}

	public void setAdresse(AdresseEntity adresse) {
		this.adresse = adresse;
	}
	

	
}
