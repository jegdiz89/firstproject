package org.locator;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass{
	
	public SearchPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id="location"),@FindBy(name="location"),@FindBy(xpath="(//select[@class='search_combobox'])[1]")})
	private WebElement Location;
	
	@FindAll({@FindBy(id="hotels"),@FindBy(name="hotels"),@FindBy(xpath="(//select[@class='search_combobox'])[2]")})
	private WebElement Hotels ;
	
	@FindAll({@FindBy(id="room_type"),@FindBy(name="room_type"),@FindBy(xpath="(//select[@class='search_combobox'])[3]")})
	private WebElement Room_Type  ;
	
	@FindAll({@FindBy(id="room_nos"),@FindBy(name="room_nos"),@FindBy(xpath="(//select[@class='search_combobox'])[4]")})
	private WebElement NumberofRooms  ;
	
	@FindAll({@FindBy(id="datepick_in"),@FindBy(name="datepick_in"),@FindBy(xpath="(//input[@class='date_pick'])[1]")})
	private WebElement CheckInDate  ;
	
	@FindAll({@FindBy(id="datepick_out"),@FindBy(name="datepick_out"),@FindBy(xpath="(//input[@class='date_pick'])[2]")})
	private WebElement CheckOutDate  ;
	
	@FindAll({@FindBy(id="adult_room"),@FindBy(name="adult_room"),@FindBy(xpath="(//select[@class='search_combobox'])[5]")})
	private WebElement AdultsperRoom  ;
	
	@FindAll({@FindBy(id="child_room"),@FindBy(name="child_room"),@FindBy(xpath="(//select[@class='search_combobox'])[6]")})
	private WebElement ChildrenperRoom  ;
	
	@FindAll({@FindBy(id="Submit"),@FindBy(name="Submit"),@FindBy(xpath="(//input[@class='reg_button'])[1]")})
	private WebElement btnSearch  ;
	
	@FindAll({@FindBy(id="Reset"),@FindBy(name="Reset"),@FindBy(xpath="(//input[@class='reg_button'])[2]")})
	private WebElement btnReset  ;

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoom_Type() {
		return Room_Type;
	}

	public WebElement getNumberofRooms() {
		return NumberofRooms;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getAdultsperRoom() {
		return AdultsperRoom;
	}

	public WebElement getChildrenperRoom() {
		return ChildrenperRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}
	

}
