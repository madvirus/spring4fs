package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap07.Calculator;
import config.JavaConfig;

public class MainJavaAspect {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfig.class);

		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long fiveFact = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " + fiveFact);
	}
}
