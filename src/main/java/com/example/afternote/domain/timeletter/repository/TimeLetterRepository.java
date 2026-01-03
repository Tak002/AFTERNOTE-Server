package com.example.afternote.domain.timeletter.repository;

import com.example.afternote.domain.timeletter.model.TimeLetter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeLetterRepository extends JpaRepository<TimeLetter, Long> {
    
}
