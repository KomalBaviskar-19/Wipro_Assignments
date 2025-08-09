package com.wipro.komal.quizapp.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.komal.quizapp.entity.Quiz;



@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long> {

	

}