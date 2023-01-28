# MyBatis 로 구현한 게시판 프로젝트
<hr>

## 기술 스택
- Back-end & Framework
  - Java 11, Spring, MyBatis
- Front-end & Library
  - HTML5, CSS3, JS ES6, jQuery, JSP
- DB
  - MySQL
- Infra
  - AWS
<hr>

## 프로젝트 관련 학습 내용
<details>
<summary>학습 내용 상세 보기(클릭)</summary>

### REST API 와 Ajax
#### 1. JSON 이란?
- JavaScript Object Notation (자바스크립트 객체 표기법)

#### 2. stringify() 와 parse()
- JS 객체를 서버로 전송하기 위해서는 직렬화 (문자열로 변환) 가 필요
- 서버가 보낸 데이터 (JSON 문자열) 를 JS 객체로 변환할 때, 역직렬화가 필요
  - > JSON.stringify() - 객체를 JSON 문자열로 변환 (직렬화, JS 객체 -> 문자열)
  - > JSON.parse() - JSON 문자열을 객체로 변환 (역직렬화, 문자열 -> JS 객체)
````js
$(document).ready(function () {
   let person = { name: "abc", age: 10 };
   let person2 = {};
   
   $("#sendBtn").click(function () {
      $.ajax({
        type: 'POST',  // 요청 메서드
        url: '/ch4/send',  // 요청 URI
        headers: { "content-type": "application/json" },  // 요청 헤더
        dataType: 'text',  // 전송할 데이터 타입
        data: JSON.stringify(person),  // 서버로 전송할 데이터. stringify() 로 직렬화 필요.
        success: function (result) {
            person2 = JSON.parse(result);  // 서버로부터 응답이 도착하면 호출될 함수
            alert(result);  // result 는 서버가 전송한 데이터
        },
        error: function () {
            alert("error");  // 에러가 발생했을 때, 호출될 함수
        }
      });
      
      alert("The request is sent.");
   });
});
````
- [참고](https://api.jquery.com/jquery.ajax/#jQuery-ajax-url-settings)

#### 3. Ajax 란?
- Asynchronous JavaScript and XML
- 비동기 통신으로 데이터를 주고 받기 위한 기술
- 웹 페이지 전체 (Data + UI) 가 아닌 일부 (Data) 만 업데이트 가능

#### 4. REST 란?
- Representational State Transfer
- 2000년에 Roy Fielding 이 제안한 웹 서비스 디자인 아키텍쳐 접근 방식
- 프로토콜에 독립적이며, 주로 HTTP 를 사용해서 구현
- 리소스 중심의 API 디자인
- HTTP 메서드로 수행할 작업을 정의
- [출처](https://docs.microsoft.com/ko-kr/azure/architecture/best-practices/api-design)

#### 5. REST API 란?
- REST 규약을 준수하는 API
- REST is a set of architectural constraints, not a protocol or a standard. API developers can implement REST in a variety of ways.
- [출처](https://www.redhat.com/en/topics/api/what-is-a-rest-api)

#### 6. RESTful API 설계
- 예시) 댓글 기능 RESTful API 설계

| 작업  | URI             |  HTTP 메서드   | 설명                |
|:---:|:----------------|:-----------:|:------------------|
| 읽기  | /comments       |     GET     | 모든 댓글을 보여준다.      |
| 읽기  | /comments/{cno} |     GET     | 지정된 번호의 댓글을 보여준다. |
| 쓰기  | /comments       |    POST     | 새로운 댓글을 저장한다.     |
| 삭제  | /comments/{cno} |   DELETE    | 지정된 번호의 댓글을 삭제한다. |
| 수정  | /comments/{cno} | PUT / PATCH | 수정된 댓글을 저장한다.     |



</details>
<hr>