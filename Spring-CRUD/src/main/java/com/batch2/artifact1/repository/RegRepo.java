package com.batch2.artifact1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.batch2.artifact1.domain.Login;

@Repository
public interface RegRepo extends JpaRepository<Login, String> {
    Login findByUsername(String username);
}
