package beans;

import dal.tblKategoriDAO;
import models.tblkategori;

public class deneme {

	
	public static void main(String[] args) {
		tblKategoriDAO db= new tblKategoriDAO();
		
		
		for (tblkategori item :db.listA(new tblkategori())) {
			
			System.err.println("Kategori Adý"+item.getAd());
		}

	}

}
