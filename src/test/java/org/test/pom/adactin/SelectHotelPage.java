package org.test.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.help.AutoTestHelper;

public class SelectHotelPage{
	
	public SelectHotelPage(WebDriver driver)
	{
		
			PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(id="radiobutton_0")
	private WebElement radioSelectHotel;

	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getRadioSelectHotel() {
		return radioSelectHotel;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	
	
}
