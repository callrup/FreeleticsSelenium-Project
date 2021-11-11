package pageEvents;

import org.testng.Assert;

import pageObjects.CareerPageElements;
import utils.ElementFetch;
import utils.SeleniumUtils;

import pageObjects.JobDescriptionPageObject;
import pageObjects.OpenPositionPageObject;

public class JobDescriptionPage {

	ElementFetch elementfetch = new ElementFetch();
	public void currentJobVacancyforQA()
	{
		//SeleniumUtils.scrollToTheElement(JobDescriptionPageObject.prodEngineering);
		Assert.assertEquals(elementfetch.getWebElement("XPATH",JobDescriptionPageObject.prodEngineering).getText(), "Product Engineering");
		//String PositionText= elementfetch.getWebElement("ID",JobDescriptionPageObject.qaPosition).getText();
		elementfetch.getWebElement("XPATH",JobDescriptionPageObject.qaPosition).click();	
	}
	
	
}
