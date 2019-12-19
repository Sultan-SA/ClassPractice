package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassPracticeStepDefinitions {
	WebDriver driver;
	@Given("^User is on Tek School of America page$")
	public void user_is_on_Tek_School_of_America_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://tekschoolofamerica.com/");
	   
	}

	@When("^User is navigate to test environment$")
	public void user_is_navigate_to_test_environment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//a[text()='Test Environment']")).sendKeys(Keys.ENTER);
	}

	@Then("^TekSchool is displayed$")
	public void tekschool_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String testEnvPageTitle=driver.getTitle();
	    System.out.println(testEnvPageTitle);
	    		
	}

}
