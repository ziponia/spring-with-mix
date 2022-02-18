# Spring 에서 babel 사용하기

### 목표

spring boot 에서 npm 모듈을 사용 할 수 있도록 한다.

- 서버 재부팅이 없어야 한다 (너무 불편하다)
- intellij 환경을 따로 구성 팔 필요가 없어야 한다.
- devtools 라든가, hotswap 이라던가 하는 건 쓰기 싫다! hot-swap 때 딜레이가 생거나, 간혹 컴파일 오류가 난다.

- 백엔드 재부팅은 어쩔수없다.
- typescript 도 컴파일 됬으면 좋겠다.

### 된것

svelte + rollup hotreload 와 스프링을 합쳐 놓으니 너무너무너무 편함.

react 나 vue 같은 라이브러리들을 같이 녹여서 쓰거나, babel 만 써서, 컴파일 할수 있을 것 같기도 하다

### start

```shell
$ ./gradlew bootRun
$ yarn dev
```

_build_

```shell
$ ./gradlw bootJar
```
