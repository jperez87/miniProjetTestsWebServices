package org.autom.eql;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageCasDeTest extends ObjectPageCommun {

	public WebDriver driver;

	String messageSurbrillance = "jstree-clicked ui-state-default";
	WebElement projet = driver.findElement(By.xpath("//div[@id='tree']/ul/li[1]/a"));
	
	public void casDeTestSurbrillance() {
		String originalClass = projet.getAttribute("class");
		this.projet.click();
		String clickedClass = projet.getAttribute("class");
		Assert.assertFalse(originalClass.equals(clickedClass));
		assertEquals(messageSurbrillance, clickedClass);
	}
}
