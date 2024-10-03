package com.astro.model;

import com.astro.common.eum.NumerologyType;

public class NumerologyRequest {
	
	private NumerologyType numerologyType;
	
	private String name;
	
	private String dob;

	public NumerologyType getNumerologyType() {
		return numerologyType;
	}

	public void setNumerologyType(NumerologyType numerologyType) {
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

	@Override
	public String toString() {
		return "NumerologyRequest [numerologyType=" + numerologyType + ", name=" + name + ", dob=" + dob + "]";
	}

}
