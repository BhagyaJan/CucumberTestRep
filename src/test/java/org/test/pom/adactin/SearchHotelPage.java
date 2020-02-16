package org.test.pom.adactin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.help.AutoTestHelper;

public class SearchHotelPage {

		
		public SearchHotelPage(WebDriver driver)
		{
			
				PageFactory.initElements(driver, this);
			
		}
			
		@FindBy(id="location")
		private WebElement ddLocation;

		@FindBy(id="hotels")
		private WebElement ddHoltels;
		
		/*@FindBy(id="room_type")
		private WebElement ddRoomType;
		
		@FindBy(id="room_nos")
		private WebElement ddRoomNos;*/
		
		/*@FindBy(id="datepick_in")
		private WebElement textCheckInDate;
		
		@FindBy(id="datepick_out")
		private WebElement textCheckOutDate;*/
		
		@FindBy(id="adult_room")
		private WebElement ddAdultPerRoom;
		
		@FindBy(id="child_room")
		private WebElement ddChildPerRoom;
		
		@FindBy(id="Submit")
		private WebElement btnsubmit;
		
		
		@FindAll({
			
			@FindBy(id="room_type"),
			@FindBy(id="room_nos")
		})
		private List<WebElement> roomTypeAndCount;
		
		
		@FindBy(xpath="//input[contains(@id,'datepick')]")
		private List<WebElement> textCheckInOutDate;

		public List<WebElement> getTextCheckInOutDate() {
			//System.out.println(textCheckInOutDate.size());
			return textCheckInOutDate;
		}

		public List<WebElement> getRoomTypeAndCount() {
			//System.out.println(roomTypeAndCount.size());
			return roomTypeAndCount;
		}

		public WebElement getDdLocation() {
			return ddLocation;
		}

		public WebElement getDdHoltels() {
			return ddHoltels;
		}

		/*public WebElement getDdRoomType() {
			return ddRoomType;
		}

		public WebElement getDdRoomNos() {
			return ddRoomNos;
		}*/

		/*public WebElement getTextCheckInDate() {
			return textCheckInDate;
		}

		public WebElement getTextCheckOutDate() {
			return textCheckOutDate;
		}*/

		public WebElement getDdAdultPerRoom() {
			return ddAdultPerRoom;
		}

		public WebElement getDdChildPerRoom() {
			return ddChildPerRoom;
		}

		public WebElement getBtnsubmit() {
			return btnsubmit;
		}
		
}
