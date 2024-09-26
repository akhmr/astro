package com.destro.entity;

import org.hibernate.annotations.DialectOverride.Version;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "users")
public class User {

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	private String userId;
	private String firstname;
	private String lastName;
	
	private String email;
	private String phoneNo;
	
	@Enumerated(EnumType.STRING)
	private UserType userType;
	// using version annotation.
	@Version(major = 0)
	private int version;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
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
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", firstname=" + firstname + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNo=" + phoneNo + ", userType=" + userType + ", version=" + version + "]";
	}
	
	
}