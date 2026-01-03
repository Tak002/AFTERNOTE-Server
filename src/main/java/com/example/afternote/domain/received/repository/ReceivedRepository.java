package com.example.afternote.domain.received.repository;

import com.example.afternote.domain.received.model.Received;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceivedRepository extends JpaRepository<Received, Long> {
    
}
