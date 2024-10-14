package com.astro.common.constant;

import java.util.Arrays;
import java.util.List;

import com.astro.common.eum.AstroNumType;

public interface AstroConstant {
	List<String> subCategories = Arrays.asList("lnp_generic", "Love_Rel", "Career");

	List<AstroNumType> parentCategories = Arrays.asList(AstroNumType.LNP, AstroNumType.DRIVERNO, AstroNumType.SOULNO,
			AstroNumType.KUANO);
}
