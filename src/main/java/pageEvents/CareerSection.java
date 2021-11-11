package pageEvents;
import org.testng.Assert;


import pageObjects.CareerPageElements;
import utils.ElementFetch;
import utils.SeleniumUtils;
public class CareerSection {
	
	public void clickCareerSection()
	{
		ElementFetch elementfetch = new ElementFetch();
		
		elementfetch.getWebElement("XPATH",CareerPageElements.acceptAllCookies).click();
		
		Assert.assertTrue(elementfetch.getWebElement("XPATH",CareerPageElements.careerlink ).isDisplayed());
		elementfetch.getWebElement("XPATH",CareerPageElements.careerlink ).click();
	}
	
	
	public void openpositionclickandValidate()
	{
		
		ElementFetch elementfetch = new ElementFetch();
		Assert.assertEquals(elementfetch.getWebElement("XPATH",CareerPageElements.openPositions).getText(), "16 open positions");
		elementfetch.getWebElement("XPATH",CareerPageElements.openPositions).click();
	}

}
