package com.sergio.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.sergio.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	public String getName() {
		System.out.println(this.getClass() + ": in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(this.getClass() + ": in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(this.getClass() + ": in getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(this.getClass() + ": in setServiceCode()");
		this.serviceCode = serviceCode;
	}

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(this.getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public boolean doWork() {
		
		System.out.println(this.getClass() + ": doWork()");
		return false;
	}
	
}
