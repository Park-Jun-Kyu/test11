package com.javalec.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.javalec.ex.ServerInfo;

@Configuration
public class AppCTX {
	
	
	@Value("${line}")
	private String line;
	@Value("${statn_nm}")
	private String statn_nm;
	@Value("${adres}")
	private String adres;
	@Value("${ronmadr}")
	private String ronmadr;
	@Value("${telno}")
	private String telno;
	@Value("${auth}")
	private String auth;
	@Value("${driverClassName}")
	private String driverClassName;
	@Value("${url}")
	private String url;
	
	
	
	
	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		
		Resource[] location = new Resource[2];
		location[0] = new ClassPathResource("server1");
		location[1] = new ClassPathResource("server2");
		
		configurer.setLocations(location);
		
		
		return configurer;
	}
	
	
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo serverInfo = new ServerInfo();
		serverInfo.setAuth(auth);
		serverInfo.setDriverClassName(driverClassName);
		serverInfo.setUrl(url);
		serverInfo.setLine(line);
		serverInfo.setStatn_nm(statn_nm);
		serverInfo.setAdres(adres);
		serverInfo.setTelno(telno);
		return serverInfo;

		
		
	}
	
	
	
}
