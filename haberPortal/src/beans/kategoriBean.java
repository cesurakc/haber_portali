package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

import models.tblkategori;
import util.StaticValues;
import dal.tblKategoriDAO;
import dal.tblKullaniciDAO;

@ManagedBean
@SessionScoped
public class kategoriBean {

	
	private String ad;
	private String aciklama;
	private String resimurl;
	private int silineckid=0;
	private int guncelleid;
	
	String dosyaadi;
	
	private Part file;
	tblKategoriDAO db= new tblKategoriDAO();
	
	
	private tblkategori kategori= new tblkategori();
	private List<tblkategori> liste= new ArrayList<>();

	

   public int getGuncelleid() {
		return guncelleid;
	}



	public void setGuncelleid(int guncelleid) {
		this.guncelleid = guncelleid;
	}






public String  guncellekategori()
{
	StaticValues.secilenkategori=guncelleid;
	kategori=db.bul(StaticValues.secilenkategori,new tblkategori());
	
	
	
	return "/kategori.jsf?faces-redirect=true";
	
}






	
  public void sil()
  {
	  
	  
	  if(silineckid!=0)
	  {
		  
		  db.sil0(silineckid);
	  }
  }

  public String KategoriGuncelle()
  {
	 tblKategoriDAO dbkat= new tblKategoriDAO();
	  dbkat.KategoriGuncelleme(kategori.getId(), kategori.getAd(),kategori.getAciklama());
     
	  
	  return "index.jsf?faces-redirect=true";
  }
	
  

  
  
public tblkategori getKategori() {
	return kategori;
}



public void setKategori(tblkategori kategori) {
	this.kategori = kategori;
}



public Part getFile() {
		
	
	return file;
}
public void setFile(Part file) {
	
	this.file = file;
}

	public int getSilineckid() {
		return silineckid;
	}
	public void setSilineckid(int silineckid) {
		this.silineckid = silineckid;
	}
	public List<tblkategori> getListe() {
		return db.listA(new tblkategori());
	}
	public void setListe(List<tblkategori> liste) {
		this.liste = liste;
	}

	
	
	
	
	
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public String getResimurl() {
		return resimurl;
	}
	public void setResimurl(String resimurl) {
		this.resimurl = resimurl;
	}
	
	
	
	
	
	
	
	  public void kaydet()
	  {
		  upload();
		  tblkategori tbl= new tblkategori();
		  
		  tbl.setAd(ad);
		  tbl.setAciklama(aciklama);
		  tbl.setResimurl(dosyaadi);
		  tbl.setSil_id(1);
		  db.kaydet(tbl);


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
	    System.out.println(dizin);
	    try{
	    file.write(dizin+"\\resources\\images\\"+dosyaadi);
	    }
	    catch(Exception ex)
	    {
	        System.err.print(ex);
	    }
	}
	
	
	
	
	
	
	
	
	
	
}

	

