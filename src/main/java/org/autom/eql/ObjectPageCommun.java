package org.autom.eql;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectPageCommun {
	
	public WebDriver driver;

	public WebElement espaceExigences = driver.findElement(By.id("requirement-link"));
	public WebElement espaceCasDeTest = driver.findElement(By.id("test-case-link"));
	public WebElement espaceCampagne = driver.findElement(By.id("campaign-link"));

}
