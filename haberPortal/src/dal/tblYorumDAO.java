package dal;


import models.tblyorum;
import util.vtIsletimcisi;

public class tblYorumDAO  extends vtIsletimcisi<tblyorum>{
	
	public void guncelle(int id)
	{
		tblYorumDAO db= new tblYorumDAO();
		
		
		   tblyorum tbl=db.bul(id, new tblyorum ());
		   tbl.setSil_id(1);
		   db.duzenle(tbl);
	}
	
	public void onaybekleyenyorum(int id)
	
	{
		
		tblYorumDAO db= new tblYorumDAO();
		
		
		   tblyorum tbl=db.bul(id, new tblyorum ());
		   tbl.setSil_id(0);
		   db.duzenle(tbl);
		
	}

}
