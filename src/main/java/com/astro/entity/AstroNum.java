package com.astro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "astro_num")
public class AstroNum {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Integer number;
    private String numType;
    private String category;
    private String displayName;
    private String posTrait;
    private String negTrait;
    private String remedy;

    private AstroNum(Builder builder) {
        this.id = builder.id;
        this.number = builder.number;
        this.numType = builder.numType;
        this.category = builder.category;
        this.displayName = builder.displayName;
        this.posTrait = builder.posTrait;
        this.negTrait = builder.negTrait;
        this.remedy = builder.remedy;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }

    public String getNumType() {
        return numType;
    }

    public String getCategory() {
        return category;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getPosTrait() {
        return posTrait;
    }

    public String getNegTrait() {
        return negTrait;
    }

    public String getRemedy() {
        return remedy;
    }

    

    @Override
	public String toString() {
		return "AstroNum [id=" + id + ", number=" + number + ", numType=" + numType + ", category=" + category
				+ ", displayName=" + displayName + ", posTrait=" + posTrait + ", negTrait=" + negTrait + ", remedy="
				+ remedy + "]";
	}



	// Builder Class
    public static class Builder {
        private Long id;
        private Integer number;
        private String numType;
        private String category;
        private String displayName;
        private String posTrait;
        private String negTrait;
        private String remedy;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setNumber(Integer number) {
            this.number = number;
            return this;
        }

        public Builder setNumType(String numType) {
            this.numType = numType;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }


        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setPosTrait(String posTrait) {
            this.posTrait = posTrait;
            return this;
        }

        public Builder setNegTrait(String negTrait) {
            this.negTrait = negTrait;
            return this;
        }

        public Builder setRemedy(String remedy) {
            this.remedy = remedy;
            return this;
        }

        public AstroNum build() {
            return new AstroNum(this);
        }
    }
}