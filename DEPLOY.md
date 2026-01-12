# AfterNote Server 배포 가이드

## 환경 구분

### 로컬 개발 환경

```bash
# HTTP만 사용 (포트 80)
docker-compose up -d

# 접속: http://localhost
# Swagger: http://localhost/swagger-ui/index.html
```

### 프로덕션 환경 (EC2)

```bash
# HTTPS 사용 (포트 80, 443)
docker-compose -f docker-compose.prod.yml up -d

# 접속: https://afternote.kro.kr
# Swagger: https://afternote.kro.kr/swagger-ui/index.html
```

## Nginx 설정 파일

- `nginx/nginx.local.conf` - 로컬 개발용 (HTTP)
- `nginx/nginx.prod.conf` - 프로덕션용 (HTTPS)
- `nginx/nginx.conf` - (삭제 가능한 구버전)

## 배포 프로세스

1. `release` 브랜치로 푸시
2. GitHub Actions가 자동으로 빌드
3. Docker Hub에 이미지 업로드
4. EC2에서 `docker-compose.prod.yml` 사용하여 배포
