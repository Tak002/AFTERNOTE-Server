package com.example.afternote.domain.mindrecord.thought.repository;

import com.example.afternote.domain.mindrecord.thought.model.DeepThought;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeepThoughtRepository extends JpaRepository<DeepThought, Long> {
    
    List<DeepThought> findByUserId(Long userId);
    
    List<DeepThought> findByUserIdAndIsTemporary(Long userId, Boolean isTemporary);
    
    List<DeepThought> findByUserIdAndTopic(Long userId, String topic);
    
}
