package com.wipro.komal.quizapp.repositories;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.komal.quizapp.entity.Question;
import com.wipro.komal.quizapp.entity.enums.Category;





@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
  
  
	@Query(value = "SELECT * FROM question q WHERE q.category = ?1 AND q.level = ?2 ORDER BY RAND() LIMIT 5", nativeQuery = true)

	List<Question> findRandomByCategoryAndDifficulty(String category, String level);
	List<Question> findByCategory(Category category);
	
}

