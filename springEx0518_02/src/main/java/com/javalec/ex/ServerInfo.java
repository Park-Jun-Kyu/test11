package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ServerInfo implements InitializingBean, DisposableBean {

	String line;
	String statn_nm;
	String adres;
	String ronmadr;
	String telno;
	String auth;
	String driverClassName;
	String url;
	
	
	
	



	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getStatn_nm() {
		return statn_nm;
	}

	public void setStatn_nm(String statn_nm) {
		this.statn_nm = statn_nm;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getRonmadr() {
		return ronmadr;
	}

	public void setRonmadr(String ronmadr) {
		this.ronmadr = ronmadr;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destory 끝");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("after 시작");

	}

}
