package com.model;


import java.util.HashSet;
import java.util.Set;

/**
 * Company entity. @author  */

public class Company implements java.io.Serializable {

	// Fields

	private Integer companyId;
	private String companyName;
	private String companyIntroduction;
	private String companyAddress;
	private String companyContact;
	private String jobName;
	private String jobDuty;
	private String jobRequire;
	private Integer jobIsavailable;
	private Set candidates = new HashSet(0);
	private Set recruitments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Company() {
	}

	/** full constructor */
	public Company(String companyName, String companyIntroduction,
			String companyAddress, String companyContact, String jobName,
			String jobDuty, String jobRequire, Integer jobIsavailable,
			Set candidates, Set recruitments) {
		this.companyName = companyName;
		this.companyIntroduction = companyIntroduction;
		this.companyAddress = companyAddress;
		this.companyContact = companyContact;
		this.jobName = jobName;
		this.jobDuty = jobDuty;
		this.jobRequire = jobRequire;
		this.jobIsavailable = jobIsavailable;
		this.candidates = candidates;
		this.recruitments = recruitments;
	}

	// Property accessors

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyIntroduction() {
		return this.companyIntroduction;
	}

	public void setCompanyIntroduction(String companyIntroduction) {
		this.companyIntroduction = companyIntroduction;
	}

	public String getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyContact() {
		return this.companyContact;
	}

	public void setCompanyContact(String companyContact) {
		this.companyContact = companyContact;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobDuty() {
		return this.jobDuty;
	}

	public void setJobDuty(String jobDuty) {
		this.jobDuty = jobDuty;
	}

	public String getJobRequire() {
		return this.jobRequire;
	}

	public void setJobRequire(String jobRequire) {
		this.jobRequire = jobRequire;
	}

	public Integer getJobIsavailable() {
		return this.jobIsavailable;
	}

	public void setJobIsavailable(Integer jobIsavailable) {
		this.jobIsavailable = jobIsavailable;
	}

	public Set getCandidates() {
		return this.candidates;
	}

	public void setCandidates(Set candidates) {
		this.candidates = candidates;
	}

	public Set getRecruitments() {
		return this.recruitments;
	}

	public void setRecruitments(Set recruitments) {
		this.recruitments = recruitments;
	}

}