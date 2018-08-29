package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import UtilLoginFilter.NaviGationBean;
import dal.tblYorumDAO;
import models.tblyorum;

@ManagedBean
@SessionScoped

public class yorumBean {

	private String adsoyad;
	private String email;
	private String icerik;
	private int guncellenecekid=1;
	private NaviGationBean navigationBean;
	tblyorum tbl1= new tblyorum();
	 tblYorumDAO db= new tblYorumDAO();
	 private List<tblyorum> tbl= new ArrayList<>();
	 private List<tblyorum> tbl2= new ArrayList<>();
	  

	public List<tblyorum> getTbl2() {
		return db.listA(new tblyorum());
	}
	public void setTbl2(List<tblyorum> tbl2) {
		this.tbl2 = tbl2;
	}
	
	  public NaviGationBean getNavigationBean() {
		return navigationBean;
	}
	public void setNavigationBean(NaviGationBean navigationBean) {
		this.navigationBean = navigationBean;
	}
	

	
	public List<tblyorum> getTbl() {
	return db.listB(new tblyorum());
}
public void setTbl(List<tblyorum> tbl) {
	this.tbl = tbl;
}
	public void  kaydet()
	{
		
		
			
		tbl1.setAdsoyad(adsoyad);
		tbl1.setEmail(email);
		tbl1.setIcerik(icerik);
		
		db.kaydet(tbl1);
		
		adsoyad="";
		email="";
		icerik="";
	
		
		
		
	}
	
	public void yorumguncel()
	{
		
		if(guncellenecekid!=1)
		{
			
			db.onaybekleyenyorum(guncellenecekid);
			
		}
	}
	
	
	
	
	public void guncel()
	  {
		
		if(guncellenecekid!=1)
		{
			
			db.guncelle(guncellenecekid);
			
		}
		  
		
	  }		
	
	public int getGuncellenecekid() {
		return guncellenecekid;
	}
	public void setGuncellenecekid(int guncellenecekid) {
		this.guncellenecekid = guncellenecekid;
	}
	public String getAdsoyad() {
		return adsoyad;
	}
	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIcerik() {
		return icerik;
	}
	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}
	
}
