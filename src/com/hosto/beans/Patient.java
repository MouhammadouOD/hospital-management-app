package com.hosto.beans;

public class Patient {
	
	private int IdPatient;
	private String Nom;
	private String Prenom;
	private String Sexe;
	private String DateNaissance;
	private String Adresse;
	private String NomAcc;
	private String TelAcc;
	
	public Patient() {
		this( 1, "Niang", "Lamine", "M", "19970714", "thies", "mod", "772806246");
	}

	public Patient(int IdPatient, String Nom, String Prenom, String Sexe, String DateNaissance, String Adresse, String NomAcc,
			String TelAcc) {
		this.setIdPatient(IdPatient);
		this.setNom(Nom);
		this.setPrenom(Prenom);
		this.setSexe(Sexe);
		this.setDateNaissance(DateNaissance);
		this.setAdresse(Adresse);
		this.setNomAcc(NomAcc);
		this.setTelAcc(TelAcc);
	}

	public Patient(String nom2, String prenom2, String sexe2, String dateNaissance2, String adresse2, String nomAcc2,
			String telAcc2) {
		this.setNom(nom2);
		this.setPrenom(prenom2);
		this.setSexe(sexe2);
		this.setDateNaissance(dateNaissance2);
		this.setAdresse(adresse2);
		this.setNomAcc(nomAcc2);
		this.setTelAcc(telAcc2);
	}

	@Override
	public String toString() {
		return "Patient [IdPatient=" + IdPatient + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Sexe=" + Sexe
				+ ", DateNaissance=" + DateNaissance + ", Adresse=" + Adresse + ", NomAcc=" + NomAcc + ", TelAcc="
				+ TelAcc + "]";
	}

	public int getIdPatient() {
		return IdPatient;
	}

	public void setIdPatient(int idPatient) {
		IdPatient = idPatient;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getSexe() {
		return Sexe;
	}

	public void setSexe(String sexe) {
		Sexe = sexe;
	}

	public String getDateNaissance() {
		return DateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		DateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getNomAcc() {
		return NomAcc;
	}

	public void setNomAcc(String nomAcc) {
		NomAcc = nomAcc;
	}

	public String getTelAcc() {
		return TelAcc;
	}

	public void setTelAcc(String telAcc) {
		TelAcc = telAcc;
	}
	
	
}
