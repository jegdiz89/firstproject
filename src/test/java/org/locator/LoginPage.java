package org.locator;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
public LoginPage() {
	PageFactory.initElements(driver, this);
}

@FindAll({ @FindBy(id="username"),@FindBy(name="username"),@FindBy(xpath="(//input[@class='login_input'])[1]") })
private WebElement txtUsername;

@FindAll({@FindBy(id="password"),@FindBy(name="password"),@FindBy(xpath="(//input[@class='login_input'])[2]")})
private WebElement txtPassword;

@FindAll({@FindBy(id="login"),@FindBy(name="login"),@FindBy(xpath="//input[@class='login_button']")})
private WebElement btnLogin;

public WebElement getTxtUsername() {
	return txtUsername;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public WebElement getBtnLogin() {
	return btnLogin;
}

}

