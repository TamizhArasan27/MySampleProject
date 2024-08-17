package org.pojoclass;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo3 extends BaseClass{
	
	
	public AdactinPojo3() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	
	@FindBy(xpath="//a[text()='Click here to login again']")
	private WebElement clicktologin;
	
	
	

	public WebElement getClicktologin() {
		return clicktologin;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
