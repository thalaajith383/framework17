package org.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	String txturl = driver.getCurrentUrl();
	System.out.println(txturl);
	
	String txttlt = driver.getTitle();
	System.out.println(txttlt);
	
	WebElement txtid = driver.findElement(By.id("email"));
	txtid.sendKeys("aji123@gamil.com");
	
	WebElement txtpass = driver.findElement(By.name("pass"));
	txtpass.sendKeys("123456");
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	
	
	
	
	
	}
}
