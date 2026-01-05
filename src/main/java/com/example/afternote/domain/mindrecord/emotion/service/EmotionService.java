package com.example.afternote.domain.mindrecord.emotion.service;

import com.example.afternote.domain.mindrecord.emotion.repository.EmotionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class EmotionService {
    
    private final EmotionRepository emotionRepository;
    
}
