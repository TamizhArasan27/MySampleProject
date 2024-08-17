package org.SampleTestng;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclass.FbPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample extends BaseClass {

	
	
	@BeforeClass
	
	private void befcls() {
		OpenBrowser();
		maximizeWindow();
		Get("https://www.facebook.com/");

	}
	
	@AfterClass
	
	private void aftcls() {
		//closeBrowser();

	}
	
	
	@Test
	
	private void tc1() throws IOException {
		
		FbPojo f = new FbPojo();
		
		WebElement email = f.getEmail();
		sendKeys(email, "hvgjh");
	}

	
	
	
	
	
	
	
	
	
	
	
}
