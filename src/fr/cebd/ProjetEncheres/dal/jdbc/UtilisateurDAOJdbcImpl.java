package fr.cebd.ProjetEncheres.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import fr.cebd.ProjetEncheres.bo.Utilisateur;
import fr.cebd.ProjetEncheres.dal.UtilisateurDAO;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO  {
	
	static String INSERER_UTILISATEUR = "INSERT INTO UTILISATEURS VALUES (?,?,?,?,?,?,?,?,?,?,?)";

	@Override
	public void creerUtilisateur(Utilisateur utilisateur) {
		Connection cnx = null;
		PreparedStatement rqt = null;
		
		 
			try {
				cnx = JdbcTools.getConnection();
				
				rqt = cnx.prepareStatement(INSERER_UTILISATEUR, Statement.RETURN_GENERATED_KEYS);
				rqt.setString(1, utilisateur.getPseudo());
				rqt.setString(2, utilisateur.getNom());
				rqt.setString(3, utilisateur.getPrenom());
				rqt.setString(4, utilisateur.getEmail());
				rqt.setString(5, utilisateur.getTelephone());
				rqt.setString(6, utilisateur.getRue());
				rqt.setString(7, utilisateur.getCodePostal());
				rqt.setString(8, utilisateur.getVille());
				rqt.setString(9, utilisateur.getMotDePasse());
				rqt.setDouble(10, utilisateur.getCredit());
				rqt.setBoolean(11, utilisateur.isAdministrateur());
				
				rqt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
}

	@Override
	public List<String> getListePseudo() {
		// TODO Auto-generated method stub
		return null;
	}
		
	}

