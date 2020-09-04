package co.grandcircus.Famouslab;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FamousController {

	@Autowired
	private FamousApi api;
	
	@RequestMapping("/")
	public String showTinyList(Model model){
		List<Tiny> tiny=api.showTinyList();
		model.addAttribute("tiny",tiny);
		return "show-tiny";	
	}
	
	@RequestMapping("/complete")
	public String showCompleteList(Model model) {
		List<Complete> complete=api.showCompleteList();
		model.addAttribute("complete",complete);
		return "show-complete";
	}
}
