package com.example.afternote.domain.receiver.repository;

import com.example.afternote.domain.receiver.model.Receiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceivedRepository extends JpaRepository<Receiver, Long> {
    
}
