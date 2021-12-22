package com.houssem.joueur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houssem.joueur.entities.Equipe;
import com.houssem.joueur.entities.Joueur;
import com.houssem.joueur.repos.JoueurRepository;
@Service
public class JoueurServiceImpl implements JoueurService{
	
	
	
	@Autowired
	JoueurRepository joueurRepository;

	@Override
	public Joueur saveJoueur(Joueur j) {
		
		return joueurRepository.save(j);
	}

	@Override
	public Joueur updateJoueur(Joueur j) {
		
		return  joueurRepository.save(j);
	}

	@Override
	public void deleteJoueur(Joueur j) {
		joueurRepository.delete(j);
		
	}

	@Override
	public void deleteJoueurById(Long id) {
		joueurRepository.deleteById(id);
		
	}

	@Override
	public Joueur getJoueur(Long id) {
		return joueurRepository.findById(id).get();
	}

	@Override
	public List<Joueur> getAllJoueurs() {
		return joueurRepository.findAll();
	}

	@Override
	public List<Joueur> findBynomjoueur(String nom) {
		
		return joueurRepository.findBynomjoueur(nom);
	}

	@Override
	public List<Joueur> findBynomjoueurContains(String nom) {
	
		return joueurRepository.findBynomjoueurContains(nom);
	}

	@Override
	public List<Joueur> findByNomPrix(String nom, Double prix) {
		
		return joueurRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Joueur> findByEquipe(Equipe equipe) {
		
		return joueurRepository.findByEquipe(equipe);
	}

	@Override
	public List<Joueur> findByEquipeIdEqui(Long id) {
		
		return joueurRepository.findByEquipeIdequi(id) ;
	}

	@Override
	public List<Joueur> findByOrderBynomjoueurAsc() {
		
		return joueurRepository.findByOrderBynomjoueurAsc();
	}

	@Override
	public List<Joueur> trierJoueurNomsPrix() {
	
		return joueurRepository.trierJoueurNomsPrix();
	}

	
}
