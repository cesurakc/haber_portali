package util;

import java.util.List;

public interface Icrud<T> {
	 public boolean kaydet(T t);
	    public boolean duzenle(T t);
	    public boolean sil(T t);
	    public List<T> listele(T t);
	    public T bul(int id, T t);
	    public void KategoriGuncelleme(int id,String ad,String aciklama);
	    public void KullaniciGuncelle(int id,	String ad,String sifre);
	    public void HaberGuncelle(int id,String baslik,String ozet,String tarih, String resimurl);
	    public List<T> ara(String kolon,String deger,T t);
	    public List<T> araFull(String kolon,String deger,T t);
		   
	    public List<T> ara(T t);
	    public List<T> listeleme(T t);
}
