package fr.cebd.ProjetEncheres.bo;

class Utilisateur {
	private int noUtilisateur;
	private String pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse ;
	private double credit;
	private boolean administrateur;


	public Utilisateur() {
		
	}
	public Utilisateur (int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone, String codePostal, String ville, String motDePasse, boolean administrateur, double credit) {
		
	}
	public boolean isAdministrateur() {
		return administrateur;
	}
	public void setAdministrateur(boolean administrateur) {
		this.administrateur = administrateur;
	}
	public int getNoUtilisateur() {
		return noUtilisateur;
	}
	public String getPseudo() {
		return pseudo;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getEmail() {
		return email;
	}
	public String getTelephone() {
		return telephone;
	}
	public String getRue() {
		return rue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public String getVille() {
		return ville;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public double getCredit() {
		return credit;
	}
	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	
	
	
	
	
	
	
	
}

