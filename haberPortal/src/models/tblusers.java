package models;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblusers {

	@Id
	@SequenceGenerator(name="sq_users",sequenceName="sq_tblusers_id",allocationSize=1,initialValue=1)
	@GeneratedValue(generator="sq_users")
	
	int id;
	String ad;
	String sifre;
	String resimurl;
	int sil_id;
	
	
	public String getResimurl() {
		return resimurl;
	}
	public void setResimurl(String resimurl) {
		this.resimurl = resimurl;
	}
	public int getSil_id() {
		return sil_id;
	}
	public void setSil_id(int sil_id) {
		this.sil_id = sil_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	
	
	
}
