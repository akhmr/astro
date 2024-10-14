package com.astro.model;

import java.util.HashMap;
import java.util.Map;

public class NumerologyResponse {
	
	private Map<String,AstroNumDto> astroMap = new HashMap<>();

	public Map<String, AstroNumDto> getAstroMap() {
		return astroMap;
	}

	public void setAstroMap(Map<String, AstroNumDto> astroMap) {
		this.astroMap = astroMap;
	}
	
	
}
