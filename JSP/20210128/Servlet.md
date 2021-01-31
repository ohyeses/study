# SERVLET(Server + Applet 의 합성어)
> - Applet => Application의 작은 개념  
>  - 서버상에서 작동하는 프로그램
>  - Java를 기반으로 하는 Web Application Programming 기술
>  - 톰캣 웹 어플리케이션 서버 사용(동적페이지, 정적페이지 사용 가능)
>  - 웹 3계층 구조(MVC 패턴 - Model View Controller)
>  - Model-데이터에 관한것 (Database Tier)
>  - View-UI 쪽 (HTML/CSS)
>  - Controller-사용자에게 받은 값을 정리하고 제어하는 곳 (Application Tier)  

<br>

### -Servlet은 Java 기반
> -.java 확장자를 가짐. 무조건 컴파일 과정을 거쳐야함.
> -자바 멀티 쓰레드를 이용하여 동작함
> -HttpServlet 클래스를 상속받음


### CGI -> Common Gateway Interface
- 멀티 쓰레드 (프로세스가 여러개 존재, 할당 받은 자원을 나눠서 사용한다.)

### 웹에서 정말 많이 사용할 객체 2가지 (Request, Response)
- Request:요청, Response:응답
- Request 객체를 이용해서 사용자가 입력한 값을 받아옴
- Response 객체.사용자 요청에 따른 응답을 해주는 객체 ..페이지로 돌아갈 수 있도록


### 서블릿 페이지 작성
- Dynamic Project 생성
- 빨간색 뜨면 Build Path-> Configure Build Path -> Library
- 자바 프로그램이기 때문에 서블릿은 Java Resources 에 만든다.
- 페이지 요청을 하려면 페이지의 경로를 검색해줘야 한다.
- 경로를 다 적으려면 길고 불편하다. 경로가 모두 드러나기 때문에 보안상의 문제가 생긴다.
- 경로 자체를 하나의 단어로 Mapping 시켜준다.
- 기본적인 URL Mapping은 클래스이름으로 돼있다.
- URL 다른 값으로 매핑 -> Edit

## 서블릿의 생명 주기
- init, destroy, service, doGet, doPost 다섯가지 메소드들로 서블릿의 생명 주기를 다룰 수 있다.
- init() : 초기화 하는 역할. 객체가 생성이 됐을 때 처음에 딱 한 번 호출
- service() : 사용자가 입력한 값들을 받아서 그 값을 처리해주는 역할. 방식에 따라 doget(), dopost() 을 호출한다.
- doget() : 사용자가 get() 방식으로 서비스를 보냈다.
- dopost() : 사용자가 post() 방식으로 서비스를 보냈다.
- destroy() : 애플리케이션 실행을 멈출 때 한번 실행 자원을 모두 초기화 시킨다.

## 데이터 전송을 위한 3가지 조건
```
<form action="servletSend"> - 폼 태그의 액션속성. 값을 어디로 보낼지 꼭 적어줘야 한다.
<input type="text" name="id"> - name 값을 지정해줘야 서버에서 어떤 값을 보내는지 인식 가능.
<input type="submit"> - 버튼. 누를 때 폼에 입력된 값들을 서버로 보내는 기능을 한다.
```





