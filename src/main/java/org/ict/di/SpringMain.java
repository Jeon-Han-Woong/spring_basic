package org.ict.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-context.xml");
		
		Broadcast broadcast = context.getBean("mbc", Broadcast.class);
		
		broadcast.broad();
		
		context.close();
	}
}
