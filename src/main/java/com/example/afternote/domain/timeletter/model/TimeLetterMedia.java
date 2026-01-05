package com.example.afternote.domain.timeletter.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "time_letter_media")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class TimeLetterMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 소속 타임레터 (TimeLetter FK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "time_letter_id", nullable = false)
    private TimeLetter timeLetter;

    // 미디어 타입 (ENUM)
    @Enumerated(EnumType.STRING)
    @Column(name = "media_type", nullable = false)
    private MediaType mediaType;

    // 파일 경로나 URL을 저장할 필드가 필요하다면 추가 (ERD에는 없지만 보통 필요함)
    // private String fileUrl;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Builder
    public TimeLetterMedia(TimeLetter timeLetter, MediaType mediaType) {
        this.timeLetter = timeLetter;
        this.mediaType = mediaType;
    }
}