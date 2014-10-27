package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberPrinter;

@Configuration
public class ConfigPart2 {

//	@Autowired
//	private MemberDao memberDao;
	
	@Autowired
	private ConfigPart1 configPart1;

	@Bean
	public MemberPrinter printer() {
		return new MemberPrinter();
	}

	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(configPart1.memberDao());
		infoPrinter.setPrinter(printer());
		return infoPrinter;
	}

}
