package pageEvents;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.ElementFetch;
import utils.SeleniumUtils;
import pageObjects.OpenPositionPageObject;

public class RoleToSelectAndApply {
	 WebDriver driver;
	
	ElementFetch elementfetch = new ElementFetch();

	public void validateTopSection()
	{
		String JobTitle = elementfetch.getWebElement("XPATH",OpenPositionPageObject.jobTitle).getText();
		String JobLoc = elementfetch.getWebElement("XPATH",OpenPositionPageObject.jobTitle).getText();
	
		Assert.assertEquals(true, JobTitle.contains("QA Engineer"),"Title matching");
		Assert.assertEquals(true, JobLoc.contains("Munich"),"Job Location Munich");
		SeleniumUtils.screenshot(driver, "JobTitleDetails");
	
	}
	
	public void validateJobDescription()
	{
		   // description assertion
        String jobDescription = elementfetch.getWebElement("XPATH",OpenPositionPageObject.roledescription).getText();
        Assert.assertTrue(!jobDescription.isEmpty() && jobDescription.contains("We are looking to expand our QA team"));
        SeleniumUtils.screenshot(driver, "JobDescription");
	}
	
	public void validateResponsibility()
	{
	
		String responsibilityText=elementfetch.getWebElement("XPATH",OpenPositionPageObject.responsibility).getText();
		Assert.assertTrue(responsibilityText.contains("Your responsibilities"));
	    Assert.assertTrue(elementfetch.getListWebElements("XPATH",OpenPositionPageObject.listOfResponsibility).size()==9,"total no of Responsibility not matching");
	    SeleniumUtils.screenshot(driver, "ResponsibilityList");
	}
	
	public void validateProfile()
	{
	
		 Assert.assertTrue(elementfetch.getWebElement("XPATH",OpenPositionPageObject.profile).getText().contains("Your profile"));
		 Assert.assertTrue(elementfetch.getListWebElements("XPATH",OpenPositionPageObject.listOfProfile).size()==8,"total no of Profile not matching");
		 SeleniumUtils.screenshot(driver, "Profile Details");
	}
	
	public void applyForTheJob()
	{
		
		
		elementfetch.getWebElement("XPATH",OpenPositionPageObject.applyforthejob).click();
		SeleniumUtils.screenshot(driver, "Apply And LandtoApplicationPage");
	}
}
