package config;

import interceptor.AuthCheckInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import spring.AuthService;
import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;
import survey.SurveyController;
import controller.ChangePwdController;
import controller.LoginController;
import controller.LogoutController;
import controller.MemberDetailController;
import controller.MemberListController;
import controller.RegisterController;

@Configuration
public class ControllerConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private MemberRegisterService memberRegSvc;
	@Autowired
	private ChangePasswordService changePwdSvc;
	@Autowired
	private AuthService authService;
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private AuthCheckInterceptor authCheckInterceptor;

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/main").setViewName("main");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authCheckInterceptor).addPathPatterns("/edit/**");
	}

	@Bean
	public AuthCheckInterceptor authCheckInterceptor() {
		return new AuthCheckInterceptor();
	}

	@Bean
	public RegisterController registerController() {
		RegisterController regCtrl = new RegisterController();
		regCtrl.setMemberRegisterService(memberRegSvc);
		return regCtrl;
	}

	@Bean
	public SurveyController surveyController() {
		return new SurveyController();
	}

	@Bean
	public LoginController loginController() {
		LoginController loginCtrl = new LoginController();
		loginCtrl.setAuthService(authService);
		return loginCtrl;
	}
	@Bean
	public LogoutController logoutController() {
		return new LogoutController();
	}

	@Bean
	public ChangePwdController changePwdController() {
		ChangePwdController chgPwdContr = new ChangePwdController();
		chgPwdContr.setChangePasswordService(changePwdSvc);
		return chgPwdContr;
	}

	@Bean
	public MemberListController memListController() {
		MemberListController memListCtrl = new MemberListController();
		memListCtrl.setMemberDao(memberDao);
		return memListCtrl;
	}

	@Bean
	public MemberDetailController memDetailController() {
		MemberDetailController memDetailCtrl = new MemberDetailController();
		memDetailCtrl.setMemberDao(memberDao);
		return memDetailCtrl;
	}
}
