package org.tcs;

import org.baseclass.BaseClass;

public class SampleBase extends BaseClass{

public static void main(String[] args) throws Exception {
		
		browserconfig();
		launchUrl("http://adactinhotelapp.com/");
		enterText(findelementById("username"), "rushanrushan");
		enterText(findelementById("password"), "Rushan");
		btnClick(findelementById("login"));
		selectByindex(findelementById("location"), 2);
		selectByindex(findelementById("room_nos"), 6);
		enterText(findelementById("datepick_in"), "23/04/2021");
		enterText(findelementById("datepick_out"), "24/04/2021");
		selectByindex(findelementById("child_room"), 2);
		btnClick(findelementById("Submit"));
		driver.manage().window().maximize();
		btnClick(findelementById("radiobutton_2"));
		btnClick(findelementById("continue"));
		enterText(findelementById("first_name"), "Joyces");
		enterText(findelementById("last_name"), "John");
		enterText(findelementById("address"), "6A,Johny walker street");
		enterText(findelementById("cc_num"), "6568767697647676");
		selectByindex(findelementById("cc_type"), 1);
		selectByindex(findElementByName("cc_exp_month"), 7);
		selectByindex(findElementByName("cc_exp_year"), 12);
		enterText(findElementByName("cc_cvv"), "765");
		btnClick(findelementById("book_now"));
		driver.wait();
		screenShot("adactin");
	}


	
	
	

	}

}
