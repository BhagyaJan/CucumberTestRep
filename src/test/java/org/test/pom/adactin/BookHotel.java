package org.test.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.help.AutoTestHelper;

public class BookHotel {

	
	public BookHotel(WebDriver driver)
	{
		
			PageFactory.initElements(driver, this);
		
	}
	
@FindBy(id="first_name")
private WebElement txtFirstName;

@FindBy(id="last_name")
private WebElement txtLastName;

@FindBy(id="address")
private WebElement txtAddress;

@FindBy(id="cc_num")
private WebElement txtCC;

@FindBy(id="cc_type")
private WebElement selectCCType;

@FindBy(id="cc_exp_month")
private WebElement selectCCExpiryMonth;

@FindBy(id="cc_exp_year")
private WebElement selectCCExpYear;

@FindBy(id="cc_cvv")
private WebElement txtCVV;

@FindBy(id="book_now")
private WebElement btnBook;

public WebElement getTxtFirstName() {
	return txtFirstName;
}

public WebElement getTxtLastName() {
	return txtLastName;
}

public WebElement getTxtAddress() {
	return txtAddress;
}

public WebElement getSelectCCType() {
	return selectCCType;
}

public WebElement getSelectCCExpiryMonth() {
	return selectCCExpiryMonth;
}

public WebElement getSelectCCExpYear() {
	return selectCCExpYear;
}

public WebElement getTxtCVV() {
	return txtCVV;
}

public WebElement getBtnBook() {
	return btnBook;
}
	

public WebElement getTxtCC() {
	return txtCC;
}
}
