package com.pages;

import org.login.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends Baseclass {
	@FindBy(id="search")
	private WebElement search;
	@FindBy(xpath="//a[text()='Add']")
	private WebElement add;
	@FindBy(xpath="//button[text()='Add'][1]")
	private WebElement add1;
	@FindBy(xpath="//button[text()='Add'][2]")
	private WebElement add2;
	@FindBy(xpath="//a[text()=' Go To Cart ']")
	private WebElement GotoCart;
	public WebElement getSearch() {
		return search;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getAdd1() {
		return add1;
	}
	public WebElement getAdd2() {
		return add2;
	}
	public WebElement getGotoCart() {
		return GotoCart;
	}
	public void search(String productName)
	{
		sendkeys(search, productName);
elementClick(add);
elementClick(add1);
elementClick(add2);
elementClick(GotoCart);
}

}
