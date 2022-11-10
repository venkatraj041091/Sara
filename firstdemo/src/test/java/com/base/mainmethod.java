package com.base;

public class mainmethod extends baseclass{
	public static void main(String[] args) {
		mainmethod method=new mainmethod();
		method.calling();
		
	}
public void calling() {
	
	getDriver();
	
	enterApplyUrl("https://www.facebook.com/");
	

}
}
