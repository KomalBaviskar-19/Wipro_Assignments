package com.komal.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.komal.college.entities.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {

}
