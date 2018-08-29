package models;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblyazar {
	
	@Id
	@SequenceGenerator(name="sq_yazar",sequenceName="sq_tblyazar_id",allocationSize=1,initialValue=1)
	@GeneratedValue(generator="sq_yazar")
	int id;
	String adsoyad;
	String resimurl;
	String telefon;
	String email;
	int kategoriid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdsoyad() {
		return adsoyad;
	}
	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}
	public String getResimurl() {
		return resimurl;
	}
	public void setResimurl(String resimurl) {
		this.resimurl = resimurl;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getKategoriid() {
		return kategoriid;
	}
	public void setKategoriid(int kategoriid) {
		this.kategoriid = kategoriid;
	}
	
	

}
