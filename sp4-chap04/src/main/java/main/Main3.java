package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.MemberInfoPrinter;
import spring.MemberRegisterService;
import spring.RegisterRequest;

public class Main3 {

	public static void main(String[] args) {
		// 이 코드를 정상적으로 실행하면 다음의 코드 변경 필요
		// 1. MemberInfoPrinter 클래스의 setPrinter() 메서드에 @Qualifier("sysout") 코드 추가
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx3.xml");
		MemberRegisterService regSvc = ctx.getBean("memberRegSvc", MemberRegisterService.class);
		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter", MemberInfoPrinter.class);

		RegisterRequest regReq = new RegisterRequest();
		regReq.setEmail("madvirus@madvirus.net");
		regReq.setName("최범균");
		regReq.setPassword("1234");
		regReq.setConfirmPassword("1234");
		regSvc.regist(regReq);
		
		infoPrinter.printMemberInfo("madvirus@madvirus.net");
	}
}
