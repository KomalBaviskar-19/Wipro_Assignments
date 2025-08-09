package com.wipro.komal.quizapp.services;



import java.util.List;

import com.wipro.komal.quizapp.entity.QuestionWrapper;
import com.wipro.komal.quizapp.entity.Quiz;
import com.wipro.komal.quizapp.entity.Response;



public interface QuizService {

	Quiz createQuiz(String category, String level, String title);

	List<QuestionWrapper> getQuizQuestions(Long id);
	Integer calculateResult(Long id, List<Response> responses);

}