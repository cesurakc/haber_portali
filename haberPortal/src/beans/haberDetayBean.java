package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dal.tblHaberDAO;
import models.tblhaber;
import util.StaticValues;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class haberDetayBean {
	private int guncelleid;
	private tblhaber haber= new tblhaber();
	tblHaberDAO db= new tblHaberDAO();
	
	
	public String haberGuncelle()
	
	{
	tblHaberDAO db1= new tblHaberDAO();
	 db1.HaberGuncelle(haber.getId() ,haber.getBaslik(), haber.getOzet(), haber.getTarih(),haber.getResimurl());
	 return "/haber.jsf?faces-redirect=true";
	}
	
	public tblhaber getHaber() {
		return  haber;
	}
	public void setHaber(tblhaber haber) {
		this.haber = haber;
	}
	public String  guncellehaber()
	{
		StaticValues.secilenhaber=guncelleid;
		haber=db.bul(StaticValues.secilenhaber, new tblhaber());
		return "/haber.jsf?faces-redirect=true";
		
		
	}

	public int getGuncelleid() {
		return guncelleid;
	}

	public void setGuncelleid(int guncelleid) {
		this.guncelleid = guncelleid;
	}

	public void temizle()
	{
		
		
		haber.setBaslik("");
		haber.setOzet("");
		haber.setTarih("");
				
		
	}
	
}
