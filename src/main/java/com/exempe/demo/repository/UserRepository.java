package com.exempe.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exempe.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
