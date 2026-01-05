package com.example.afternote.domain.mindrecord.thought.service;

import com.example.afternote.domain.mindrecord.thought.repository.DeepThoughtRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DeepThoughtService {
    
    private final DeepThoughtRepository deepThoughtRepository;
    
}
