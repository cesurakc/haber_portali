package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import util.StaticValues;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class indexBean {

	private String url;
	private int id=1;
	private String kullaniciadi;
	private String resim;
	
	public String getResim() {
		return StaticValues.kullaniciresim;
	}


	


	public void urlVer() {
		switch (id) {
		case 1: url ="kategori.xhtml";break;
		case 2: url="haber.xhtml"; break;
		case 3: url="kullanici.xhtml";break;
		case 4: url="yorumlar.xhtml"; break;
		case 5: url="detay.xhtml"; break;
		case 6: url="tumyorumlar.xhtml"; break;
		case 7: url="kategoridetay.xhtml"; break;
		case 8: url="haberguncelle.xhtml";break;
		case 9: url="kullaniciguncelle.xhtml";break;
		
		
		default: url = "";break;
		}
		
				
	}


	public String getKullaniciadi() {
		return StaticValues.kullanici;
	}


	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
	
}

	
	
	
	

