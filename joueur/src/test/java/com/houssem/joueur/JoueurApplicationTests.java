package com.houssem.joueur;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.houssem.joueur.entities.Equipe;
import com.houssem.joueur.entities.Joueur;
import com.houssem.joueur.repos.JoueurRepository;

@SpringBootTest
class JoueurApplicationTests {

	

	@Autowired
	private JoueurRepository joueurRepository;
	@Test
	public void testCreateJoueur() {
	Joueur jous = new Joueur("Messi",200.111,new Date());
	joueurRepository.save(jous);
	}
	
	
	
	
	@Test
	public void testFindJoueur()
	{
	Joueur   j = joueurRepository.findById(1L).get();

	System.out.println(j);
	}
	
	
	
	
	@Test
	public void testUpdateProduit()
	{
		Joueur   j = joueurRepository.findById(3L).get();
	j.setPrixjoueur(2011.0);
	joueurRepository.save(j);
	}
	
	
	public void testDeleteJoueur()
	{
		joueurRepository.deleteById(3L);;
	}
	@Test
	public void testListerTousJoueurs()
	{
	List<Joueur> jous = joueurRepository.findAll();
	for ( Joueur j : jous)
	{
	System.out.println(j);
	}
	

	
	}
	
	@Test
	public void testFindByNomjoueur()
	{
	List<Joueur> jous = joueurRepository.findBynomjoueur("Messi");

	for (Joueur j : jous)
	{
	System.out.println(j);
	}

	}
	
	
	
	@Test
	public void testFindByNomjoueurContains()
	{
	List<Joueur> jous = joueurRepository.findBynomjoueurContains("Messi");

	for (Joueur j : jous)
	{
	System.out.println(j);
	}

	}
	
	
	@Test
	public void testfindByNomPrix()
	{
	List<Joueur> jous = joueurRepository.findByNomPrix("Henry", 1000.0);
	for (Joueur j : jous)
	{
	System.out.println(j);
	}

	}
	
	
	@Test
	public void testfindByEquipe()
	{
	Equipe equi = new Equipe();
	equi.setIdequi(1L);
	
	List<Joueur>  joues = joueurRepository.findByEquipe(equi);
	for (Joueur j : joues)
	{
	System.out.println(j);
	}
	}
	
	@Test
	public void findByEquipeIdequi()
	{
	List<Joueur> joues = joueurRepository.findByEquipeIdequi(1L);
	for (Joueur j :joues)
	{
	System.out.println(j);
	}

	}
	
	@Test
	public void testfindByOrderByNomJoueurAsc()
	{
	List<Joueur> joues =joueurRepository.findByOrderBynomjoueurAsc();
	for (Joueur j : joues)
	{
	System.out.println(j);
	}

	}
	@Test
	public void testtrierJoueurNomsPrix ()
	{
	List< Joueur> joues =  joueurRepository.trierJoueurNomsPrix();
	for ( Joueur j : joues)
	{
	System.out.println(j);
	}

	}

	
}
