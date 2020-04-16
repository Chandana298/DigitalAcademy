package com.nttdata.Controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nttdata.Model.User;

@Controller
public class RegistrationController {
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	  public String showForm(Model model) {
	    model.addAttribute("registration", new User());
	    return "register";
	  }

	  @RequestMapping(value = "/processForm", method = RequestMethod.POST)
	  public String processForm(@Valid @ModelAttribute("registration") User register,
	      BindingResult bindingResult) {
	    if (bindingResult.hasErrors()) {
	      return "register";
	    } else {
	      return "success";
	    }

	  }

}
