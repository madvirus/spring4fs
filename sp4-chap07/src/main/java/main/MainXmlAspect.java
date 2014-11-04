package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import chap07.Calculator;

public class MainXmlAspect {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:aopAspect.xml");

		Calculator impeCal = ctx.getBean("impeCal", Calculator.class);
		long fiveFact = impeCal.factorial(5);
		System.out.println("impeCal.factorial(5) = " + fiveFact);
	}
}
