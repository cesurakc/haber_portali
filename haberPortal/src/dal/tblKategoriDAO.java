package dal;

import util.vtIsletimcisi;


import models.tblkategori;

public class tblKategoriDAO extends vtIsletimcisi<tblkategori>{

	public void sil0(int id)
	{
		 tblKategoriDAO item= new tblKategoriDAO();
		   tblkategori tbl=item.bul(id, new tblkategori());
		   tbl.setSil_id(0);
		   
		  
		   item.duzenle(tbl);
		  
	}
	
	
  
	
}

