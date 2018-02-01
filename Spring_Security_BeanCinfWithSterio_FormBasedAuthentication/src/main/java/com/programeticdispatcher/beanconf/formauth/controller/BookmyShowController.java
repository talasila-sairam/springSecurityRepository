package com.programeticdispatcher.beanconf.formauth.controller;



import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookmyShowController {
	public BookmyShowController() {
		System.out.println("inside BookMyShowController constructor");
	}
	@RequestMapping("/form-login.htm")
   public String bookMyShow(HttpServletRequest request ,Model model) {
	   System.out.println("inside bookMyShow method");
	   List<String> movies = null;
	   if(request.getParameter("error") !=null && request.getParameter("error").equals("failed") ) {
		   model.addAttribute("error", "invalid username and password");
	   }
	   movies = new ArrayList<String>();
	   movies.add("movie1");
	   movies.add("movie2");
	   movies.add("movie3");
	   movies.add("movie4");
	   model.addAttribute("movies", movies);
	   return "form-login";
   }
}
