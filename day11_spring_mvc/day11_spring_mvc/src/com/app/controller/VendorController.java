package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Vendor;
import com.app.service.VendorService;

@Controller
@RequestMapping("/vendor")
public class VendorController {
	@Autowired // autowire=byType
	// SC checks is there any dependency bean which has
	// implemented VendorService ?????
	private VendorService service;

	public VendorController() {
		System.out.println("in constr of " + getClass().getName());
	}

	// request handling method for showing login form
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/vendor/login";
	}

	// request handling method for processing login form
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String email, @RequestParam String pass, Model map, HttpSession hs,RedirectAttributes flashMap) {
		System.out.println("in process login form");
		// invoke service layer fro user validation
		Vendor details = service.validateUser(email, pass);
		if (details != null) {
		flashMap.addFlashAttribute("mesg", "Login Successful!!!");
			// valid login
			if (details.getRole().equals("vendor")) {
				//vendor login
				hs.setAttribute("vendor_dtls", details);
				return "redirect:/vendor/details";
			} else if (details.getRole().equals("admin")) {
				//admin login
				flashMap.addFlashAttribute("vendor_list",service.listVendors());
				return "redirect:/vendor/list";
			}
		}
		//invalid login
		map.addAttribute("mesg", "Invalid Login Pls retry ....");
		return "/vendor/login";
	}
	@GetMapping("/details")
	public String showVendorDetails()
	{
		System.out.println("in show dtls");
		return "/vendor/details";
	}
	@GetMapping("/list")
	public String showVendorList()
	{
		System.out.println("in show vendor list");
		return "/vendor/list";
	}
	
	@GetMapping("/logout")
	public String userLogout()
	{
		System.out.println("in user logout page");
		return "/vendor/logout";
	}
	

}







