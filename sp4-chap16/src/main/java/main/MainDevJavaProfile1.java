package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.Member;
import spring.MemberDao;
import config.DsDevConfig;
import config.DsRealConfig;
import config.MemberConfig;

public class MainDevJavaProfile1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(MemberConfig.class, DsDevConfig.class, DsRealConfig.class);
		context.refresh();

		MemberDao memberDao = context.getBean("memberDao", MemberDao.class);

		for (Member m : memberDao.selectAll()) {
			System.out.println(m.getEmail());
		}

		context.close();
	}
}
