package tr.edu.medipol.yazilimaraclari.FinalProjeMertKuskurdan;

import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
@RequestMapping("/urun")
public class UrunRestApi {

	@GetMapping("/lıstele")
	public List<Urun> listele(){
		return UrunDepo.urunleriListele();
	}
	
	@PostMapping("/ekle")
	public Urun ekle(@RequestBody Urun urun) {
		UrunDepo.urunEkle(urun);
		return urun;
	}
	
	@PostMapping("/sil")
	public Urun sil(String numara) {
		UrunDepo.urunSil(numara);
		return null;
	}
} 
