package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class commaneLinerun   implements    CommandLineRunner{

	@Value("${my.msg}")
	private   String   mesage;
	@Value("${my.model}")
	private   String  model;
	@Value("${my.code}")
	private   String   code;
	 
	public String getMesage() {
		return mesage;
	}

	public void setMesage(String mesage) {
		this.mesage = mesage;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

	@Override
	public String toString() {
		return "commaneLinerun [mesage=" + mesage + ", model=" + model + ", code=" + code + "]";
	}

	@Override
	public void run(String... args) throws Exception {
  System.out.println(this);
 
	}
	

	 
}
