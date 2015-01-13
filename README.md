스프링4 입문 예제 코드
=======

# 소스 코드 다운로드

* **메이븐 프로젝트** 다운로드: 이 화면의 우측에 있는 [Download Zip](https://github.com/madvirus/spring4fs/archive/master.zip) 링크를 누르면 소스 코드를 다운로드 받는다.
* **이클립스 프로젝트** 다운로드: [소스 다운로드](https://drive.google.com/file/d/0B2WFL4DD6ByEdWZELXRhLWNkMW8/view?usp=sharing)로 이동한 뒤, 상단의 다운로드 아이콘을 클릭해서 다운로드 받는다.

# 사전 준비
## 이클립스 설정
제공되는 소스는 메이븐 프로젝트이며 다음을 기준으로 작성되었다.

- **자바7** 또는 **자바8**
-- Window > Preferences > Java/Installed JREs 에서 추가
- **UTF-8**
-- Window > Preferences > General/Workspace 에서 Text file encoding을 UTF-8로 변경
-- 프로젝트를 임포트 한 뒤, 프로젝트 별로 Project > Properties > Resource 에서 Text file encoding을 UTF-8로 변경해도 됨
- **톰캣 7**
-- Window > Preferences > Servers/Runtime Environments 에서 톰캣 7 설정 추가

## 메이븐 설정
명령 프롬프트에서 메이븐을 이용해서 웹 프로젝트를 실행하려면 메이븐이 설치되어 있어야 한다. 메이븐에 대한 기초 지식이 필요하면 http://javacan.tistory.com/entry/MavenBasic 글을 읽어보기 바란다.

# 프로젝트 임포트
## 메이븐 프로젝트 임포트
이 화면의 우측에 있는 [Download Zip](https://github.com/madvirus/spring4fs/archive/master.zip) 링크를 누르면 소스 코드를 다운로드 받는다.
이 파일의 압축을 풀면 sp4-chapxx 형식의 메이븐 프로젝트가 존재한다.

File > Import ... > Maven/Existing Maven Projects 메뉴를 이용해서 메이븐 프로젝트를 임포트 한다.

