package com.model;

/**
 * User entity. @author 
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Recruitment recruitment;
	private String userUsername;
	private String userPassword;
	private String userName;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(Recruitment recruitment, String userUsername,
			String userPassword, String userName) {
		this.recruitment = recruitment;
		this.userUsername = userUsername;
		this.userPassword = userPassword;
		this.userName = userName;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Recruitment getRecruitment() {
		return this.recruitment;
	}

	public void setRecruitment(Recruitment recruitment) {
		this.recruitment = recruitment;
	}

	public String getUserUsername() {
		return this.userUsername;
	}

	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}