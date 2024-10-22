package com.astro.common.constant;

import java.util.Arrays;
import java.util.List;

import com.astro.common.eum.AstroNumType;

public interface AstroConstant {
	List<String> subCategories = Arrays.asList("lnp_generic");//, "Love_Rel", "Career");

	List<AstroNumType> parentCategories = Arrays.asList(AstroNumType.LIFE_PATH_NUM,
														AstroNumType.PERSONALITY_NUM,
														AstroNumType.BIRTHDAY_NUM,
														AstroNumType.MATURITY_NUM,
														AstroNumType.DESTINY_NUM,
														AstroNumType.SOUL_NUM,
														AstroNumType.KUA_NUM,
														AstroNumType.PERSONALITY_YEAR_NUM);
}
