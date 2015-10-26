package com.pluralsight.controller;

import javax.inject.Inject;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pluralsight.jacket.services.JacketEntryService;

@Controller
@RequestMapping(value = { "/", "/link" })
public class Link {

	private JacketEntryService service;
	private Log log;

	@Inject
	public Link(JacketEntryService service, Log log) {
		this.service = service;
		this.log = log;
	}

	@RequestMapping(value = "/")
	public String index() {
		service.getAllEntries();
		return "link/index";
	}
}
