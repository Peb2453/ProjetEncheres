package fr.cebd.ProjetEncheres.dal;

import java.util.List;

import fr.cebd.ProjetEncheres.bo.Utilisateur;

public interface UtilisateurDAO {

	void creerUtilisateur(Utilisateur utilisateur);
	
	List<String> getListePseudo();
	

}
