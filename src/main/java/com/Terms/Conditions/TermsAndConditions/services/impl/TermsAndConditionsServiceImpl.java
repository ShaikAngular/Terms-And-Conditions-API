package com.Terms.Conditions.TermsAndConditions.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Terms.Conditions.TermsAndConditions.entity.Summary;
import com.Terms.Conditions.TermsAndConditions.repo.TermsAndConditionsRepo;
import com.Terms.Conditions.TermsAndConditions.services.TermsAndConditionsService;

@Service

public class TermsAndConditionsServiceImpl implements TermsAndConditionsService{
	
	List<Summary> result = new ArrayList<Summary>();
	@Autowired
	private TermsAndConditionsRepo repo;

	@Override
	public List<Summary> getSummary() {
		// TODO Auto-generated method stub
		result = repo.findAll();
		//result = (result).replace("\n", "").replace("\r", "");
		
		//Collections.replaceAll(result, "\n", " ");
		return result;
	}

}
