package com.hosto.beans;

public class User {
	private int idUser;
	private String pseudo;
	private String prenom;
	private String nom;
	private String mdp;
	
	private String fonction;
	
	
	public User() {
		this( 1, "Mod","Mouhammadou oury","diallo",		"mdp1", 	"administrateur"  );
	}
	
	public User(  String pseudo, String prenom, String nom, String mdp, String fonction ) {
		this.setPseudo( pseudo );
		this.setPrenom( prenom );
		this.setNom( nom );
		this.setMdp( mdp );
		this.setFonction(fonction);
	}
	
	public User( int idUser, String pseudo, String prenom, String nom, String mdp,  String fonction ) {
		this.setIdUser( idUser );
		this.setPseudo( pseudo );
		this.setPrenom( prenom );
		this.setNom( nom );
		this.setMdp( mdp );
		this.setFonction(fonction);
	}
	
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	

	
}
