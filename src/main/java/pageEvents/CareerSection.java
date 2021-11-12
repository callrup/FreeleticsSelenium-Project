package pageEvents;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import pageObjects.CareerPageElements;
import utils.ElementFetch;
import utils.SeleniumUtils;
public class CareerSection {
	WebDriver driver;
	
	public void clickCareerSection()
	{
		ElementFetch elementfetch = new ElementFetch();
		
		elementfetch.getWebElement("XPATH",CareerPageElements.acceptAllCookies).click();
		
		Assert.assertTrue(elementfetch.getWebElement("XPATH",CareerPageElements.careerlink ).isDisplayed());
		elementfetch.getWebElement("XPATH",CareerPageElements.careerlink ).click();
		SeleniumUtils.screenshot(driver, "Landing career Page");
	}
	
	
	public void openpositionclickandValidate()
	{
		
		ElementFetch elementfetch = new ElementFetch();
		String openPositions = elementfetch.getWebElement("XPATH",CareerPageElements.openPositions).getText();
		Assert.assertEquals(true, openPositions.contains("open positions"),"Title matching");
		//Assert.assertEquals(elementfetch.getWebElement("XPATH",CareerPageElements.openPositions).getText().contains("open positions"));
		elementfetch.getWebElement("XPATH",CareerPageElements.openPositions).click();
		SeleniumUtils.screenshot(driver, "Click on Open Position");
	}

}
