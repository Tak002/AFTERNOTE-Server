# AfterNote-Server

AfterNote 프로젝트의 백엔드 서버입니다.

## 기술 스택

- Java 17
- Spring Boot 3.2.1
- Spring Data JPA
- Spring Security
- MySQL
- JWT

## 프로젝트 구조

```
src/main/java/com/example/afternote/
├── domain/
│   ├── auth/           # 인증 관련
│   ├── user/           # 사용자 관리
│   ├── afternote/      # 애프터노트
│   ├── timeletter/     # 타임레터
│   ├── received/       # 받은 편지
│   └── mindrecord/     # 마인드레코드
└── global/
    ├── common/         # 공통 유틸리티
    ├── jwt/            # JWT 인증
    ├── config/         # 설정
    └── exception/      # 예외 처리
```

## 시작하기

### 환경 설정

1. `.env.example` 파일을 복사하여 `.env` 파일을 생성합니다.

```bash
cp .env.example .env
```

2. `.env` 파일에서 필요한 환경 변수를 설정합니다.

### 실행 방법

```bash
# Gradle을 사용하여 실행
./gradlew bootRun
```

## API 문서

서버 실행 후 다음 URL에서 API 문서를 확인할 수 있습니다:

- http://localhost:8080
