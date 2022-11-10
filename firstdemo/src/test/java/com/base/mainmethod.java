package com.base;

import org.openqa.selenium.WebElement;

public class mainmethod extends baseclass{
	static WebElement driver;
	public static void main(String[] args) {
		mainmethod method=new mainmethod();
		method.calling();
		
	}
public void calling() {
	
	getDriver();
	
	enterApplyUrl("https://www.facebook.com/");
	

}
}
