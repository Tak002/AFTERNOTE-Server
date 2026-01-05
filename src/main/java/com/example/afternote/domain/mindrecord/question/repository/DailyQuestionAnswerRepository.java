package com.example.afternote.domain.mindrecord.question.repository;

import com.example.afternote.domain.mindrecord.question.model.DailyQuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DailyQuestionAnswerRepository extends JpaRepository<DailyQuestionAnswer, Long> {
    
    List<DailyQuestionAnswer> findByUserId(Long userId);
    
    Optional<DailyQuestionAnswer> findByUserIdAndDailyQuestionId(Long userId, Long questionId);
    
    List<DailyQuestionAnswer> findByDailyQuestionId(Long questionId);
    
}
