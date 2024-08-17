package org.pojoclass;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo2 extends BaseClass {

	public AdactinPojo2() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[contains(text(), 'Forgot')]")
	private WebElement Forget;
	
	
	@FindBy(xpath="//a[contains(text(),'Go')]")
	private WebElement goBackToLogin;
	
	
	






	
	public WebElement getGoBackToLogin() {
		return goBackToLogin;
	}


	public WebElement getForget() {
		return Forget;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
