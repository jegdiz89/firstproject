package org.testsample;

import org.baseclass.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locator.LoginPage;
import org.locator.SearchPage;
import org.locator.SelectHotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinUsingJunit extends BaseClass {

	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		browserconfig();
		launchUrl("http://adactinhotelapp.com/index.php");
	}
	
	@Test
	public void tc0() throws Throwable {
		LoginPage log = new LoginPage();
		enterText(log.getTxtUsername(), getDataFromExcel("Ddata", "data", 0, 0));
		enterText(log.getTxtPassword(), getDataFromExcel("Ddata", "data", 0, 1));
		btnClick(log.getBtnLogin());
	}
	@Test
	public void tc1() throws Throwable {
		SearchPage se=new SearchPage();
		enterText(se.getLocation(), getDataFromExcel("Ddata", "data", 1, 0));
		enterText(se.getHotels(), getDataFromExcel("Ddata", "data", 2, 0));
		enterText(se.getRoom_Type(), getDataFromExcel("Ddata", "data", 3, 0));
		enterText(se.getNumberofRooms(), getDataFromExcel("Ddata", "data", 4, 0));
		enterText(se.getCheckInDate(), getDataFromExcel("Ddata", "data", 5, 0));
		enterText(se.getCheckOutDate(), getDataFromExcel("Ddata", "data", 6, 0));
		enterText(se.getAdultsperRoom(), getDataFromExcel("Ddata", "data", 7, 0));
		enterText(se.getChildrenperRoom(), getDataFromExcel("Ddata", "data", 8, 0));
		btnClick(se.getBtnSearch());
	}
	@Test
	public void tc2() throws Throwable {
		SelectHotel sh=new SelectHotel();
		btnClick(sh.getBtnOption());
		btnClick(sh.getBtnContinue());
		enterText(sh.getFirstName(), getDataFromExcel("Ddata", "data", 9, 0));
		enterText(sh.getLastName(),  getDataFromExcel("Ddata", "data", 9, 1));
		enterText(sh.getBillingAddress(), getDataFromExcel("Ddata", "data", 10, 0));
		enterText(sh.getCreditCardNo(), getDataFromExcel("Ddata", "data", 11, 0));
		enterText(sh.getCreditCardType(), getDataFromExcel("Ddata", "data", 12, 0));
		enterText(sh.getExpiryMonth(), getDataFromExcel("Ddata", "data", 13, 0));
		enterText(sh.getExpiryYear(), getDataFromExcel("Ddata", "data", 14, 0));
		enterText(sh.getCvvNumber(), getDataFromExcel("Ddata", "data", 15, 0));
		btnClick(sh.getBtnSearch());
		Thread.sleep(15000);
		write("data", 22, 6, getAttribute(sh.getTxtOrderNo()));
		System.out.println("done");
	
		
	}

}
