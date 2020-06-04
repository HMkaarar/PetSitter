package com.petsitter.donnees.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Avis")
public class AvisEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
	
	public UserEntity user;
	
	public Date dateComment;
	
	public Long note;

	public Long getId() {
		return id;
	}
	
	
	public AvisEntity() {
		super();
	}



	public void setId(Long id) {
		this.id = id;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public Date getDateComment() {
		return dateComment;
	}

	public void setDateComment(Date dateComment) {
		this.dateComment = dateComment;
	}

	public Long getNote() {
		return note;
	}

	public void setNote(Long note) {
		this.note = note;
	}

}
