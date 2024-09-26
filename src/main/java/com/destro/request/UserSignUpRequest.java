package com.destro.request;


public class UserSignUpRequest {
	
	private String firstname;
	private String lastName;
	private String email;
	private String phoneNo;
	private String userType;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "UserSignUpRequest [firstname=" + firstname + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", userType=" + userType + "]";
	}
	
	

}
