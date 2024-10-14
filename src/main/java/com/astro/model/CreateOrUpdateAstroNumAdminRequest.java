package com.astro.model;

import com.astro.common.eum.AstroNumType;

public record CreateOrUpdateAstroNumAdminRequest( 
	
	 Integer number,
     AstroNumType numberType,
     String category,
	 String displayName,
	 String posTrait,
	 String negTrait,
	 String remedy
	){}
