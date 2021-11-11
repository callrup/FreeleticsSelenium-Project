package pageEvents;

import org.testng.Assert;

import pageObjects.CareerPageElements;
import utils.ElementFetch;
import utils.SeleniumUtils;

import pageObjects.JobDescriptionPageObject;
import pageObjects.OpenPositionPageObject; 

public class RoleToSelectAndApply {
	
	ElementFetch elementfetch = new ElementFetch();

	public void validateTopSection()
	{
		String JobTitle = elementfetch.getWebElement("XPATH",OpenPositionPageObject.jobTitle).getText();
		String JobLoc = elementfetch.getWebElement("XPATH",OpenPositionPageObject.jobLocation).getText();
	
		Assert.assertEquals(true, JobTitle.contains("QA Engineer"),"Title matching");
		Assert.assertEquals(true, JobLoc.contains("Munich"),"Job Location Munich");
	
	}
	
	public void validateJobDescription()
	{
		   // description assertion
        String jobDescription = elementfetch.getWebElement("XPATH",OpenPositionPageObject.roledescription).getText();
        Assert.assertTrue(!jobDescription.isEmpty() && jobDescription.contains("As a QA Engineer, you will take ownership of software quality in Freeletics"));
	}
	
	public void validateResponsibility()
	{
	
		String responsibilityText=elementfetch.getWebElement("XPATH",OpenPositionPageObject.responsibility).getText();
		Assert.assertTrue(responsibilityText.contains("Your responsibilities"));
	    Assert.assertTrue(elementfetch.getListWebElements("XPATH",OpenPositionPageObject.listOfResponsibility).size()==9,"total no of Responsibility not matching");
	}
	
	public void validateProfile()
	{
	
		 Assert.assertTrue(elementfetch.getWebElement("XPATH",OpenPositionPageObject.profile).getText().contains("Your profile"));
		 Assert.assertTrue(elementfetch.getListWebElements("XPATH",OpenPositionPageObject.listOfProfile).size()==9,"total no of Profile not matching");
	}
	
	public void applyForTheJob()
	{
		
		
		elementfetch.getWebElement("XPATH",OpenPositionPageObject.applyforthejob).click();
	}
}
