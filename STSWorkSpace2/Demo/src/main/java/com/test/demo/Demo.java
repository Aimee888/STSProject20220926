package com.test.demo;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.SessionAttributes;  
import org.springframework.web.servlet.mvc.support.RedirectAttributes;  
import org.springframework.ui.Model;
import javax.annotation.Resource;
import java.util.Enumeration;

import com.free.entity.User;
import com.free.service.UserService;

@Controller
@SessionAttributes("User")
public class Demo {
	
	private static final Logger logger = LoggerFactory.getLogger(Demo.class);
	
	@Resource
    public UserService userService;
	
	@RequestMapping(value = "/")
	public String ShowLogin(){
		return "login";
	}
	
	// 点击login时触发
	@RequestMapping(value="/loginOn", method=RequestMethod.POST)
	public ModelAndView Login(HttpServletRequest request, Model model, ModelAndView view, RedirectAttributes redirectAttributes)
	{
		logger.info("======================================");
		System.out.print("Start");
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		User user = userService.login(name, password); 
		if(user != null)
        {
            model.addAttribute("User", user);

            view.setViewName("redirect:/loginOn");
        }
        else
        {
            redirectAttributes.addFlashAttribute("Error", " * Wrong name or password.");
            view.setViewName("redirect:/");
        }
		
		return view;
	}

	
	@RequestMapping(value="/loginOn") 
	public ModelAndView ShowLoginOn(ModelAndView view) 
	{ 
		logger.info("====================Move to login on==================");
		System.out.print("123");
		view.setViewName("loginOn"); 
		return view; 
	}
	 

}