package com.model;

/**
 * Candidate entity. @author  */

public class Candidate implements java.io.Serializable {

	// Fields

	private Integer candidateId;
	private Company company;
	private String candidateName;
	private String candidateResume;

	// Constructors

	/** default constructor */
	public Candidate() {
	}

	/** full constructor */
	public Candidate(Company company, String candidateName,
			String candidateResume) {
		this.company = company;
		this.candidateName = candidateName;
		this.candidateResume = candidateResume;
	}

	// Property accessors

	public Integer getCandidateId() {
		return this.candidateId;
	}

	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getCandidateName() {
		return this.candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getCandidateResume() {
		return this.candidateResume;
	}

	public void setCandidateResume(String candidateResume) {
		this.candidateResume = candidateResume;
	}

}