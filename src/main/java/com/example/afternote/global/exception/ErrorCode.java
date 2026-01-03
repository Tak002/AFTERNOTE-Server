package com.example.afternote.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    
    USER_NOT_FOUND("사용자를 찾을 수 없습니다."),
    INVALID_TOKEN("유효하지 않은 토큰입니다."),
    UNAUTHORIZED("인증되지 않은 사용자입니다.");
    
    private final String message;
    
}
