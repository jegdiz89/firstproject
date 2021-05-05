package org.locator;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
PageFactory.initElements(driver, this);	
}
	@FindAll({@FindBy(id="radiobutton_0"),@FindBy(name="radiobutton_0"),@FindBy(xpath="//input[@type='radio']"),@FindBy(id="radiobutton_1"),@FindBy(name="radiobutton_1"),@FindBy(id="radiobutton_2"),@FindBy(name="radiobutton_2"),@FindBy(id="radiobutton_3"),@FindBy(name="radiobutton_3"),@FindBy(id="radiobutton_4"),@FindBy(name="radiobutton_4"),@FindBy(id="radiobutton_5"),@FindBy(name="radiobutton_5")})
	private WebElement btnOption;
	
	@FindAll({@FindBy(id="continue"),@FindBy(name="continue"),@FindBy(xpath="//input[@type='submit']")})
	private WebElement btnContinue;
	
	@FindAll({@FindBy(id="first_name"),@FindBy(name="first_name"),@FindBy(xpath="(//input[@class='reg_input'])[1]")})
	private WebElement FirstName;
	
	@FindAll({@FindBy(id="last_name"),@FindBy(name="last_name"),@FindBy(xpath="(//input[@class='reg_input'])[2]")})
	private WebElement LastName;
	
	@FindAll({@FindBy(id="address"),@FindBy(name="address"),@FindBy(xpath="//textarea[@class='txtarea']")})
	private WebElement BillingAddress;
	
	@FindAll({@FindBy(id="cc_num"),@FindBy(name="cc_num"),@FindBy(xpath="(//input[@class='reg_input'])[3]")})
	private WebElement CreditCardNo;
		
	@FindAll({@FindBy(id="cc_type"),@FindBy(name="cc_type"),@FindBy(xpath="//select[@class='select_combobox']")})
	private WebElement CreditCardType;
	
	@FindAll({@FindBy(id="cc_exp_month"),@FindBy(name="cc_exp_month"),@FindBy(xpath="(//select[@class='select_combobox2'])[1]")})
	private WebElement ExpiryMonth;
	
	@FindAll({@FindBy(id="cc_exp_year"),@FindBy(name="cc_exp_year"),@FindBy(xpath="(//select[@class='select_combobox2'])[2]")})
	private WebElement ExpiryYear;
	
	@FindAll({@FindBy(id="cc_cvv"),@FindBy(name="cc_cvv"),@FindBy(xpath="(//input[@class='reg_input'])[4]")})
	private WebElement CvvNumber;
	
	@FindAll({@FindBy(id="book_now"),@FindBy(name="book_now"),@FindBy(xpath="(//input[@class='reg_button'])[1]")})
	private WebElement btnSearch  ;
	
	@FindAll({@FindBy(id="order_no"),@FindBy(name="order_no"),@FindBy(xpath="(//input[@class='disable_text'])[15]")})
	private WebElement txtOrderNo  ;

	public WebElement getBtnOption() {
		return btnOption;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCvvNumber() {
		return CvvNumber;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}
	
}
