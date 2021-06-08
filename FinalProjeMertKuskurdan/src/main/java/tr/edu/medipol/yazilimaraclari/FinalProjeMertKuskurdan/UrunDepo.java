package tr.edu.medipol.yazilimaraclari.FinalProjeMertKuskurdan;

import java.util.*; 

public final class UrunDepo {
	
	private static final List<Urun> URUNLER = new ArrayList<>();
	
	static {
		URUNLER.add(new Urun("Klavye", "1"));
		URUNLER.add(new Urun("Mouse", "2"));
		URUNLER.add(new Urun("Kulaklık", "3"));
		URUNLER.add(new Urun("Webcam", "4"));


	}
	
	private UrunDepo() {
		
	}
	
	public static List<Urun> urunleriListele(){
		return URUNLER;
	}
	 
	public static List<Urun> urunEkle(Urun urun) {
		URUNLER.add(urun);
		return URUNLER;
	}
	
	public static List<Urun> urunSil(String numara){
		for(Urun u : URUNLER) {
			if(u.getNumara().equals(numara)) {
				URUNLER.remove(u);
			}
		}
		
		return URUNLER;
	}
}