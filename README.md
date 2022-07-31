# Stress Test By K6

- k6 를 이용한 성능 테스트 연구 레포지토리입니다

# 실행

- prerequisite
- run test

## prerequisite

- docker

## run test

### start rest api server

```shell
$ cd ./rest-api-server
$ ./gradlew clean build
$ java -jar build/libs/rest-api-server.jar
```

### cli

k6 실행

```shell
$ docker run --rm -i grafana/k6 run --vus 100 - <stress-script.js
```
