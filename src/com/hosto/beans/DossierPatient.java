package com.hosto.beans;

public class DossierPatient {

	private int IdDossier;
	private String Patient;
	private String Division;
	private String DateEntree;
	private String DateSortie;
	private String DiagEntree;
	private String DiagSortie;
	private String Imc;
	private String Pc;
	private String Pb;
	private String ArgAnamnestiques;
	private String ArgCliniques;
	private String Traitement;
	private String Evolution;
	
	public DossierPatient() {
		
		this(1, "1", " ", "20200809", "20200909", "FIEVRE CHRONIQUE", "GUERI", "73", "12", "45", "blablabla","blablabla","antibiotiques"," ");
	}

	public DossierPatient(int IdDossier, String Patient,String Division,String DateEntree,String DateSortie,String DiagEntree,String DiagSortie,String Imc, String Pc, String Pb,String ArgAnamnestiques,String ArgCliniques,String Traitement,String Evolution) {
		this.setIdDossier(IdDossier);
		this.setPatient(Patient);
		this.setDivision(Division);
		this.setDateEntree(DateEntree);
		this.setDateSortie(DateSortie);
		this.setDiagEntree(DiagEntree);
		this.setDiagSortie(DiagSortie);
		this.setImc(Imc);
		this.setPc(Pc);
		this.setPb(Pb);
		this.setArgAnamnestiques(ArgAnamnestiques);
		this.setArgCliniques(ArgCliniques);
		this.setTraitement(Traitement);
		this.setEvolution(Evolution);
		
	}

	public DossierPatient(String patient2, String division2, String dateEntree2, String dateSortie2, String diagEntree2,
			String diagSortie2, String imc2, String pb2, String pc2, String argAnamnestiques2, String argCliniques2,
			String traitement2, String evolution2) {
		this.setPatient(patient2);
		this.setDivision(division2);
		this.setDateEntree(dateEntree2);
		this.setDateSortie(dateSortie2);
		this.setDiagEntree(diagEntree2);
		this.setDiagSortie(diagSortie2);
		this.setImc(imc2);
		this.setPc(pc2);
		this.setPb(pb2);
		this.setArgAnamnestiques(argAnamnestiques2);
		this.setArgCliniques(argCliniques2);
		this.setTraitement(traitement2);
		this.setEvolution(evolution2);
	}

	public int getIdDossier() {
		return IdDossier;
	}

	public void setIdDossier(int idDossier) {
		IdDossier = idDossier;
	}

	public String getPatient() {
		return Patient;
	}

	public void setPatient(String i) {
		Patient = i;
	}

	public String getDivision() {
		return Division;
	}

	public void setDivision(String division) {
		Division = division;
	}

	public String getDateEntree() {
		return DateEntree;
	}

	public void setDateEntree(String dateEntree2) {
		DateEntree = dateEntree2;
	}

	public String getDateSortie() {
		return DateSortie;
	}

	public void setDateSortie(String dateSortie2) {
		DateSortie = dateSortie2;
	}

	public String getDiagEntree() {
		return DiagEntree;
	}

	public void setDiagEntree(String diagEntree) {
		DiagEntree = diagEntree;
	}

	public String getDiagSortie() {
		return DiagSortie;
	}

	public void setDiagSortie(String diagSortie) {
		DiagSortie = diagSortie;
	}

	public String getImc() {
		return Imc;
	}

	public void setImc(String imc2) {
		Imc = imc2;
	}

	public String getPc() {
		return Pc;
	}

	public void setPc(String pc2) {
		Pc = pc2;
	}

	public String getPb() {
		return Pb;
	}

	public void setPb(String pb2) {
		Pb = pb2;
	}

	public String getArgAnamnestiques() {
		return ArgAnamnestiques;
	}

	public void setArgAnamnestiques(String argAnamnestiques) {
		ArgAnamnestiques = argAnamnestiques;
	}

	public String getArgCliniques() {
		return ArgCliniques;
	}

	public void setArgCliniques(String argCliniques) {
		ArgCliniques = argCliniques;
	}

	public String getTraitement() {
		return Traitement;
	}

	public void setTraitement(String traitement) {
		Traitement = traitement;
	}

	public String getEvolution() {
		return Evolution;
	}

	public void setEvolution(String evolution) {
		Evolution = evolution;
	}
	
	
}
