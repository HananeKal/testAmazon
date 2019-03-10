package stepsDefinition;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	String sujet = "selenium test";

	@Given("^L'utilisateur ouvre le site web")
	public void ouvrir_Firefox_et_lancer_application() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C://Users//Hkalkha//Desktop//seleniumJars//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
	}

	@When("^L'utilisateur tappe le sujet de recherche$")
	public void tapper_le_sujet_de_recherche() throws Throwable {
		System.out.println("L'utilisateur tappe le sujet de recherche");
		driver.findElement(By.name("q")).sendKeys(sujet);
		driver.findElement(By.name("btnK")).click();

	}
	
	

	@Then("le titre de la fenetre doit contient le sujet de recherche$")
	public void verfier_le_titre_de_la_fenetre() throws Throwable {
		System.out.println("le titre de la fenetre doit egal le sujet de recherche");
		String titreFenetre = driver.getTitle();
		Assert.assertTrue(titreFenetre.contains(sujet));
		System.out.println(titreFenetre);
		driver.close();
	}

}
