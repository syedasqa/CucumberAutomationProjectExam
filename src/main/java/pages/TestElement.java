package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestElement {

	WebDriver driver;

	public TestElement(WebDriver driver) {
		this.driver = driver;

	}

	// Finding Element
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/button[1]")
	WebElement SetSkyBlueButton;
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/button[2]")
	WebElement SetWhiteButton;

	// Methods to interact with element
	public void clickOnSetSkyBlueButton() {
		SetSkyBlueButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSetWhiteButton() {
		SetWhiteButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean checkSkyBlueButtonExists() {

		return SetSkyBlueButton.isDisplayed();

	}

	public boolean checkWhiteButtonExists() {

		return SetWhiteButton.isDisplayed();

	}

}
