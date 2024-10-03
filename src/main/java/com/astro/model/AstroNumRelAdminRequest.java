package com.astro.model;

public class AstroNumRelAdminRequest {
	
	private Integer fromNum;
	private String fromNumType;
	private Integer toNum;
	private String toNumType;
	private String relDesc;
	public Integer getFromNum() {
		return fromNum;
	}
	public void setFromNum(Integer fromNum) {
		this.fromNum = fromNum;
	}
	public String getFromNumType() {
		return fromNumType;
	}
	public void setFromNumType(String fromNumType) {
		this.fromNumType = fromNumType;
	}
	public Integer getToNum() {
		return toNum;
	}
	public void setToNum(Integer toNum) {
		this.toNum = toNum;
	}
	public String getToNumType() {
		return toNumType;
	}
	public void setToNumType(String toNumType) {
		this.toNumType = toNumType;
	}
	public String getRelDesc() {
		return relDesc;
	}
	public void setRelDesc(String relDesc) {
		this.relDesc = relDesc;
	}
	@Override
	public String toString() {
		return "AstroNumRelAdminRequest [fromNum=" + fromNum + ", fromNumType=" + fromNumType + ", toNum=" + toNum
				+ ", toNumType=" + toNumType + ", relDesc=" + relDesc + "]";
	}
	
}
