package com.Terms.Conditions.TermsAndConditions.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Terms.Conditions.TermsAndConditions.entity.Summary;



public interface TermsAndConditionsRepo extends JpaRepository<Summary, Integer> {

}
