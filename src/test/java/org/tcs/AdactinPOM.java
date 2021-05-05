package org.tcs;

import java.awt.Scrollbar;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.locator.LoginPage;
import org.locator.SearchPage;
import org.locator.SelectHotel;

public class AdactinPOM extends BaseClass{
	public static void main(String[] args) throws Throwable {
		
		browserconfig();
		launchUrl("http://adactinhotelapp.com/index.php");
		LoginPage log=new LoginPage();
		enterText(log.getTxtUsername(), "rushanrushan");
		enterText(log.getTxtPassword(), "Rushan");
		btnClick(log.getBtnLogin());
		
		SearchPage se=new SearchPage();
		selectByVisibletext(se.getLocation(), "Melbourne");
		selectByindex(se.getHotels(), 1);
		selectByindex(se.getRoom_Type(), 3);
		selectByindex(se.getNumberofRooms(),2);
		enterText(se.getCheckInDate(), "24/04/2021");
		enterText(se.getCheckOutDate(), "25/04/2021");
		selectByindex(se.getAdultsperRoom(), 3);
		selectByindex(se.getChildrenperRoom(), 2);
		btnClick(se.getBtnSearch());
		
		SelectHotel sl=new SelectHotel();
		btnClick(sl.getBtnOption());
		btnClick(sl.getBtnContinue());
		enterText(sl.getFirstName(), "johndy Rodes");
		enterText(sl.getLastName(), "Johny)");
		enterText(sl.getBillingAddress(), "65789,Thor Street, Marevel,California");
		enterText(sl.getCreditCardNo(), "65765676774745464656545454");
		selectByVisibletext(sl.getCreditCardType(), "VISA");
		selectByVisibletext(sl.getExpiryMonth(), "January");
		selectByVisibletext(sl.getExpiryYear(), "2022");
		enterText(sl.getCvvNumber(), "5454");
		btnClick(sl.getBtnSearch());
		Thread.sleep(6000);
		screenShot("jhagjd");
		
	}
	
	

}
