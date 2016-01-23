package com.mymvc.myapp;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mymvc.myapp.model.Form;


@Controller
public class IshmamLogin {
	
	
	@RequestMapping(value="/login" ,method = RequestMethod.GET)
	
	public ModelAndView showLogInForm() {
		System.out.println("in log in controller");
		ModelAndView mv = new ModelAndView("LogInForm");
		
 		return mv;
	}
	
	@RequestMapping(value="mmm.html" ,method = RequestMethod.GET)
	public ModelAndView displayForm(@Valid @ModelAttribute("form1") Form form,BindingResult result) {
		//System.out.println("sadnksadnfclk");
		
		
		if (result.hasErrors()){
			ModelAndView mv = new ModelAndView("tob");
			return mv;
		 }
		    else {
		    	ModelAndView mv = new ModelAndView("FormDetails");
		 		mv.addObject("welcome","welcome to form");
		 		
		 		//System.out.println(form.getName());
			    return mv;
		    }
 		
	}
}
