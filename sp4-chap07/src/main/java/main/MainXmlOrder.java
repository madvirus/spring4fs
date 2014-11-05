package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import chap07.Calculator;

public class MainXmlOrder {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:aopOrder.xml");

		Calculator impeCal = ctx.getBean("impeCal", Calculator.class);
		impeCal.factorial(5);
		impeCal.factorial(5);
	}
}
