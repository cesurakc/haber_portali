package models;



import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblhaber {
	
	@Id
	@SequenceGenerator(name="sq_haber",sequenceName="sq_tblhaber_id",allocationSize=1,initialValue=1)
	@GeneratedValue(generator="sq_haber")
	
	
	int id;
    String baslik;
    String ozet;
    int kategoriId;
    String resimurl;
    String kucukresimurl;
    String tarih;
    String goruntulemesayi;
    public int getSil_id() {
		return sil_id;
	}
	public void setSil_id(int sil_id) {
		this.sil_id = sil_id;
	}
	int sil_id;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBaslik() {
		return baslik;
	}
	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}
	public String getOzet() {
		return ozet;
	}
	public void setOzet(String ozet) {
		this.ozet = ozet;
	}
	public int getKategoriId() {
		return kategoriId;
	}
	public void setKategoriId(int kategoriId) {
		this.kategoriId = kategoriId;
	}
	public String getResimurl() {
		return resimurl;
	}
	public void setResimurl(String resimurl) {
		this.resimurl = resimurl;
	}
	public String getKucukresimurl() {
		return kucukresimurl;
	}
	public void setKucukresimurl(String kucukresimurl) {
		this.kucukresimurl = kucukresimurl;
	}
	public String getTarih() {
		return tarih;
	}
	public void setTarih(String tarih) {
		this.tarih = tarih;
	}
	public String getGoruntulemesayi() {
		return goruntulemesayi;
	}
	public void setGoruntulemesayi(String goruntulemesayi) {
		this.goruntulemesayi = goruntulemesayi;
	}
	public int getTipid() {
		return tipid;
	}
	public void setTipid(int tipid) {
		this.tipid = tipid;
	}
	int tipid;
}
