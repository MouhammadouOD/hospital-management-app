package com.hosto.beans;

public class ConsultationI {
	
	private String IdConsultationI;
	private String Patient;
	private String Poids;
	private String Temperature;
	private String HeureDeCons;
	private String Taille;
	
	
	
	
	public ConsultationI(String idConsultationI, String patient, String poids, String temperature, String heureDeCons, String taille) {
		
		this.setIdConsultationI(idConsultationI);
		this.setPatient(patient);
		this.setPoids(poids);
		this.setTemperature(temperature);
		this.setHeureDeCons(heureDeCons);
		this.setTaille(taille);
	}
	public ConsultationI() {
		// TODO Auto-generated constructor stub
	}
	public ConsultationI(String patient2, String poids2, String temperature2, String heureDeCons2, String taille2) {
		this.setPatient(patient2);
		this.setPoids(poids2);
		this.setTemperature(temperature2);
		this.setHeureDeCons(heureDeCons2);
		this.setTaille(taille2);
	}
	public String getIdConsultationI() {
		return IdConsultationI;
	}
	public void setIdConsultationI(String idConsultationI2) {
		IdConsultationI = idConsultationI2;
	}
	public String getPatient() {
		return Patient;
	}
	public void setPatient(String idConsultationI2) {
		Patient = idConsultationI2;
	}
	public String getPoids() {
		return Poids;
	}
	public void setPoids(String poids2) {
		Poids = poids2;
	}
	public String getTemperature() {
		return Temperature;
	}
	public void setTemperature(String temperature2) {
		Temperature = temperature2;
	}
	public String getHeureDeCons() {
		return HeureDeCons;
	}
	public void setHeureDeCons(String heureDeCons) {
		HeureDeCons = heureDeCons;
	}
	public String getTaille() {
		return Taille;
	}
	public void setTaille(String taille2) {
		Taille = taille2;
	}
	
	
	

}
