package fr.cebd.ProjetEncheres.ihm;

import java.io.IOException;

import fr.cebd.ProjetEncheres.bll.UtilisateurManager;
import fr.cebd.ProjetEncheres.bo.Utilisateur;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletInscription
 */
@WebServlet("/ServletInscription")
public class ServletInscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletInscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd =  request.getRequestDispatcher("/WEB-INF/JSP/inscription.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur utilisateur = new Utilisateur((String)request.getAttribute("pseudo"), (String)request.getAttribute("nom"), 
				(String)request.getAttribute("prenom"), (String)request.getAttribute("email"), (String)request.getAttribute("telephone"), 
				(String)request.getAttribute("rue"), (String)request.getAttribute("codePostal"), (String)request.getAttribute("ville"), 
				(String)request.getAttribute("motDePasse"), 0.0, false);
		
		UtilisateurManager utilisateurManager = new UtilisateurManager();
		utilisateurManager.creerUtilisateur(utilisateur);
		
		
		
		
		
		
		
		
		
		
	}

}
