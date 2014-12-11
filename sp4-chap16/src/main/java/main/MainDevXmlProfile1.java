package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.Member;
import spring.MemberDao;

public class MainDevXmlProfile1 {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.load("classpath:spring-member.xml",
		        "classpath:spring-ds-dev.xml",
		        "classpath:spring-ds-real.xml"
		);
		context.refresh();

		MemberDao memberDao = context.getBean("memberDao", MemberDao.class);
		
		for (Member m : memberDao.selectAll()) {
			System.out.println(m.getEmail());
		}
		
		context.close();
	}
}
