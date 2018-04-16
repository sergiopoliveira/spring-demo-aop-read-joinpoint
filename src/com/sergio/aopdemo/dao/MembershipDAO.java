package com.sergio.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public boolean addAccount() {
	
		System.out.println(this.getClass() + ": ADDING A MEMBERSHIP ACCOUNT");
		return true;
	}
	
	public void goToSleep() {
		System.out.println(this.getClass() + ": I'm going to sleep now...");
		
	}
	
}
