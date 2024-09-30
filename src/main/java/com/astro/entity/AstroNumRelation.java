package com.astro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "num_relationship")
public class AstroNumRelation {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private Integer fromNum;
	private String fromNumType;
	private Integer toNum;
	private String toNumType;
	private String relDesc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getToNumType() {
		return toNumType;
	}
	public void setToNumType(String toNumType) {
		this.toNumType = toNumType;
	}
	public Integer getToNum() {
		return toNum;
	}
	public void setToNum(Integer toNum) {
		this.toNum = toNum;
	}
	public String getRelDesc() {
		return relDesc;
	}
	public void setRelDesc(String relDesc) {
		this.relDesc = relDesc;
	}
	@Override
	public String toString() {
		return "AstroNumRelation [id=" + id + ", fromNum=" + fromNum + ", fromNumType=" + fromNumType + ", toNum="
				+ toNum + ", toNumType=" + toNumType + ", relDesc=" + relDesc + "]";
	}
	
}
