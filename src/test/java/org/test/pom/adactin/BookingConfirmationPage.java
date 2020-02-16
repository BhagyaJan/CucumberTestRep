package org.test.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.help.AutoTestHelper;

public class BookingConfirmationPage {

	
	public BookingConfirmationPage(WebDriver driver)
	{
		
			PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="order_no")
	private WebElement txtOrderId;

	public WebElement getTxtOrderId() {
		return txtOrderId;
	}

}
