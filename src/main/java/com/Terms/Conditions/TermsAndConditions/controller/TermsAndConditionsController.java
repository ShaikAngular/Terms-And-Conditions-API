package com.Terms.Conditions.TermsAndConditions.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Terms.Conditions.TermsAndConditions.entity.Summary;
import com.Terms.Conditions.TermsAndConditions.services.TermsAndConditionsService;



@RestController

public class TermsAndConditionsController {
	
	@Autowired
	private TermsAndConditionsService service;
	
	@GetMapping("/summary")
	public List<Summary> getSummary(){
		return service.getSummary();
	}

}
