package com.astro.model;

import java.util.List;

public class AstroNumDto {

	private Integer num;
	
	private String numType;
	
	private List<AstroNumSubcategory> astroNumSubcategorys; 
	
	
	public Integer getNum() {
		return num;
	}


	public void setNum(Integer num) {
		this.num = num;
	}


	public String getNumType() {
		return numType;
	}


	public void setNumType(String numType) {
		this.numType = numType;
	}


	public List<AstroNumSubcategory> getAstroNumSubcategorys() {
		return astroNumSubcategorys;
	}


	public void setAstroNumSubcategorys(List<AstroNumSubcategory> astroNumSubcategorys) {
		this.astroNumSubcategorys = astroNumSubcategorys;
	}


	
	private class AstroNumSubcategory{
		
		private String displayName;
		
		private String posTrait;
		
		private String negTrait;
		
		private String remedy;
		
		private String  genDesc;

		public String getDisplayName() {
			return displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getNegTrait() {
			return negTrait;
		}

		public void setNegTrait(String negTrait) {
			this.negTrait = negTrait;
		}

		public String getRemedy() {
			return remedy;
		}

		public void setRemedy(String remedy) {
			this.remedy = remedy;
		}

		public String getGenDesc() {
			return genDesc;
		}

		public void setGenDesc(String genDesc) {
			this.genDesc = genDesc;
		}
		
		public String getPosTrait() {
			return posTrait;
		}

		public void setPosTrait(String posTrait) {
			this.posTrait = posTrait;
		}

		@Override
		public String toString() {
			return "AstroNumSubcategory [displayName=" + displayName + ", posTrait=" + posTrait + ", negTrait="
					+ negTrait + ", remedy=" + remedy + ", genDesc=" + genDesc + "]";
		}

		
	}


	@Override
	public String toString() {
		return "AstroNumDto [num=" + num + ", numType=" + numType + ", astroNumSubcategorys=" + astroNumSubcategorys
				+ "]";
	}
	
}
