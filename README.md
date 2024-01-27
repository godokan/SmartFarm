## 스마트팜 서버
&nbsp;본 레파지토리는 2023년 용인예술과학대학교 융합캡스톤디자인 경진대회 '야수의 심장' 팀이 '스마트팜' 팀을 위해 맞춤 제작 한 서버입니다.

&nbsp;스마트팜 팀에서 제작한 아두이노 기반 스마트팜 기기와 연결 된 단말에는 NodeJS 서버가 배포되어 있습니다.

&nbsp;해단 단말이 기기와 인터넷에 연결 되어 있으면 본 서버로 JSON 형식의 스마트팜 정보를 전송합니다.

&nbsp;스마트팜 서버에서는 수신한 정보를 바탕으로 [스마트팜 페이지](http://ccsyasu.cafe24.com:8083/index)에 송출합니다.

&nbsp;이에 스파트팜의 애칭과 습도, 토양상태, D+DAY, 정보 업데이트 시기를 원격으로 알 수 있습니다.

## 스마트팜

![SmartFarm](https://github.com/godokan/SmartFarm/assets/117326245/64cad571-6d9c-4ffb-bd3f-a48e6bd6fac7)

## 기술스택에 관하여
* IntelliJ IDEA에서 개발하였습니다.
* 프론트엔드에는 HTML5, CSS3, JavaScript, JQuery, Bootstrap을 사용하였습니다. (반응형)
* 백엔드에는 SpringBoot 3.2.0, JAVA 17, Mustache, JPA, Lombok, mySQL을 사용하였습니다.
* cafe24 가상 서버 호스팅을 통해 Ubuntu Linux 20.04.6 LTS 환경에서 배포되었습니다.
