package com.astro.model;

import com.astro.common.eum.AstroNumType;
import com.astro.common.eum.Gender;

public class NumerologyRequest {
	
	private AstroNumType numerologyType;
	
	private String name;
	
	private String dob;
	
	private Gender gender;

	public AstroNumType getNumerologyType() {
		return numerologyType;
	}

	public void setNumerologyType(AstroNumType numerologyType) {
		this.numerologyType = numerologyType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "NumerologyRequest [numerologyType=" + numerologyType + ", name=" + name + ", dob=" + dob + ", gender="
				+ gender + "]";
	}
	

}
