package com.example.afternote.domain.timeletter.model;

import com.example.afternote.domain.user.model.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "time_letters")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class TimeLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 작성자 (User FK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 100)
    private String title;

    // 내용은 길이가 길 수 있으므로 @Lob 사용 (MySQL의 TEXT 타입 매핑)
    @Lob
    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    // 발송 예정 시간
    @Column(name = "send_at", nullable = false)
    private LocalDateTime sendAt;

    // 상태 (ENUM)
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TimeLetterStatus status;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Builder
    public TimeLetter(User user, String title, String content, LocalDateTime sendAt, TimeLetterStatus status) {
        this.user = user;
        this.title = title;
        this.content = content;
        this.sendAt = sendAt;
        this.status = status;
    }
}