package Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pregled") // putanja - appName/pregled
public class Pregled {
	
	@RequestMapping(value={"","/"}) // nastavak putanje - appName/pregled/
	public String helloWorld() {
		return "pregled/pregled"; // mapa/datoteka u jsp mapi
	}
	
	@RequestMapping(value={"pregled"} )//, method = RequestMethod.GET) - moze se ograniciti na specificnu metodu (POST, GET, ...)
	public String prijava(HttpServletRequest request, Model model) {
		model.addAttribute("naslov", "Prijava"); // atributu se pristupa u .jsp datoteci preko ${naslov} - moze biti bilo koji tip podataka
		return "prijava"; // datoteka u jsp mapi
	}
}
