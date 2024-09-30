package com.astro.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astro.entity.AstroNumRelation;

@Repository
public interface AstroNumRelationRepo extends JpaRepository<AstroNumRelation, Long> {

}
