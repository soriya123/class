package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver soriya=new ChromeDriver();
soriya.get("https://www.google.com/");
System.out.println(soriya.getTitle());
soriya.manage().window().fullscreen();
soriya.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium drivers");
//soriya.findElement(By.cssSelector("input[class='gNO89b']")).click();
Thread.sleep(3000);
soriya.findElement(By.xpath("//input[@class='gNO89b']")).click();

	}

}

