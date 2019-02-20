package org.autom.eql;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ObjectPageCommun {

	public WebDriver driver;

	public WebElement messageHome = driver.findElement(By.xpath("//h2[contains(.,'HOME')]"));

		
	public void verifHomePage() {
		String home = messageHome.getText();
	    assertTrue(home.equals("HOME"));
	}
	
	public PageCasDeTest accesPageCdT() {
		espaceCasDeTest.click();
		return PageFactory.initElements(driver, PageCasDeTest.class);
	}
}
