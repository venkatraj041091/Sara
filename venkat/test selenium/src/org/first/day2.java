package org.first;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class day2 {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jaidurai\\Desktop\\venkat\\test selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.get(" https://netbanking.hdfcbank.com/ ");
		driver.manage().window().maximize();
		//WebElement txtusername = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		//txtusername.sendKeys("raj");
		Thread.sleep(3000);
		WebElement userpassword = driver.findElement(By.xpath("//input[@type='text']"));
		userpassword.sendKeys("yu");
		


		
		//driver.quit();
	}
}

