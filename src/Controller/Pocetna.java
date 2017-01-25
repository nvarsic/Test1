package Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class Pocetna {
	
	//@RequestMapping(value={"","/"})
	public String helloWorld() {
		return "/welcome";
	}
	
	 @RequestMapping(path = "/prijava", method = RequestMethod.GET)
	public String prijava(HttpServletRequest request, Model model) {
		model.addAttribute("naslov", "Prijava");
		return "prijava";
	}
}
