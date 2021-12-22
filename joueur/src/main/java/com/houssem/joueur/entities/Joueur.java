package com.houssem.joueur.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Joueur {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idjoueur;
	private String nomjoueur;
	private Double prixjoueur;
	private Date dateCreation;
	
	
	@ManyToOne
	private Equipe equipe;
	
	
	
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

	public Joueur(String nomjoueur, Double prixjoueur, Date dateCreation) {
		super();
		this.nomjoueur = nomjoueur;
		this.prixjoueur = prixjoueur;
		this.dateCreation = dateCreation;
	}
	
	
	
	
	
	





	public Long getIdjoueur() {
		return idjoueur;
	}
	public void setIdjoueur(Long idjoueur) {
		this.idjoueur = idjoueur;
	}
	public String getNomjoueur() {
		return nomjoueur;
	}
	public void setNomjoueur(String nomjoueur) {
		this.nomjoueur = nomjoueur;
	}
	public Double getPrixjoueur() {
		return prixjoueur;
	}
	public void setPrixjoueur(Double prixjoueur) {
		this.prixjoueur = prixjoueur;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}





	@Override
	public String toString() {
		return "Joueur [idjoueur=" + idjoueur + ", nomjoueur=" + nomjoueur + ", prixjoueur=" + prixjoueur
				+ ", dateCreation=" + dateCreation + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}