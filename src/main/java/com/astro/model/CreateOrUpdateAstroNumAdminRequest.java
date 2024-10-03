package com.astro.model;

import com.astro.common.eum.NumerologyType;

public class CreateOrUpdateAstroNumAdminRequest {
	
	private Integer number;
	private NumerologyType numberType;
	private String category;
	private String numDesc;
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public NumerologyType getNumberType() {
		return numberType;
	}
	public void setNumberType(NumerologyType numberType) {
		this.numberType = numberType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getNumDesc() {
		return numDesc;
	}
	public void setNumDesc(String numDesc) {
		this.numDesc = numDesc;
	}
	@Override
	public String toString() {
		return "CreateOrUpdateAstroNumAdminRequest [number=" + number + ", numberType=" + numberType + ", category="
				+ category + ", numDesc=" + numDesc + "]";
	}
	
	

}
