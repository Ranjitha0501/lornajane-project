package com.pages;

import org.login.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment extends Baseclass{
	@FindBy(xpath="//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']")
	private WebElement address;
	@FindBy(xpath="//select[@name='address_type']")
	private WebElement selectaddresstype;
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement contactno;
	@FindBy(xpath="//input[@name='apartment']")
	private WebElement houseno;
	@FindBy(xpath="//input[@name='address']")
	private WebElement addresstype;
	@FindBy(xpath="//select[@name='country']")
	private WebElement country;
	@FindBy(xpath="//select[@name='state']")
	private WebElement state;
	@FindBy(xpath="//select[@name='city']")
	private WebElement city;
	@FindBy(xpath="//input[@name='zipcode']")
	private WebElement zipcode;
	@FindBy(xpath="//button[@class='saveAddress font18 fontSemiBold colorWhite bgTheme radius50 borderNone px-5 py-2 hover1']")
	private WebElement save;
	@FindBy(xpath="//select[@class='form-control']")
	private WebElement payment;
	@FindBy(xpath="//label[text()=' Visa ']")
	private WebElement cardtype;
	@FindBy(xpath="//input[@class=\"form-control mt-2\"]")
	private WebElement cardno;
	@FindBy(xpath="//select[@class='form-control']")
	private WebElement month;
	@FindBy(xpath="//select[@id='year']")
	private WebElement year;
	@FindBy(xpath="//input[@name='cvv']")
	private WebElement cvv;
	@FindBy(xpath="//button[@id='placeOrder']")
	private WebElement placeorder;
	public WebElement getAddress()
	{
		return address;
	}
	public WebElement getSelectaddresstype() 
	{
		return selectaddresstype;
	}
	public WebElement getFirstname()
	{
		return firstname;
	}
	public WebElement getLastname()
	{
		return lastname;
	}
	public WebElement getContactno() 
	{
		return contactno;
	}
	public WebElement getHouseno()
	{
		return houseno;
	}
	public WebElement getAddresstype() 
	{
		return addresstype;
	}
	public WebElement getCountry()
	{
		return country;
	}
	public WebElement getState()
	{
		return state;
	}
	public WebElement getCity()
	{
		return city;
	}
	public WebElement getZipcode() 
	{
		return zipcode;
	}
	public WebElement getSave()
	{
		return save;
	}
	public WebElement getPayment() 
	{
		return payment;
	}
	public WebElement getCardtype() 
	{
		return cardtype;
	}
	public WebElement getCardno()
	{
		return cardno;
	}
	public WebElement getMonth() 
	{
		return month;
	}
	public WebElement getYear() 
	{
		return year;
	}
	public WebElement getCvv() 
	{
		return cvv;
	}
	public WebElement getPlaceorder()
	{
		return placeorder;
	}
	public void placeorder(String fname, String laname,int cno,int houseno,String addresstype,String country,String state,String city,int zipcode)
	{
		elementClick(address);
		elementClick(cardtype);
		elementClick(save);
		elementClick(cardno);
		elementClick(selectaddresstype);
		elementClick(payment);
		elementClick(year);
		elementClick(cvv);
		elementClick(month);
		elementClick(placeorder);
		
	}
	
	

}