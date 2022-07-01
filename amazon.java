package com.mindtree.seleniumclass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Refrigerator");
		driver.findElement(By.xpath("//input[id='nav-search-submit-button']")).click();
		String price1=driver.findElement(By.xpath("//div[@data-asin='B08SC2ZTDP']//span[@class='a-price-whole']")).getText();
		driver.findElement(By.xpath("img[@alt='samsung 192 L 2 star Direct Cool Single Door Refrigerator(RR19A241BGS/NL. Grey Silver"));
		System.out.print(price1);
		Thread.sleep(3000);
		Set<String> parent=driver.getWindowHandles();
		System.out.println("parent "+ parent);
		Set<String> allwindows=driver.getWindowHandles();
		int count=allwindows.size();
		System.out.println("Total windows + count");
		
		for(String child:allwindows)
		{
			if(!parent.equals(child));
			{
				driver.switchTo().window(child);
			}
			
			}
		String price2=driver.findElement(By.xpath("//span[@class='a-offscreen']")).getText();
		if(price1==price2) {
			System.out.println("Equal price");
		}
		else {
			System.out.print("unequal price");
		}
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("whirpool 3 star Refrigerator");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
			
		
			
		
		
		
		
		

	}

}
