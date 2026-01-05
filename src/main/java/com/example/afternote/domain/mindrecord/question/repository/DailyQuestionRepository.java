package com.example.afternote.domain.mindrecord.question.repository;

import com.example.afternote.domain.mindrecord.question.model.DailyQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface DailyQuestionRepository extends JpaRepository<DailyQuestion, Long> {
    
    Optional<DailyQuestion> findByDate(LocalDate date);
    
}
