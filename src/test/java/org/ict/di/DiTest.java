package org.ict.di;

import static org.junit.Assert.assertNotNull;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DiTest {
	
	
	// 생성하고 싶은 객체를 선언하고 어느테이션을 이용해 주입
	@Setter(onMethod_ = @Autowired)
	private Broadcast broad;

	// @Test를 받은 메서드가 main메서드처럼 작동.
	@Test
	public void testExist() {
		// assertNotNull은 ctrl+space로 임포트 시켜야 쓸 수 있습니다.
		assertNotNull(broad);
		log.info("--------------");
		log.info("broad");
	}
	
	@Test
	public void test2() {
		assertNotNull(broad);
		log.info("-----2------");
		log.info("broad");
	}
	
}
