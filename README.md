# Spring 에서 babel 사용하기

### 목표

spring boot 에서 npm 모듈을 사용 할 수 있도록 한다.

- 서버 재부팅이 없어야 한다 (너무 불편하다)
- intellij 환경을 따로 구성 팔 필요가 없어야 한다.
- devtools 라든가, hotswap 이라던가 하는 건 쓰기 싫다! hot-swap 때 딜레이가 생거나, 간혹 컴파일 오류가 난다.

- 백엔드 재부팅은 어쩔수없다.
- typescript 도 컴파일 됬으면 좋겠다.

### 결론

laravel 프로젝트의 [laravel-mix](https://github.com/laravel-mix/laravel-mix#readme) 라는 npm 모듈이 있다!!

webpack 도 쓸만한데, laravel-mix 도 꽤나 괜찮은듯.

react, vue, bundle 다 지원 하는 거 같다.
