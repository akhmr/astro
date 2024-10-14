package com.astro.model;

import java.util.List;

public record AstroNumDto(
		Integer num,
		String numType,
		String displayName, 
		List<AstroNumSubcategory> astroNumSubcategories) {

    @Override
    public String toString() {
        return "AstroNumDto [num=" + num + ", numType=" + numType + ", astroNumSubcategories=" + astroNumSubcategories + "]";
    }
}