package com.pages;

import org.login.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Baseclass
{
	@FindBy(id="email")
	private WebElement txtUserName;


@FindBy(id="pass")
private WebElement txtPassword;

@FindBy(xpath="//button[@value='login']")
private WebElement btnlogin;

public WebElement getTextuserName()
{
	return txtUserName;
}
public WebElement gettxtpassword()
{
	return btnlogin;
	
}
public WebElement getbtnLogin()
{
	return btnlogin;
	
}
public void login(String userName, String password)

{
sendkeys(getTextuserName(), userName);
	sendkeys(gettxtpassword(), password);
elementClick(btnlogin);
}



}