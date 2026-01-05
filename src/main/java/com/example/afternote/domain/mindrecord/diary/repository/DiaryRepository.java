package com.example.afternote.domain.mindrecord.diary.repository;

import com.example.afternote.domain.mindrecord.diary.model.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Long> {
    
    List<Diary> findByUserId(Long userId);
    
    Optional<Diary> findByUserIdAndRecordDate(Long userId, LocalDate recordDate);
    
    List<Diary> findByUserIdAndIsTemporary(Long userId, Boolean isTemporary);
    
}
