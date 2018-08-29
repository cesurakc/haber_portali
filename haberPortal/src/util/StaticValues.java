package util;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class StaticValues {
	
	public static String kullanici;
	public static int kullaniciid;
	public static int getKullaniciid() {
		return kullaniciid;
	}
	public static void setKullaniciid(int kullaniciid) {
		StaticValues.kullaniciid = kullaniciid;
	}
	public static String kullaniciresim;
	public static int secilenhaber;
	public static int secilenkategori;
	
	public static String getKullanici() {
		return kullanici;
	}
	public static void setKullanici(String kullanici) {
		StaticValues.kullanici = kullanici;
	}
	public static int getSecilenkategori() {
		return secilenkategori;
	}
	public static void setSecilenkategori(int secilenkategori) {
		StaticValues.secilenkategori = secilenkategori;
	}
	public static int getSecilenhaber() {
		return secilenhaber;
	}
	public static void setSecilenhaber(int secilenhaber) {
		StaticValues.secilenhaber = secilenhaber;
	}

	
	
}
