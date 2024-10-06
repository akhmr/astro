package com.astro.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.astro.entity.AstroNum;

@Repository
public interface AstroNumRepo extends JpaRepository<AstroNum, Long> {

	
	@Query("select a from astro_num a where a.number = ?1 and a.category = ?2")
	AstroNum findbyNumberAndCategory(Integer number,String category);

}
