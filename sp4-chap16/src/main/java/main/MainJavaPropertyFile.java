package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.Member;
import spring.MemberDao;
import config.DsPropConfig;
import config.MemberConfig;

public class MainJavaPropertyFile {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(MemberConfig.class, DsPropConfig.class);
		context.refresh();

		MemberDao memberDao = context.getBean("memberDao", MemberDao.class);

		for (Member m : memberDao.selectAll()) {
			System.out.println(m.getEmail());
		}

		context.close();
	}
}
