package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestElement;
import pages.BrowserFactory;

public class BackgrounColorChangeStep extends BrowserFactory {
	TestElement testElement;

	@Before
	public void beforeRun() {
		initDriver();
		testElement = PageFactory.initElements(driver, TestElement.class);
		driver.get(" http://techfios.com/test/101/");
	}

	@Given("Set SkyBlue Background button exists")
	public void set_SkyBlue_Background_button_exists() {
		testElement.checkSkyBlueButtonExists();
		Assert.assertTrue("SkyBlue Button not found!", testElement.checkSkyBlueButtonExists());

	}

	@When("I click on the button")
	public void I_click_on_the_button() {

		testElement.clickOnSetSkyBlueButton();
	}

	@Then("The background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
		takeScreenShot(driver);
	}

	@Given("Set SkyWhite Background button exists")
	public void set_SkyWhite_Background_button_exists() {
		testElement.checkWhiteButtonExists();
		Assert.assertTrue("White Button not found!", testElement.checkWhiteButtonExists());

	}

	@When("I click on the SkyWhite button")
	public void I_click_on_the_SkyWhite_button() {

		testElement.clickOnSetWhiteButton();
	}

	@Then("The background color will change to white")
	public void the_background_color_will_change_to_white() {
		takeScreenShot(driver);
	}

	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}
}