package com.app.ServerSide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Tournee;

@Repository
public interface TourneeRepository extends JpaRepository<Tournee,Long> {
	
	/*public void decomposer(Tournee tournee);
	
	public void charger();
	
	public void decharger(List<Tournee> tournees);
	
	public void valider(List<Tournee> tournees);
	
	public void affecter(Tournee tournee, Releveur compte);
	
	public List<Tournee>findNonAffectee();
	
	public List<Tournee>findAvalider();*/
	
	
	
}
