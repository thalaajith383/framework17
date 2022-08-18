package org.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class BaseRun extends BaseClass {
	public static void main(String[] args) {
		
		launchchrome();
		winmax();
		loadurl("https://www.facebook.com/");
		prnttitle();
		prntcurrenturl();
		WebElement txtuser = driver.findElement(By.name("email"));
		logfill(txtuser, "aji123@gmail.com");
		
		WebElement txtpass = driver.findElement(By.name("pass"));
	   logfill(txtpass, "1234567890");
	   
	   WebElement lclick = driver.findElement(By.name("login"));
	    lclick.click();
	    
	    exitbrowser();
	    launchchrome();
	    loadurl("https://nxtgenaiacademy.com/alertandpopup/");
	    WebElement a1 = driver.findElement(By.name("alertbox"));
	    a1.click();
	    
	   
	
	}

}
