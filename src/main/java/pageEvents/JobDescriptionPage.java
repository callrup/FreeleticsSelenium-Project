package pageEvents;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.ElementFetch;
import utils.SeleniumUtils;

import pageObjects.JobDescriptionPageObject;

public class JobDescriptionPage {
	WebDriver driver;

	ElementFetch elementfetch = new ElementFetch();
	public void currentJobVacancyforQA()
	{
		//SeleniumUtils.scrollToTheElement(JobDescriptionPageObject.prodEngineering);
		Assert.assertEquals(elementfetch.getWebElement("XPATH",JobDescriptionPageObject.prodEngineering).getText(), "Product Engineering");
		//String PositionText= elementfetch.getWebElement("ID",JobDescriptionPageObject.qaPosition).getText();
		elementfetch.getWebElement("XPATH",JobDescriptionPageObject.qaPosition).click();	
		SeleniumUtils.screenshot(driver,"Click on QA Post");
	}
	
	
}
