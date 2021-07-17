package com.hosto.beans;

public class Medoc {
	private int IdMed;				
	private String NomMed;			
	private String FrequenceDePrise;
	private String NombreParPrise;	
	private String DureePrise;		
	private String PeriodePrise;
	
	public Medoc() {
		this(1,"EFFRELGAN","JOUR", "1","1 SEMAINE","MATIN SOIR");
	}

	
	public Medoc(  int IdMed, String NomMed, String FrequenceDePrise, String NombreParPrise, String DureePrise, String PeriodePrise ) {
		this.setIdMed(IdMed);
		this.setNomMed(NomMed);
		this.setFrequenceDePrise(FrequenceDePrise);
		this.setNombreParPrise(NombreParPrise);
		this.setDureePrise(DureePrise);
		this.setPeriodePrise(PeriodePrise);
		
		
	}
	
	

	public Medoc(String nomMedoc, String frequenceDePrise2, String nombreParPrise2, String dureePrise2,
			String periodePrise2) {

		this.setNomMed(nomMedoc);
		this.setFrequenceDePrise(frequenceDePrise2);
		this.setNombreParPrise(nombreParPrise2);
		this.setDureePrise(dureePrise2);
		this.setPeriodePrise(periodePrise2);
	}


	public int getIdMed() {
		return IdMed;
	}

	public void setIdMed(int idMed) {
		IdMed = idMed;
	}

	public String getNomMed() {
		return NomMed;
	}

	public void setNomMed(String nomMed) {
		NomMed = nomMed;
	}

	public String getFrequenceDePrise() {
		return FrequenceDePrise;
	}

	public void setFrequenceDePrise(String frequenceDePrise) {
		FrequenceDePrise = frequenceDePrise;
	}

	public String getNombreParPrise() {
		return NombreParPrise;
	}

	public void setNombreParPrise(String nombreParPrise) {
		NombreParPrise = nombreParPrise;
	}

	public String getDureePrise() {
		return DureePrise;
	}

	public void setDureePrise(String dureePrise) {
		DureePrise = dureePrise;
	}

	public String getPeriodePrise() {
		return PeriodePrise;
	}

	public void setPeriodePrise(String periodePrise) {
		PeriodePrise = periodePrise;
	}

}
