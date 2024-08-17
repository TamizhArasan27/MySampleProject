package org.SampleTestng;

import org.base.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclass.AdactinPojo2;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdactinForgotPass extends BaseClass{
	
	
	
	
	@Test
	
	private void tc3() throws InterruptedException {
		AdactinPojo2 a =new AdactinPojo2();
		
		Thread.sleep(3000);
		
		WebElement forget = a.getForget();
		
		forget.click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'Forgot ')]")).isDisplayed());
		
		Thread.sleep(3000);

	    WebElement goBackToLogin = a.getGoBackToLogin();
	    goBackToLogin.click();
	    
	    
		
	}
	
    @AfterClass
	
	private void aftcls() {
		closeBrowser();

	}
	
	
	
	

}
