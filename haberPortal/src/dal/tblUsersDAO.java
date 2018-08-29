package dal;

import util.vtIsletimcisi;
import models.tblusers;

public class tblUsersDAO extends vtIsletimcisi<tblusers> {

	
	
	public void sil2(int id)
	{
		tblKullaniciDAO item= new tblKullaniciDAO();
		 tblusers tbl=item.bul(id, new tblusers());
		   tbl.setSil_id(0);
		   item.duzenle(tbl);
	}
}
