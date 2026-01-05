package com.example.afternote.domain.mindrecord.question.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "daily_questions")
@Getter
@Setter
@NoArgsConstructor
public class DailyQuestion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 255)
    private String content;
    
    @Column(nullable = false)
    private LocalDate date;
    
    @OneToMany(mappedBy = "dailyQuestion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DailyQuestionAnswer> answers = new ArrayList<>();
    
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
    
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
