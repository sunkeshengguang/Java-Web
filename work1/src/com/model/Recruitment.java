package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Recruitment entity. @author 
 */

public class Recruitment implements java.io.Serializable {

	// Fields

	private Integer jobId;
	private Company company;
	private String jobName;
	private String jobDuty;
	private String jobRequire;
	private Integer jobIsavailable;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Recruitment() {
	}

	/** minimal constructor */
	public Recruitment(Integer jobId) {
		this.jobId = jobId;
	}

	/** full constructor */
	public Recruitment(Integer jobId, Company company, String jobName,
			String jobDuty, String jobRequire, Integer jobIsavailable, Set users) {
		this.jobId = jobId;
		this.company = company;
		this.jobName = jobName;
		this.jobDuty = jobDuty;
		this.jobRequire = jobRequire;
		this.jobIsavailable = jobIsavailable;
		this.users = users;
	}

	// Property accessors

	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
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

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}