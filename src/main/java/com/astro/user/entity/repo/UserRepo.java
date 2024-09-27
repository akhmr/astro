package com.astro.user.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astro.user.entity.User;

@Repository
public interface  UserRepo  extends JpaRepository<User, Long> {

}
