package com.example.demo.controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.User;
import com.example.demo.model.UserRepository;

@Controller

public class UserController {
	@Autowired
	UserRepository userrep;
	
	@RequestMapping("/shopfromhome")
	public String getLink()
	{
		
		return ("link");
	}
	
	
	@RequestMapping("/inewaccont")
	public ModelAndView getForm()
	{
		System.out.println("Coming here");
		return new ModelAndView("createaccountform","logobj",new User());
	}
	
	
	@RequestMapping("/ilogin")
	public ModelAndView getlogin()
	{
		return new ModelAndView("loginform","loginobj",new User());
	}
	
	@RequestMapping("/check")
	public String check(@ModelAttribute("loginobj") User log1)
	{
		System.out.println("hi");
		String one;
		Optional<User> eobj=userrep.findByusername(log1.getUsername());
		System.out.println(eobj);

		if(eobj.isPresent())
		{
			 one = "success";
		}else {
			 one = "nope";
		}
		System.out.println(one);

		return one;

		
		

			
	}

	
	@RequestMapping("/saveUser")
	public String display(@ModelAttribute("logobj") User log1)
	{
		userrep.save(log1);
		//it will insert details in database
		return "success";
	}
	
	
	
	

}