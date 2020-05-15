package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {
	
	Environment env;
	String adminId;
	String adminPw;
	
	//implements 오버라이딩 메소드
	public void setEnvironment(Environment env) {
		System.out.println("AdminConnection env에 값을 설정");
		setEnv(env);
		
	}
	
	public Environment getEnv() {
		return env;
	}


	public void setEnv(Environment env) {
		this.env = env;
	}
	
	
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}


	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	
	

	
	public String getAdminId() {
		return adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Adminconnection 실행시 init 실행");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}

	public void destroy() throws Exception {
		System.out.println("Adminconnection 종료시 destroy 실행");
	}



}
