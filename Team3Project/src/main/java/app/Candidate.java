package app;

import java.io.Serializable;

/**
 * @author Miska
 */

public class Candidate implements Serializable, Comparable<Candidate>{
	
	private int ehdokas_id;
	private String sukunimi;
	private String etunimi;
	private String puolue;
	private String kotipaikkakunta;
	private int ika;
	private String miksi_eduskuntaan;
	private String mita_asioita_haluat_edistaa;
	private String ammatti;
	private int pisteet;
	
	public Candidate(){		
	}
	
	public Candidate(String sukunimi, String etunimi, String puolue, String koti, int ika, String miksi, String mita, String ammatti){
		this.sukunimi = sukunimi;
		this.etunimi = etunimi;
		this.puolue = puolue;
		this.kotipaikkakunta = koti;
		setIka(ika);
		this.miksi_eduskuntaan = miksi;
		this.mita_asioita_haluat_edistaa = mita;
		this.ammatti = ammatti;
		
	}
	
	public Candidate(int ehdokas_id, String sukunimi, String etunimi, String puolue, String koti, int ika, String miksi, String mita, String ammatti){
		setEhdokas_id(ehdokas_id);
		this.sukunimi = sukunimi;
		this.etunimi = etunimi;
		this.puolue = puolue;
		this.kotipaikkakunta = koti;
		setIka(ika);
		this.miksi_eduskuntaan = miksi;
		this.mita_asioita_haluat_edistaa = mita;
		this.ammatti = ammatti;
		
	}
	
	public Candidate(String ehdokas_id, String sukunimi, String etunimi, String puolue, String koti, String ika, String miksi, String mita, String ammatti){
		setEhdokas_id(ehdokas_id);
		this.sukunimi = sukunimi;
		this.etunimi = etunimi;
		this.puolue = puolue;
		this.kotipaikkakunta = koti;
		setIka(ika);
		this.miksi_eduskuntaan = miksi;
		this.mita_asioita_haluat_edistaa = mita;
		this.ammatti = ammatti;
		
	}
	
	public Candidate(String sukunimi, String etunimi, String puolue, String koti, String ika, String miksi, String mita, String ammatti){
		this.sukunimi = sukunimi;
		this.etunimi = etunimi;
		this.puolue = puolue;
		this.kotipaikkakunta = koti;
		setIka(ika);
		this.miksi_eduskuntaan = miksi;
		this.mita_asioita_haluat_edistaa = mita;
		this.ammatti = ammatti;
		
	}
	
	public void setPisteet(int p) {
		this.pisteet = p;
	}
	
	public int getPisteet() {
		return pisteet;
	}
	
	public int getEhdokas_id() {
		return ehdokas_id;
	}
	
	public void setEhdokas_id(int ehdokas_id) {
		this.ehdokas_id = ehdokas_id;
	}
	
	public void setEhdokas_id(String ehdokas_id) {
		
		try {
			this.ehdokas_id = Integer.parseInt(ehdokas_id);
		}
		catch(NumberFormatException | NullPointerException e) {

		}
	}
	
	public String getSukunimi() {
		return sukunimi;
	}
	
	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	
	public String getEtunimi() {
		return etunimi;
	}
	
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	
	public String getPuolue() {
		return puolue;
	}
	
	public void setPuolue(String puolue) {
		this.puolue = puolue;
	}
	
	public String getKotipaikkakunta() {
		return kotipaikkakunta;
	}
	
	public void setKotipaikkakunta(String kotipaikkakunta) {
		this.kotipaikkakunta = kotipaikkakunta;
	}
	
	public int getIka() {
		return ika;
	}
	
	public void setIka(int ika) {
		this.ika = ika;
	}
	
	public void setIka(String ika) {
		
		try {
			this.ika = Integer.parseInt(ika);
		}
		catch(NumberFormatException | NullPointerException e) {

		}
	}
	
	public String getMiksi_eduskuntaan() {
		return miksi_eduskuntaan;
	}
	
	public void setMiksi_eduskuntaan(String miksi_eduskuntaan) {
		this.miksi_eduskuntaan = miksi_eduskuntaan;
	}
	
	public String getMita_asioita_haluat_edistaa() {
		return mita_asioita_haluat_edistaa;
	}
	
	public void setMita_asioita_haluat_edistaa(String mita_asioita_haluat_edistaa) {
		this.mita_asioita_haluat_edistaa = mita_asioita_haluat_edistaa;
	}
	
	public String getAmmatti() {
		return ammatti;
	}
	
	public void setAmmatti(String ammatti) {
		this.ammatti = ammatti;
	}
	
	@Override
	public int compareTo(Candidate c) {		
		int compare = Integer.compare(pisteet, c.pisteet);
		return compare;
	}
}