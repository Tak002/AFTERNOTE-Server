package com.example.afternote.domain.timeletter.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "time_letters")
@Getter
@NoArgsConstructor
public class TimeLetter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
}
