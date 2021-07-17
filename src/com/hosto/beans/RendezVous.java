package com.hosto.beans;

public class RendezVous {
	
	private String NomPatient;
	private String PrenomPatient;
	private int IdRv;
	private String	DateRv;
	private String	heure;
	private int Patient;
	
	
	public RendezVous(String nomPatient,String prenomPatient, int idRv, String dateRv, String heure, int patient) {
		this.setNomPatient(nomPatient);
		this.setPrenomPatient(prenomPatient);
		this.setIdRv(idRv);
		this.setDateRv(dateRv);
		this.setHeure(heure);
		this.setPatient(patient);
	}


	public RendezVous() {
		// TODO Auto-generated constructor stub
	}


	public RendezVous(String nomPatient2, String prenomPatient2, String dateRv2, String heure2, int patient2) {
		// TODO Auto-generated constructor stub
	}


	public RendezVous(String nomPatient2, String prenomPatient2, String dateRv2, String heure2) {
		this.setNomPatient(nomPatient2);
		this.setPrenomPatient(prenomPatient2);
		this.setDateRv(dateRv2);
		this.setHeure(heure2);
	}


	public String getNomPatient() {
		return NomPatient;
	}


	public void setNomPatient(String nomPatient) {
		NomPatient = nomPatient;
	}


	public String getPrenomPatient() {
		return PrenomPatient;
	}


	public void setPrenomPatient(String prenomPatient) {
		PrenomPatient = prenomPatient;
	}


	public int getIdRv() {
		return IdRv;
	}


	public void setIdRv(int idRv) {
		IdRv = idRv;
	}


	public String getDateRv() {
		return DateRv;
	}


	public void setDateRv(String dateRv) {
		DateRv = dateRv;
	}


	public String getHeure() {
		return heure;
	}


	public void setHeure(String heure) {
		this.heure = heure;
	}


	public int getPatient() {
		return Patient;
	}


	public void setPatient(int patient) {
		Patient = patient;
	}
	
	
	
}
