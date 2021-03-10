package org.ict.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;


@Log4j
public class MysqlTest {
	private final String DRIVER =
			"com.mysql.cj.jdbc.Driver";
	private final String URL =
			"jdbc:mysql://127.0.0.1:3306/ict3?useSSL=false&serverTimezone=UTC";
	private final String USER = "root";
	private final String PW = "1111";
//	틀린 비밀번호나 아이디 입력시 console에 오류 발생
//	private final String USER = "root2";
//	private final String PW = "1234"; 
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER); //DBMS에 맞게 Driver를 Mysql로 변환
		
		//java SQL 패키지의 DriverManager를 통해 DBMS 연결
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			log.info("JDBC 연결 완료");
			log.info(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
