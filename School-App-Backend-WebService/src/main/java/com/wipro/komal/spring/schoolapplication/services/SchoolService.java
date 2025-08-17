package com.wipro.komal.spring.schoolapplication.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.komal.spring.schoolapplication.entities.School;

import jakarta.validation.Valid;

public interface SchoolService {

	School saveSchool(@Valid School school);

	School getSchoolById(Long id);

	List<School> getAllSchools();

	Page<School> getAllSchoolsPage(Pageable pageable);

	void deleteSchool(Long id);

	School updateSchoolById(Long id, School school);

	School getSchoolByName(String name);

	List<School> getSchoolByAddress(String address);

	School patchupdateSchoolById(Long id, School school);
	
	

}
