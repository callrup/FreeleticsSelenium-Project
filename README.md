Project : Automated testing with Java, Selenium WebDriver and Maven ,TestNG.


Automated testing with Java, Selenium WebDriver Maven  and TestNG .Extent reporting tool has been used for reporting
This is a POM based project  with  which can be run from Command line  and locally through maven /TestNg

Prerequisites / Setup
have Java installed locally
have Maven installed locally
have ChromeDriver installed locally
For Mac users, you can use homebrew to install the prerequisites:

homebrew install maven
homebrew install chromedriver
This automatically adds them to the PATH.

For other operating systems, it is a bit more complicated: you need to install the dependencies locally and then also add their location to the PATH, and make sure it was updated.

More instructions can be found here:

https://maven.apache.org/download.cgi

https://maven.apache.org/install.html

https://chromedriver.chromium.org/downloads

Running the tests from command line
after installing all the dependencies, and cloning the project, go to the project directory in the terminal
use mvn test from command line to initialize the test.

Running locally

Right click on POM.xml and run by MVN Test

Running locally by Testng
1. Kindly make the scope as Test for TestNG 
2. Right click on Testng and run or initialize from Testrunner
 
