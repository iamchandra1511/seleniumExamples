package com.w2a.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class LoginPage  extends Page{

	
	
	public ZohoAppPage doLogin(String username,String password){
		
		type("email_CSS",username);
		
		click("signbtn_CSS");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		type("password_CSS",password);
		
		click("signbtn_CSS");
		return new ZohoAppPage();
	}
	
	
	public void gotoSalesandMarketing(){
		
		
	}
	
	public void gotoFinance(){
		
		
	}
	
}
