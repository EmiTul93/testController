package com.develhope.testController.repositories;

import com.develhope.testController.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}