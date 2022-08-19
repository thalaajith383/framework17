package org.framework;

import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class PojoRun extends BaseClass {
	public static void main(String[] args) {
		launchchrome();
		winmax();
		loadurl("https://www.facebook.com/");
		prnttitle();
		prntcurrenturl();
		
		LoginPojo l=new LoginPojo();
		//giving the value for txtuser
		WebElement txtuser = l.getTxtuser();
		logfill(txtuser, "aji@gmail.com");
		//giving the password
		WebElement txtpass = l.getTxtpass();
		logfill(txtpass, "1234567");
		
		WebElement btnlogin = l.getBtnlogin();
		btnclick(btnlogin);
		
		
	}

}
