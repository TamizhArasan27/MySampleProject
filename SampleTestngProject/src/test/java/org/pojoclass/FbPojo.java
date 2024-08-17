package org.pojoclass;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojo extends BaseClass{

	public FbPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
