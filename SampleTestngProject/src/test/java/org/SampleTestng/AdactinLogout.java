package org.SampleTestng;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclass.AdactinPojo;
import org.pojoclass.AdactinPojo3;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdactinLogout extends BaseClass{
	
	
	
	@Test
	private void tc2() {
		
		AdactinPojo a = new AdactinPojo();
		AdactinPojo3 a1 = new AdactinPojo3();
		
		WebElement logout = a1.getLogout();
		logout.click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'You')]")).isDisplayed());
		
		WebElement clicktologin = a1.getClicktologin();
		clicktologin.click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Adactin')]")).isDisplayed());
	}
	
    
	
	
	
	
	
	
	
	
	
	

}
