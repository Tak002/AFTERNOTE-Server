package com.example.afternote.domain.mindrecord.service;

import com.example.afternote.domain.mindrecord.dto.PatchMindRecordRequest;
import com.example.afternote.domain.mindrecord.model.MindRecord;
import com.example.afternote.domain.mindrecord.question.model.DailyQuestion;
import com.example.afternote.domain.mindrecord.question.model.DailyQuestionAnswer;
import com.example.afternote.domain.mindrecord.question.repository.DailyQuestionAnswerRepository;
import com.example.afternote.domain.mindrecord.question.repository.DailyQuestionRepository;
import com.example.afternote.global.exception.CustomException;
import com.example.afternote.global.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class DailyQuestionService {

    private final DailyQuestionAnswerRepository dailyQuestionAnswerRepository;
    private final DailyQuestionRepository dailyQuestionRepository;

    public void update(MindRecord record, PatchMindRecordRequest request) {
        DailyQuestionAnswer answer = dailyQuestionAnswerRepository.findByMindRecord(record)
                .orElseThrow(() -> new CustomException(ErrorCode.MIND_RECORD_NOT_FOUND));

        // 질문 변경 (있을 때만)
        if (request.getQuestionId() != null) {
            DailyQuestion question = dailyQuestionRepository.findById(request.getQuestionId())
                    .orElseThrow(() -> new CustomException(ErrorCode.DAILY_QUESTION_NOT_FOUND));
            answer.updateQuestion(question);
        }

        answer.updateContent(request.getContent());
    }
}