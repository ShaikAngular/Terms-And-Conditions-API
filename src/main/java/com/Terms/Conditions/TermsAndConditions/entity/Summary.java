package com.Terms.Conditions.TermsAndConditions.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="summary")


public class Summary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int fruit_id;
	
	@Column(name = "summary")
    String summary;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "Summary [summary=" + summary + "]";
	}

	protected Summary(String summary) {
		super();
		this.summary = summary;
	}

	protected Summary() {
		super();
		// TODO Auto-generated constructor stub
	}

}
