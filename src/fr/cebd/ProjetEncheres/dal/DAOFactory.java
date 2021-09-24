package fr.cebd.ProjetEncheres.dal;

import fr.cebd.ProjetEncheres.dal.jdbc.UtilisateurDAOJdbcImpl;

public class DAOFactory {
	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOJdbcImpl();
	}
}
