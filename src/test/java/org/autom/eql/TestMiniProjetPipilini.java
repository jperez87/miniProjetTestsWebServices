package org.autom.eql;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMiniProjetPipilini {

	public String TUT = System.getProperty("navigateur");
	public WebDriver driver;

	public String user="admin";
	public String pwd="admin";
	
	@Before
	public void monBefore() throws InterruptedException {	


		if (TUT.equals("chrome")) {
			System.setProperty("driver.chrome.driver", "/home/ubuntu/SUT/chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(TUT.equals("firefox")) {
			System.setProperty("driver.gecko.driver", "/home/ubuntu/SUT/geckodriver.exe");
			driver = new FirefoxDriver();

		};

		driver.get("http://localhost:9876/squash");
	}
	
	@Test
	public void creerUnCasDeTest() {
		System.out.println("/////////////*********DEBUT_DES_TESTS*********/////////////");
		PageConnection pageConnect = new PageConnection();

		//Se connecter en tant que 'admin'
		HomePage homePage = new HomePage();
		homePage = pageConnect.connection(user, pwd);
		
		//On vérifie qu'on se situe bien sur la page d'accueil
		homePage.verifHomePage();
		
		//Aller dans l'Espace Cas de test et sélectionner un projet dans l'arbre des cas de test.
		PageCasDeTest pageCasdT = new PageCasDeTest();
		pageCasdT = homePage.accesPageCdT();
		pageCasdT.casDeTestSurbrillance();

	}
	
	@After
	public void monAfter() {
		driver.quit();
		driver.close();
	}
	
}
