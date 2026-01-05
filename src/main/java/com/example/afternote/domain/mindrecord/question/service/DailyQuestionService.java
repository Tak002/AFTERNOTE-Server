package com.example.afternote.domain.mindrecord.question.service;

import com.example.afternote.domain.mindrecord.question.repository.DailyQuestionAnswerRepository;
import com.example.afternote.domain.mindrecord.question.repository.DailyQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DailyQuestionService {
    
    private final DailyQuestionRepository dailyQuestionRepository;
    private final DailyQuestionAnswerRepository dailyQuestionAnswerRepository;
    
}
