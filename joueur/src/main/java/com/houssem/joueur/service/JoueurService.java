package com.houssem.joueur.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.houssem.joueur.entities.Equipe;
import com.houssem.joueur.entities.Joueur;
@Service
public interface JoueurService  {
	Joueur saveJoueur(Joueur j);
	Joueur updateJoueur(Joueur j);
	void deleteJoueur(Joueur j);
	void deleteJoueurById(Long id);
	Joueur getJoueur(Long id);
	List<Joueur> getAllJoueurs();
	List<Joueur> findBynomjoueur(String nom);
	List<Joueur> findBynomjoueurContains(String nom);
	List<Joueur> findByNomPrix (String nom, Double prix);
	List<Joueur> findByEquipe (Equipe equipe);
	List<Joueur> findByEquipeIdEqui(Long id);
	List<Joueur> findByOrderBynomjoueurAsc();
	List<Joueur> trierJoueurNomsPrix();
	}
