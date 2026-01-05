package com.example.afternote.domain.mindrecord.diary.service;

import com.example.afternote.domain.mindrecord.diary.repository.DiaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DiaryService {
    
    private final DiaryRepository diaryRepository;
    
}
