package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsConnexion {

	
	WebDriver driver;
	String sujet = "livre";

	@Given("^L'utilisateur ouvre le site web")
	public void ouvrir_Firefox_et_lancer_application() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C://Users//Hkalkha//Desktop//seleniumJars//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://amazon.fr");
	}

	@When("^L'utilisateur clique sur menu Votre compte$")
	public void cliquer_sur_menu_compte() throws Throwable {
		System.out.println("L'utilisateur clique sur menu Votre compte");
		driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]")).click();
	}
////////////	
	@And("^L'utilisateur clique sur le botton Identifiez-vous$")
	public void cliquer_sur_le_botton_de_identification() throws Throwable {
		System.out.println("L'utilisateur clique sur le botton Identifiez-vous");
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
	}
	

	@And("^L'utilisateur clique sur le botton recherche$")
	public void cliquer_sur_le_botton_de_recherche() throws Throwable {
		System.out.println("L'utilisateur clique sur le botton de recherche");
		driver.findElement(By.className("nav-input")).click();

	}
	
	@Then("le titre de la fenetre doit contient le sujet de recherche$")
	public void verififer_le_titre() throws Throwable {
		System.out.println("le titre de la fenetre doit contient le sujet de recherche");
		String titreFenetre = driver.getTitle();
		Assert.assertTrue(titreFenetre.contains(sujet));
		System.out.println(titreFenetre);
		driver.close();
	}

}
