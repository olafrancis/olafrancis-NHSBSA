## Description

Test Technical Exercise

Check what help you could get to pay for NHS costs
  Although most NHS treatment is free, there is usually a charge for:
  NHS prescriptions
  	NHS dental check-ups and treatment
  		Sight tests
  			New glasses or contact lenses
  				Repairing or replacing glasses or contact lenses
  					NHS wigs
  						NHS fabric supports – things like surgical bras, support tights and spinal supports
  							Travel for NHS treatment
  								You could be entitled to help with these costs depending on your circumstances

## Environment

Linux / Mac / Windows
Dependecy
nodeJS
npm

### Tools used - Required Plugins To Run the test in Eclipse IDE or Visual Studio Code IDE

- "Selenium WebDriver": "^4.7.2", (https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.7.2)
- "Ashot": "^1.5.4", (https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot)
- "cucumber-reporting": "^5.7.4", (https://mvnrepository.com/artifact/net.masterthought/cucumber-reporting)
- "webdrivermanager": "^5.7.4", (https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)
- "junit": "^4.13.2", (https://mvnrepository.com/artifact/junit/junit)
- "cucumber-junit": "^7.10.1", (https://mvnrepository.com/artifact/io.cucumber/cucumber-junit)
- "cucumber-java": "^7.10.1", (https://mvnrepository.com/artifact/io.cucumber/cucumber-java)

#### Testing Approach used

BDD is Behavior Driven Development - creating an executable specification that fails because the feature 
doesn't exist, then writing the simplest code that can make the spec pass.

Test Tag - @test
Test Data Driven - for NHS prescriptions, NHS dental check-ups and treatment, Sight tests, New glasses or contact lenses,
				   Repairing or replacing glasses or contact lenses,
				   NHS wigs, NHS fabric supports – things like surgical bras, 
				   support tights and spinal supports, Travel for NHS treatment
Automation

##### Reusability and any methods implemented.

Page Object Model - pomObjectLocators

#######
Issues found with the test - Firefox intermit error is displayed.
			Accessibility  - country page - tab did not select option B to D. 	

##### How To Install from Repository

Clone/Pull the branch - 
Goto the project root folder (i.e. olafrancis-NHSBSA)
run the command git command

##### Running Tests in windows commandline or visual studio code terminal

* mvn

- *"test": Test to run only the AutoFileImporter,
- *"verify": Command to generate all the reports

#### Running Tests on different browsers

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless", "--window-size=1920,1200");
	WebDriver driver = WebDriverManager.chromedriver().capabilities(options).create();
	driver.manage().window().maximize();
	
	//WebDriverManager.chromedriver().setup();
	FirefoxOptions options=new FirefoxOptions();
	options.setHeadless(true);

#### Install Instructions (Mac)

* Install Java 8 (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Install nodejs using brew (brew install node)
* Download Eclipse IDE or Visual Studio Code with java essential packs. 
* Set path variables in ~/.bash_profile
  * export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_*.jdk/Contents/Home
  * export PATH=$PATH:$JAVA_HOME/bin
  * export MAVEN_HOME=/usr/local/Cellar/nodejs/14.*

#### Install Instructions (Windows)

* Install Java 8 SDK (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Install maven v3.8.6 (https://nodejs.org/dist/v14.9.0/)
* Download Eclipse IDE or Visual Studio Code with java essential packs.
* Set up environment variables
    * create a JAVA_HOME user variable with the path of java installation direction
    * create a MAVEN_HOME user variable with the path of nodejs installation direction
    * Append environment variable PATH with %JAVA_HOME%\bin;%MAVEN_HOME%\bin