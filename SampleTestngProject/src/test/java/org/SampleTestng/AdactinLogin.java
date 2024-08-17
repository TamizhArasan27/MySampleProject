package org.SampleTestng;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclass.AdactinPojo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinLogin extends BaseClass{
	
	
	@BeforeClass
	
	private void befcls() {
		OpenBrowser();
		maximizeWindow();
		

	}
	
	
	@Parameters({"Username","Password"})
	@Test(dataProvider = "TestData")
	
	private void tc1(String Username, String Password) throws InterruptedException  {
		
		AdactinPojo  a = new AdactinPojo();
		Get("https://adactinhotelapp.com/index.php");
		
		WebElement username = a.getUsername();
		username.sendKeys(Username);
		
		
		WebElement password = a.getPassword();
		 password.sendKeys(Password);
		 
		 WebElement login = a.getLogin();
		 
		 login.click();
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Hello Tamizh27!']")).isDisplayed(),"welcome Messeage is not displayed");
		 
		
	}
	
	
	
	
	@DataProvider(name="TestData")
	
	private  Object[][] getdata(){
		
	return new Object[][] {
		{"",""},
		{"tamizh",""},
		{"","tamizh"},
		{"3525423",""},
		{"","5345354"},
		{"542435","5345354"},
		{"  ","4534"},
		{"43544","   "},
		{"   ","   "},
		{"24545@#$@",""},
		{"","3243@$#$"},
		{"@$#$$",""},
		{"","@@##$_"},
		{"",""},
		{"TAMIZH","TAMIZH"},
		{"Tamizh","Tamizh"},
		{"Tamizh2245",""},
		{"","Tamizh@"},
		{"Tamizh@245342",""},
		{"","Tamizh@2245"},
		{"Tamizh27",""},
		{"","BCI8CF"},
		{"Tamizh27","  "},
		{"   ","BCI8CF"},
		{"Tamizh27",""},
		{"",""},
		{"Tamizh27","BCI8CF"}
		
		
		
		
	};
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
