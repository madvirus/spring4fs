package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.Client;
import spring.Client2;
import conf.JavaConfigPrototype;

public class MainPrototype {

	public static void main(String[] args) {
		useXml();
		useJava();
	}

	private static void useXml() {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:springconfPrototype.xml");
		Client client1 = ctx.getBean("client", Client.class);
		Client client2 = ctx.getBean("client", Client.class);

		System.out.println("xml 설정 prototype: (client1 != client2) -> " + (client1 != client2));

		ctx.close();
	}

	private static void useJava() {
		AbstractApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfigPrototype.class);
		Client2 client1 = ctx.getBean("client2", Client2.class);
		Client2 client2 = ctx.getBean("client2", Client2.class);

		System.out.println("java 설정 prototype: (client1 != client2) -> " + (client1 != client2));

		ctx.close();
	}

}
