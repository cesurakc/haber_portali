package beans;

import java.util.ArrayList;

import java.util.List;
import models.tblkategori;
import util.StaticValues;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

import dal.tblHaberDAO;
import dal.tblKategoriDAO;
import models.tblhaber;


@ManagedBean(name="haberBean")
@SessionScoped
public class haberBean {
	
	
	private String baslik;
	private int kategoriid;
	private String ozet;
	private String tarih;
	private String resimurl;
	private int silinecekid=0;
	int haberdetayid;
	 private Part file;
	 String dosyaadi;
	
	
	
	tblHaberDAO db= new tblHaberDAO();
	

	tblKategoriDAO db2= new tblKategoriDAO();
	
	private List<tblhaber> listehaber= new ArrayList<>();
	private List<tblhaber> listehaber2= new ArrayList<>();
	private List<tblkategori> listekategori= new ArrayList<>();
	private List<tblhaber> listehaber1= new ArrayList<>();
	
	
	public List<tblhaber> getListehaber2() {
		return db.listeleme(new tblhaber());
	}

	public void setListehaber2(List<tblhaber> listehaber2) {
		this.listehaber2 = listehaber2;
	}

	public List<tblhaber> getListehaber1() {
		return db.listA(new tblhaber());
	}

	public void setListehaber1(List<tblhaber> listehaber1) {
		this.listehaber1 = listehaber1;
	}
	
	

	
	

	public void kaydet()
	{
		
		upload();
		tblhaber tbl= new tblhaber();
		 tbl.setBaslik(baslik);
		 tbl.setOzet(ozet);
		 tbl.setTarih(tarih);
		 tbl.setResimurl(dosyaadi);
		 tbl.setSil_id(1);
		 tbl.setKategoriId(kategoriid);
		 
		 db.kaydet(tbl);
		
		
		
		 
		
		
		
	}
	
	public String haberdetay() {
		
		
		StaticValues.secilenhaber = haberdetayid;
		 return "/haberdetay.jsf?faces-redirect=true";
		
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
	
	
	
	
	public List<tblkategori> getListekategori() {
		return db2.listA(new tblkategori());
	}


	public void setListekategori(List<tblkategori> listekategori) {
		this.listekategori = listekategori;
	}

	
	
	
	
	 public void sil()
	 {
		 
		 if(silinecekid!=0)
		 {
			 db.sil1(silinecekid);
			 
		 }
		 
	 }
	
	 
	 public Part getFile() {
			return file;
		}


		public void setFile(Part file) {
			this.file = file;
		}
		
	    
	
	public List<tblhaber> getListehaber() {
		return db.listeslider(new tblhaber());
	}
	public void setListehaber(List<tblhaber> listehaber) {
		this.listehaber = listehaber;
	}
	public int getSilinecekid() {
		return silinecekid;
	}
	public void setSilinecekid(int silinecekid) {
		this.silinecekid = silinecekid;
	}
	public String getBaslik() {
		return baslik;
	}
	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}
	public int getKategoriid() {
		return kategoriid;
	}
	public void setKategoriid(int kategoriid) {
		this.kategoriid = kategoriid;
	}
	
	public String getOzet() {
		
		return ozet;
		
		
	}

	public void setOzet(String ozet) {
		
		
		this.ozet = ozet;
		
	}

	public String getTarih() {
		
	
		return tarih;
	}
	public void setTarih(String tarih) {
		this.tarih = tarih;
	}
	public String getResimurl() {
		return resimurl;
	}
	public void setResimurl(String resimurl) {
		this.resimurl = resimurl;
	}

	public int getHaberdetayid() {
		return haberdetayid;
	}

	public void setHaberdetayid(int haberdetayid) {
		this.haberdetayid = haberdetayid;
	}
	
	
	
	

	
	
	
	
	

}
