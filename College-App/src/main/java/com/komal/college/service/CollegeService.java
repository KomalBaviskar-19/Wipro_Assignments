package com.komal.college.service;

import java.util.List;

import com.komal.college.entities.College;


public interface CollegeService {

	public List<College> getAll();

	public void save(College college);

	public College getById(Long id);

	public void delete(Long id);

}
