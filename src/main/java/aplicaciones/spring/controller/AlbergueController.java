package aplicaciones.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import aplicaciones.spring.entity.Albergue;
import aplicaciones.spring.service.IAlbergueService;

@Controller
public class AlbergueController {

	@Autowired
	private IAlbergueService albergueService;
	
	@GetMapping("/regionsform")
	public String regionform(Model model) {
		model.addAttribute("albergue", new Albergue());
		return "regionform";
	}
	
	@GetMapping("/region")
	public String buscarPorRegion(@RequestParam String region, Model model, @ModelAttribute("albergue") Albergue albergue) {
		model.addAttribute("alberguePorRegion", albergueService.buscarPorRegion(region));
		return "regionform";
	}
}
