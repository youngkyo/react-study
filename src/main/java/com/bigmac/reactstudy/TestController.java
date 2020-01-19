package com.bigmac.reactstudy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {

	@GetMapping("/{name}")
	public String test(@PathVariable String name, Model model) {
		model.addAttribute("pageName", name);
		return "page";
	}
}
