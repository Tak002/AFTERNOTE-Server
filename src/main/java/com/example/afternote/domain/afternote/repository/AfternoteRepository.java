package com.example.afternote.domain.afternote.repository;

import com.example.afternote.domain.afternote.model.Afternote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfternoteRepository extends JpaRepository<Afternote, Long> {
    
}
