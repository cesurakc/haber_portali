package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

import dal.tblUsersDAO;
import models.tblhaber;
import models.tblkategori;
import models.tblusers;
import util.StaticValues;

@ManagedBean
@SessionScoped
public class kullaniciBean {


	private String ad;
	private String sifre;
	private String resimurl;
	private int silineckid=0;
	String dosyaadi;
	
	
	private int guncelleid;
    tblUsersDAO db= new tblUsersDAO();
    private tblusers user= new tblusers();
	  
	private List<tblusers> listekullanici= new ArrayList<>();
	
	private Part file;
	   
	public tblusers getUser() {
	return user;
}






public int getGuncelleid() {
		return guncelleid;
	}






	public void setGuncelleid(int guncelleid) {
		this.guncelleid = guncelleid;
	}






public void setUser(tblusers user) {
	this.user = user;
}

public List<tblusers> getListekullanici() {
	return db.listA(new tblusers());
}
public void setListekullanici(List<tblusers> listekullanici) {
	this.listekullanici = listekullanici;
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
public String getResimurl() {
	return resimurl;
}
public void setResimurl(String resimurl) {
	this.resimurl = resimurl;
}
public int getSilineckid() {
	return silineckid;
}
public void setSilineckid(int silineckid) {
	this.silineckid = silineckid;
}
public Part getFile() {
	return file;
}
public void setFile(Part file) {
	this.file = file;
}
public void sil()
{
	  
	  
	  if(silineckid!=0)
	  {
		  
		  db.sil2(silineckid);
	  }
}

public String kullaniciguncelle()
{
	
	tblUsersDAO db= new tblUsersDAO();
	db.KullaniciGuncelle(user.getId(), user.getAd(), user.getSifre());
	 user.setAd("");
	 user.setSifre("");
	 return "/kullanici.jsf?faces-redirect=true";
	
	 
	
	
}


public String guncellekullanici()
{
	
	StaticValues.kullaniciid=guncelleid;
	user=db.bul(StaticValues.kullaniciid, new tblusers());
	return "/kullanici.jsf?faces-redirect=true";
	
	
	
}
public void kaydet()
{
	  upload();
	  tblusers item= new tblusers();
	  item.setAd(ad);
	  item.setSifre(sifre);
	  item.setResimurl(dosyaadi);
	  item.setSil_id(1);
	  db.kaydet(item);


}

public String getFileName(Part part)
	{
		for(String cd:part.getHeader("content-disposition").split(";"))
	        if(cd.trim().startsWith("filename")){
	            String filename=cd.substring(cd.indexOf('=')+1).trim().replace("\"", "");
	            return filename;
	        }
	    return "";
	            
	}
public void upload()
{
	
	
	dosyaadi=getFileName(file);
	String dizin=FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
 
  try{
  file.write(dizin+"\\resources\\images\\"+dosyaadi);
  }
  catch(Exception ex)
  {
      System.err.print(ex);
  }
}





	
	
}
