package dal;

import util.vtIsletimcisi;

import models.tblhaber;

public class tblHaberDAO extends vtIsletimcisi<tblhaber> {
	
	public void sil1(int id)
	{
		
		tblHaberDAO item= new tblHaberDAO();
		
		tblhaber tbl=item.bul(id, new tblhaber());
        tbl.setSil_id(0);
      
        item.duzenle(tbl);
		
		
		
	}
	
	

}
