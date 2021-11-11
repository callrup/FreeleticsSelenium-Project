package utils;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext ;
import org.testng.ITestListener;
import org.testng.ITestResult ;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.Configuration;

import com.aventstack.extentreports.utils.FileUtil;

import base.BaseTest;



public class SuiteListener implements ITestListener ,IAnnotationTransformer{

	WebDriver driver =null;
	 @Override		
	    public void onFinish(ITestContext ITestContext) 					
	    {		
	                		
	    }		

	    @Override		
	    public void onStart(ITestContext ITestContext)					
	    {		
	            		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult ITestResult)					
	    {		
	    		
	    }		

	    // When Test case get failed, this method is called.		
	    @Override		
	    public void onTestFailure(ITestResult ITestResult) 					
	    {	
	    	String fileName =System.getProperty("user.dir") + File.separator+ "screenshots"+ File.separator	+ ITestResult.getMethod().getMethodName();
	    	 File src = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
	    	 try
	    	 {
	    		 FileHandler.copy(src, new File(fileName + ".png"));
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    	 }
	    //System.out.println("The name of the testcase failed is :"+Result.getName());					
	    }		

	    // When Test case get Skipped, this method is called.		
	    @Override		
	    public void onTestSkipped(ITestResult ITestResult)					
	    {		
	    // System.out.println("The name of the testcase Skipped is :"+Result.getName());					
	    }		

	    // When Test case get Started, this method is called.		
	    @Override		
	    public void onTestStart(ITestResult Result)					
	    {		
	    System.out.println(Result.getName()+" test case started");					
	    }		

	    // When Test case get passed, this method is called.		
	    @Override		
	    public void onTestSuccess(ITestResult Result)					
	    {		
	    System.out.println("The name of the testcase passed is :"+Result.getName());					
	    }

		@Override
		public void transform(ITestAnnotation ITestAnnotation, Class aClass, Constructor constructor, Method method) {
			// TODO Auto-generated method stub
			ITestAnnotation.setRetryAnalyzer(RetryAnalyzer.class);
			
		}		
}
