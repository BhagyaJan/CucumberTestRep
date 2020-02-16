package com.stepdefinition;



import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.help.AutoTestHelper;
import org.test.pom.adactin.BookHotel;
import org.test.pom.adactin.BookingConfirmationPage;
import org.test.pom.adactin.LoginPageAction;
import org.test.pom.adactin.SearchHotelPage;
import org.test.pom.adactin.SelectHotelPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPage extends AutoTestHelper {
	
	WebElement element;
	SearchHotelPage SearchHotelPage = new SearchHotelPage(getDriver());
	SelectHotelPage SelectHotelPage = new SelectHotelPage(getDriver());
	BookHotel BookHotel = new BookHotel(getDriver());

	
	@Given("User is on the adactin page")
	public void user_is_on_the_adactin_page() throws MalformedURLException {
		//getChromeDriver();
		getRemoteFireFoxriver();
		loadURL("https://www.adactin.com/HotelApp/index.php");
	}
	
	@When("users enters username and password")
	public void users_enters_username_and_password(io.cucumber.datatable.DataTable d) {
		//List<List<String>> list = d.asLists();
		List<Map<String,String>> mp= d.asMaps();
		LoginPageAction loginPage = new LoginPageAction(getDriver());
		type(loginPage.getTxtUsername(), mp.get(0).get("username"));
		type(loginPage.getTxtPassword(), mp.get(0).get("password"));
	}

	

//	@When("users enters {string} and {string}")
//	public void users_enters_and(String string, String string2) {
//
//		LoginPageAction loginPage = new LoginPageAction();
//		
//		type(loginPage.getTxtUsername(), string);
//		Assert.assertEquals("Verify User Name", string, loginPage.getTxtUsername().getAttribute("value"));
//		type(loginPage.getTxtPassword(), string2);
//		Assert.assertEquals("Verify Password", string2, loginPage.getTxtPassword().getAttribute("value"));
//
//	}
	
	
	@When("user should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
		element = getDriver().findElement(By.xpath("//input[@id='login']"));
		element.click();
	}

	@Then("user should verfy the message")
	public void user_should_verfy_the_message() {
	Assert.assertTrue("Verify URL",getDriver().getCurrentUrl().contains("SearchHotel"));
	
	}
	
	
	@When("user select the {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_select_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		
		
		
		selectByVisibleText(SearchHotelPage.getDdLocation(),string);
		Assert.assertEquals("Verify Location", string, SearchHotelPage.getDdLocation().getAttribute("value"));
		selectByVisibleText(SearchHotelPage.getDdHoltels(), string2);
		Assert.assertEquals("Verify Hotel", string2, SearchHotelPage.getDdHoltels().getAttribute("value"));

		selectByVisibleText(SearchHotelPage.getRoomTypeAndCount().get(0), string3);
		Assert.assertTrue("Verify Room Type", string3.contains(SearchHotelPage.getRoomTypeAndCount().get(0).getAttribute("value")));

		selectByVisibleText(SearchHotelPage.getRoomTypeAndCount().get(1),string4);
		Assert.assertTrue("Verify Room Type", string4.contains(SearchHotelPage.getRoomTypeAndCount().get(1).getAttribute("value")));
		
		element = SearchHotelPage.getTextCheckInOutDate().get(0);
		element.clear();
		
		type(SearchHotelPage.getTextCheckInOutDate().get(0), string5);
		
		Assert.assertEquals("Verify Check In", string5, SearchHotelPage.getTextCheckInOutDate().get(0).getAttribute("value"));
		
		element = SearchHotelPage.getTextCheckInOutDate().get(1);
		element.clear();
		
		type(SearchHotelPage.getTextCheckInOutDate().get(1), string6);
		Assert.assertEquals("Verify Check Out", string6, SearchHotelPage.getTextCheckInOutDate().get(1).getAttribute("value"));

		selectByVisibleText(SearchHotelPage.getDdAdultPerRoom(), string7);
		Assert.assertTrue("Verify Adult Count", string7.contains(SearchHotelPage.getDdAdultPerRoom().getAttribute("value")));

		selectByVisibleText(SearchHotelPage.getDdChildPerRoom(), string8);
		Assert.assertTrue("Verify Child Count", string8.contains(SearchHotelPage.getDdChildPerRoom().getAttribute("value")));

	}

	@Then("user should click search button")
	public void user_should_click_search_button() {
		btnClick(SearchHotelPage.getBtnsubmit());
	}
	
	@When("user should click checkbox")
	public void user_should_click_checkbox() {
		
		btnClick(SelectHotelPage.getRadioSelectHotel());
		
	}

	@Then("user should click continue button")
	public void user_should_click_continue_button() {
		btnClick(SelectHotelPage.getBtnContinue());
	}

	
	@When("user enter the {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_enter_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
		
		type(BookHotel.getTxtFirstName(), string);
		Assert.assertEquals("Verify First Name", string, BookHotel.getTxtFirstName().getAttribute("value"));

		type(BookHotel.getTxtLastName(), string2);
		Assert.assertEquals("Verify Last Name", string2, BookHotel.getTxtLastName().getAttribute("value"));

		type(BookHotel.getTxtAddress(), string3);
		Assert.assertEquals("Verify Address", string3, BookHotel.getTxtAddress().getAttribute("value"));

		type(BookHotel.getTxtCC(), string4);
		
		selectByValue(BookHotel.getSelectCCType(), string5);
		Assert.assertTrue("Verify CC Type", string5.contains(BookHotel.getSelectCCType().getAttribute("value")));		
		
		selectByValue(BookHotel.getSelectCCExpiryMonth(), string6);
		Assert.assertTrue("Verify Expiry Month", string6.contains(BookHotel.getSelectCCExpiryMonth().getAttribute("value")));


		selectByVisibleText(BookHotel.getSelectCCExpYear(), string7);
		Assert.assertTrue("Verify Expiry Year", string7.contains(BookHotel.getSelectCCExpYear().getAttribute("value")));
		
		type(BookHotel.getTxtCVV(), string8);
		Assert.assertEquals("Verify CVV", string8, BookHotel.getTxtCVV().getAttribute("value"));

		

	}

	@When("user should click book now button")
	public void user_should_click_book_now_button() throws InterruptedException {
		btnClick(BookHotel.getBtnBook());
		
		Thread.sleep(5000);
	}
	@Then("user should verfy the orderid")
	public void user_should_verfy_the_orderid() {
	BookingConfirmationPage BookingConfirmationPage = new BookingConfirmationPage(getDriver());
		
		
		System.out.println("Order ID : " + BookingConfirmationPage.getTxtOrderId().getAttribute("value"));
	}



}
