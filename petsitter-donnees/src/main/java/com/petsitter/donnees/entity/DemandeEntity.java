package com.petsitter.donnees.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Demande")
public class DemandeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
		
	public OffreEntity offre;
	
	public Date dateDemande;

	
	
	public DemandeEntity() {
		super();
	}

	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public OffreEntity getOffre() {
		return offre;
	}


	public void setOffre(OffreEntity offre) {
		this.offre = offre;
	}


	public Date getDateDemande() {
		return dateDemande;
	}


	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

}
