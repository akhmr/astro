package com.astro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "astro_num")
public class AstroNum {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	private Integer number;
	private String numType;
	private String category;
	private String num_desc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getNumType() {
		return numType;
	}
	public void setNumType(String numType) {
		this.numType = numType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getNum_desc() {
		return num_desc;
	}
	public void setNum_desc(String num_desc) {
		this.num_desc = num_desc;
	}
	@Override
	public String toString() {
		return "AstroNum [id=" + id + ", number=" + number + ", numType=" + numType + ", category=" + category
				+ ", num_desc=" + num_desc + "]";
	}
	

}
