package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.Member;
import spring.MemberDao;
import config.NestedProfileConfig;

public class MainDevJavaProfile2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(NestedProfileConfig.class);
		context.refresh();

		MemberDao memberDao = context.getBean("memberDao", MemberDao.class);

		for (Member m : memberDao.selectAll()) {
			System.out.println(m.getEmail());
		}

		context.close();
	}
}
