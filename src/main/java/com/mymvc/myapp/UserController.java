package com.mymvc.myapp;

import com.mymvc.myapp.model.User;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;


@Controller
public class UserController {

   @RequestMapping(value = "/user", method = RequestMethod.GET)
   public String user(ModelMap model,User user) {
	   model.addAttribute("user",user);
	   return "user";
   }
   
   @RequestMapping(value = "/addUser", method = RequestMethod.POST)
   public String addUser(ModelMap model, @Valid User valid_user,
		   BindingResult result) {

	   model.addAttribute("name", valid_user.getName());
       model.addAttribute("age", valid_user.getAge());
       model.addAttribute("id", valid_user.getId());
	   String returnVal; 
	      if(result.hasErrors()){	    	
	          returnVal = "user";
	      }
	      else{
	          returnVal = "results";
	      }
	    	  
	      return returnVal;
   }
}