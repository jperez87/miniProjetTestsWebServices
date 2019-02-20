package org.autom.eql;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageConnection {

	public WebDriver driver;
	
	public WebElement userInput = driver.findElement(By.xpath("/input[@id='username']"));
	public WebElement pwdInput = driver.findElement(By.xpath("/input[@id='username']"));
	
	public WebElement buttonSeConnecter = driver.findElement(By.className("sq-btn"));
	
	public HomePage connection(String user, String pwd) {
		this.userInput.sendKeys(user);
		this.pwdInput.sendKeys(pwd);
		this.buttonSeConnecter.click();
		
		return PageFactory.initElements(driver, HomePage.class);
	}
}
