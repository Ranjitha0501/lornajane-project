package org.executing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.BookWagonLoginPage;

import pageManager.PageManager;

public class TestScript extends BaseClass {
	public static void main(String[] args) throws IOException {

		{

			File propertyfile = new File("DataBase\\config.properties");

			// Used to Read FileData from File Class Path
			FileReader fileReader = new FileReader(propertyfile); // throws FileNotFoundException

			// To Define Property
			Properties properties = new Properties();

			// To Load Property files to Property Class
			properties.load(fileReader); // throws IOException

			// To get Value from Property file using respective key
			String property = properties.getProperty("browser");
			System.out.println(property);
			getDriver(property);
			winMax();

			String url = properties.getProperty("url");
			getUrl(url);

			screenCapture();

			BaseClass baseClass = new BaseClass();
			//baseClass.getUrl(url);
			//baseClass.getDriver(baseClass.readExcel(0, 2));
			//baseClass.getUrl(baseClass.readExcel(1, 1));
			winMax();

			//BaseClass.screenCapture();
			PageManager pagemanager=new PageManager();
			BookWagonLoginPage bookswagonLoginPage = pagemanager.bookswagonLoginPage();
			WebElement userBooksPageImage = bookswagonLoginPage.getUserBooksPageImage();

			//validate user is in Bookswagon page

			if (userBooksPageImage.getText().contains("Book")) {

				System.out.println("User is In BooksWagonPage");

			} else {
				System.out.println("User Not In Bookswagon Page");
			}

			WebElement myAccount = bookswagonLoginPage.getMyAccount();
			myAccount.click();

			WebElement login = bookswagonLoginPage.getLogin();
			baseClass.mouseOver(login);
			//login.click();
			baseClass.implicitWait(30);
			
//			WebElement loginText = bookswagonLoginPage.getLoginText();
//			if (loginText.isDisplayed()) {
//				System.out.println("User is in login page");
//				
//			} else {
//				System.out.println("User is notin login page");
//
//			}
//			 if (bookswagonLoginPage.getLoginText().isDisplayed()) {
//				 
//				 System.out.println("User is in login page");
//					
//			} else {
//				System.out.println("User is notin login page");
//
//			}
//
			WebElement loginText = bookswagonLoginPage.getLoginText();
			if (loginText.getText().contains("Log in")) {
				System.out.println("User is In Login Page");

			} else {
				System.out.println("User is Not In Login Page");

			}
			
			
			
			
			WebElement userName = bookswagonLoginPage.getUsername();
			
			//baseClass.sendKeysByJava(userName, baseClass.readExcel(2, 1));
			baseClass.sendKeysByJS(userName, baseClass.readExcel(2, 1));
			String userNameattribute = BaseClass.getAttribute(userName);
			System.out.println(userNameattribute);

			WebElement password = bookswagonLoginPage.getPassword();
			baseClass.sendKeysByJava(password, baseClass.readExcel(3, 1));
			String passwordattribute = baseClass.getAttribute(password);
			System.out.println(passwordattribute);

			WebElement loginButton = bookswagonLoginPage.getLoginButton();
			baseClass.clickByJava(loginButton);


		}
	}
}
