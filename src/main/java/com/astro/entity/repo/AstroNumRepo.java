package com.astro.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astro.entity.AstroNum;

@Repository
public interface AstroNumRepo extends JpaRepository<AstroNum, Long> {
	
	

}
