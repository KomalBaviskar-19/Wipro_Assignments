package com.wipro.komal.quizapp.services;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.komal.quizapp.entity.Question;
import com.wipro.komal.quizapp.entity.QuestionWrapper;
import com.wipro.komal.quizapp.entity.Quiz;
import com.wipro.komal.quizapp.entity.Response;
import com.wipro.komal.quizapp.exceptions.QuestionNotFoundException;
import com.wipro.komal.quizapp.repositories.QuestionRepository;
import com.wipro.komal.quizapp.repositories.QuizRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;
    private final QuestionRepository questionRepository;

    @Override
    public Quiz createQuiz(String category, String level, String title) {
        List<Question> questions = questionRepository.findRandomByCategoryAndDifficulty(category, level);

        Quiz quiz = new Quiz();
        quiz.setQuizTitle(title);
        quiz.setQuestions(questions);

        return quizRepository.save(quiz);
    }

    @Override
    public List<QuestionWrapper> getQuizQuestions(Long id) {
        Quiz quiz = quizRepository.findById(id)
                .orElseThrow(() -> new QuestionNotFoundException("Question not found with ID: " + id));

        List<Question> questionsFromDB = quiz.getQuestions();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();

        for (Question question : questionsFromDB) {
            questionsForUser.add(new QuestionWrapper(
                    question.getQuestionId(),
                    question.getQuestionTitle(),
                    question.getOption1(),
                    question.getOption2(),
                    question.getOption3(),
                    question.getOption4()
            ));
        }

        return questionsForUser;
    }

    @Override
    public Integer calculateResult(Long id, List<Response> responses) {
        Quiz quiz = quizRepository.findById(id)
                .orElseThrow(() -> new QuestionNotFoundException("Question not found with ID: " + id));

        List<Question> questions = quiz.getQuestions();
        int score = 0;

        for (Response response : responses) {
            for (Question question : questions) {
                if (question.getQuestionId().equals(response.getId())) {
                    if (question.getCorrectAnswer().equalsIgnoreCase(response.getUserAnswer())) {
                        score++;
                    }
                    break;
                }
            }
        }

        return score;
    }
}