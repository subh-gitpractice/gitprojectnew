package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class googlesearch {
	WebDriver driver = null;
	@Given("browser is open in {string}")
	public void browser_is_open_in(String browser) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:/Users/my pc/eclipse-workspace/cucumber-java/src/test/resources/driver/chromedriver.exe");
		System.out.println("Testing");
	    driver = new ChromeDriver();
	    System.out.println("inside open brwoser"+ browser);
		
	}

	@Given("user is on googlesearch page")
	public void user_is_on_googlesearch_page() {
		driver.get("https://google.com");
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("user enters a text in serach box")
	public void user_enters_a_text_in_serach_box() {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("q")).sendKeys("Automations Step by Step");
	}

	@And("hits enter")
	public void hits_enter() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@And("user navigated to searched results")
	public void user_navigated_to_searched_results() {
	    // Write code here that turns the phrase above into concrete actions
		driver.getPageSource().contains("Online Courses");
		driver.quit();
	 
	}

}
