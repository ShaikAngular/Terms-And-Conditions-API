package com.Terms.Conditions.TermsAndConditions.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Terms.Conditions.TermsAndConditions.entity.Summary;



@Service
public interface TermsAndConditionsService {
    public List<Summary> getSummary();
}
