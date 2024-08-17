package org.pojoclass;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo  extends BaseClass{
	
	
	
	public AdactinPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement  username;
	
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	private WebElement forgetpassword;
	
	
	@FindBy(xpath="//*[@type='Submit']")
	private WebElement login;


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getForgetpassword() {
		return forgetpassword;
	}


	public WebElement getLogin() {
		return login;
	}
	

}
