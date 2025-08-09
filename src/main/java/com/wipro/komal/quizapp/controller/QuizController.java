package com.wipro.komal.quizapp.controller;






import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import com.wipro.komal.quizapp.entity.QuestionWrapper;
import com.wipro.komal.quizapp.entity.Quiz;
import com.wipro.komal.quizapp.entity.Response;
import com.wipro.komal.quizapp.services.QuizService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/quiz")
public class QuizController {

    private final QuizService quizService;

    @PostMapping("/create")
    public Quiz createQuiz(
            @RequestParam String category,
            @RequestParam String level,
            @RequestParam String title) {
        return quizService.createQuiz(category, level, title);
    }

    @GetMapping("/getQuizByID/{id}")
    public List<QuestionWrapper> getQuizQuestions(@PathVariable Long id) {
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("/submitQuiz/{id}")
    public Integer submitQuiz(
            @PathVariable Long id,
            @RequestBody List<Response> responses) {
        return quizService.calculateResult(id, responses);
    }
}
