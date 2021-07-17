package com.hosto.beans;

import com.hosto.DAO.ConsulterMDao;

public class ConsultationM extends ConsulterMDao{
	
	public static final String ConsulterMDao = null;
	private int IdConsultationM;
	private String PerimCranien;
	private String PerimBracial;
	private String PerimThoracique;
	private String SegmentInf;
	private String SegmentSup;
	private String FreqCardiaque;
	private String FreqThoracique;
	private String Patient;
	
	public ConsultationM(int idConsultationM, String perimCranien, String perimBracial, String perimThoracique,
			String segmentInf, String segmentSup, String freqCardiaque, String freqThoracique, String patient) {
		
		this.setIdConsultationM(idConsultationM);
		this.setPerimCranien(perimCranien);
		this.setPerimBracial(perimBracial);
		this.setPerimThoracique(perimThoracique);
		this.setSegmentInf(segmentInf);
		this.setSegmentSup(segmentSup);
		this.setFreqCardiaque(freqCardiaque);
		this.setFreqThoracique(freqThoracique);
		this.setPatient(patient);
	}

	public ConsultationM(String perimCranien2, String perimBracial2, String perimThoracique2, String segmentInf2,
			String segmentSup2, String freqCardiaque2, String freqThoracique2, String Patient) {
		
		this.setPerimCranien(perimCranien2);
		this.setPerimBracial(perimBracial2);
		this.setPerimThoracique(perimThoracique2);
		this.setSegmentInf(segmentInf2);
		this.setSegmentSup(segmentSup2);
		this.setFreqCardiaque(freqCardiaque2);
		this.setFreqThoracique(freqThoracique2);
		this.setPatient(Patient);
	}

	public ConsultationM() {
		// TODO Auto-generated constructor stub
	}

	public int getIdConsultationM() {
		return IdConsultationM;
	}

	public void setIdConsultationM(int idConsultationM) {
		IdConsultationM = idConsultationM;
	}

	public String getPerimCranien() {
		return PerimCranien;
	}

	public void setPerimCranien(String perimCranien) {
		PerimCranien = perimCranien;
	}

	public String getPerimBracial() {
		return PerimBracial;
	}

	public void setPerimBracial(String perimBracial) {
		PerimBracial = perimBracial;
	}

	public String getPerimThoracique() {
		return PerimThoracique;
	}

	public void setPerimThoracique(String perimThoracique) {
		PerimThoracique = perimThoracique;
	}

	public String getSegmentInf() {
		return SegmentInf;
	}

	public void setSegmentInf(String segmentInf) {
		SegmentInf = segmentInf;
	}

	public String getSegmentSup() {
		return SegmentSup;
	}

	public void setSegmentSup(String segmentSup) {
		SegmentSup = segmentSup;
	}

	public String getFreqCardiaque() {
		return FreqCardiaque;
	}

	public void setFreqCardiaque(String freqCardiaque) {
		FreqCardiaque = freqCardiaque;
	}

	public String getFreqThoracique() {
		return FreqThoracique;
	}

	public void setFreqThoracique(String freqThoracique) {
		FreqThoracique = freqThoracique;
	}

	public String getPatient() {
		return Patient;
	}

	public void setPatient(String patient2) {
		Patient = patient2;
	}
	
	
	
	

}
