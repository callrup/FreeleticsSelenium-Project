package pageObjects;

public interface OpenPositionPageObject {
	
	String jobTitle="//*[@id='SectionDetails']/section[1]/div/h1";
	String jobLocation="//*[@id='SectionDetails']/section[1]/div/p/span[2]";
	String responsibilities="//*[@id='SectionDetails']/section[2]/div/section[2]";
	String profile ="//h2[normalize-space()='Your profile']";
	String responsibility="//*[@id='SectionDetails']/section[2]/div/section[2]/header/h2";
	String roledescription="//div[contains(text(),'We are looking to expand our QA team and hire the ')]";
	String listOfResponsibility="//*[@id='SectionDetails']/section[2]/div/section[2]/ul/li";////*[@id="SectionDetails"]/section[2]/div/section[2]/ul
	String listOfProfile ="//*[@id='SectionDetails']/section[2]/div/section[3]/ul/li";
	String applyforthejob="//span[normalize-space()='Apply now']";
	

}



