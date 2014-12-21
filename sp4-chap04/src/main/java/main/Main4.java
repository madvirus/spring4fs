package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.MemberInfoPrinter;
import spring.MemberRegisterService;

public class Main4 {

	public static void main(String[] args) {
		// MemberRegisterService가 정상 동작하려면 다음의 세  가지 필요
		// 1. MemberRegisterService 생성자의 @Autowired의 required 값을 false로 지정
		// 2. MemberInfoPrinter의 memDao 필드의 @Autowired의 required 값을 false로 지정
		// 3. MemberInfoPrinter 클래스의 setPrinter() 메서드에 추가한 @Qualifier("sysout") 코드 삭제
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx4.xml");
		MemberRegisterService regSvc = ctx.getBean("memberRegSvc", MemberRegisterService.class);
		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter", MemberInfoPrinter.class);
	}
}
