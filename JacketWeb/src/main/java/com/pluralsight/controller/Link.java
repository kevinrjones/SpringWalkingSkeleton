package com.pluralsight.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pluralsight.jacket.services.JacketEntryService;

@Controller
@RequestMapping(value = {"/", "/link"})
public class Link {

	JacketEntryService service;	
	
	
	@Inject
	public Link(JacketEntryService service) {
		super();
		this.service = service;
	}



	@RequestMapping(value = "/")
	public String index(){
		System.out.println("service is: " + service);
		return "link/index";
	}
}
