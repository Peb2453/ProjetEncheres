package fr.cebd.ProjetEncheres.bll;

import fr.cebd.ProjetEncheres.bo.Utilisateur;
import fr.cebd.ProjetEncheres.dal.DAOFactory;
import fr.cebd.ProjetEncheres.dal.UtilisateurDAO;

public class UtilisateurManager {
	
	private static UtilisateurDAO utilisateurDAO;

	public UtilisateurManager() {
			//Instancier le Data Access Object
		utilisateurDAO =DAOFactory.getUtilisateurDAO();
	}

	public void creerUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		verifierPseudo(utilisateur.getPseudo());
		
		utilisateurDAO.creerUtilisateur(utilisateur);
		
	}
	
	private void verifierPseudo(String pseudo) {
		
	}
}
