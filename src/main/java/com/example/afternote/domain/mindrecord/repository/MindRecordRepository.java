package com.example.afternote.domain.mindrecord.repository;

import com.example.afternote.domain.mindrecord.model.MindRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MindRecordRepository extends JpaRepository<MindRecord, Long> {
    
}
