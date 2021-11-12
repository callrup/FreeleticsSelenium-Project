package utils;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

//import org.openqa.selenium.support.ui.ExpectedCondition;


public class SeleniumUtils extends SuiteListener {
	
	public static WebDriver driver;
	public static ExtentTest logger;
	
	public static WebElement findElement(String loc)
	{
		WebElement element = null;
		try {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc)));
		
		if (element.isDisplayed())
		{
			
		}
		else 
		{
			Assert.assertTrue(element.isDisplayed());
		}
		}
		
		catch (Exception e)
		{
			System.out.println("Element not found");
		}
		
		return element;
	}

	public static void scrollToTheElement(String locator)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = findElement(locator);
		js.executeScript("arguments[0].scrollIntoView();",ele);
		
	}
	
	public static void scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight || document.documentElement.scrollHeight)", "");js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	protected WebElement waitForElementVisibleForCareerPage(By elementSelector) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element;

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SectionTeams")));
            return element;
        } catch (TimeoutException te) {
            return null;
        }
    }
	
	 protected boolean isPageLoaded(By selector) {
	        return waitForElementVisibleForCareerPage(selector) != null;
	    }
	 
	 public  boolean isCareersPageLoaded() {
	        return isPageLoaded(By.id("SectionTeams"));
	    }
	 
	 public static void swtchToActiveElement()
	 {
		 driver.switchTo().defaultContent();
	 }


    // waits until a list of elements is displayed and returns the list, or null
    protected List<WebElement> waitForElementsVisible(By elementSelector) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        List<WebElement> elements;

        try {
            elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementSelector));
            return elements;
        } catch (TimeoutException te) {
            return null;
        }
    }

    public static void switchToNewTab() {
        Set<String> handles = driver.getWindowHandles();
        if(handles.size() > 1) {
            try {
                String currentHandle = driver.getWindowHandle();

                for (String handle : handles) {
                    if (!handle .equals(currentHandle)) {
                        driver.close(); //otherwise, you will have the browser window still opened at the end of the test
                        driver.switchTo().window(handle);
                    }
                }
            } catch(NullPointerException exception) {
                System.out.println("Something didn't work at switching tabs.");
            }
        } else {
        	System.out.println("No new tab was opened.");
        }
    }
    
    public static void switchtToTab() {
        switchToNewTab();
    }
    
    public static void screenshot(WebDriver driver,String screenshotName)
    {

    	try 
    	{
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	 
    	File source=ts.getScreenshotAs(OutputType.FILE);
    	 
    	FileHandler.copy(source, new File("./Screenshots/"+screenshotName+".png"));
    	 
    	System.out.println("Screenshot taken");
    	} 
    	catch (Exception e)
    	{
    	 
    	System.out.println("Exception while taking screenshot "+e.getMessage());
    	} 


    }
   
    
    
   
    }

