package org.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	//1
	public static void launchchrome() {
    WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
	}
    //2
	public static void winmax() {
    driver.manage().window().maximize();
	}
	//3
	public static void loadurl(String url) {
     driver.get(url);
	}
	//4
	public static void prnttitle() {
    System.out.println(driver.getTitle());
	}
	//5
	public static void prntcurrenturl() {
    System.out.println(driver.getCurrentUrl());
	}
	//6
	public static void logfill(WebElement ele, String value) {
    ele.sendKeys(value);
	}
	//7
	public static void btnclick(WebElement ele) {
    ele.click();
	}
	//8
	public static void exitbrowser() {
    driver.close();
	}
	//9
	public static void rightclick(WebElement ele) {
    Actions a=new Actions(driver);
     a.contextClick(ele).perform();
	}
	//10
	public static void dclick(WebElement ele) {
   Actions a=new Actions(driver);
   a.doubleClick(ele).perform();
	}
	//11
	public static void conform(WebElement ele) {
    Alert a=driver.switchTo().alert();
    ele.click();
    a.accept();
    }
	//12
	public static void cancel(WebElement ele) {
    Alert a=driver.switchTo().alert();
    a.dismiss();
	}
	//13
	
	
	
	
	
}
