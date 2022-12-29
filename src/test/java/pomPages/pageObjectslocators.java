package pomPages;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class pageObjectslocators {
	
	WebDriver driver = null;
	
	By btn_cookie_home = By.id("nhsuk-cookie-banner__link_accept_analytics");
	By btn_click_next = By.xpath("//input[@id='next-button']");
	By btn_start_question = By.xpath("//input[@id='next-button']");
	By rdo_country_question = By.xpath("//input[@id='radio-england']");
	
	public pageObjectslocators(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void launchbrowsernavigation() {
		
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.findElement(btn_cookie_home).click();
		System.out.println(">>User launch browser to navigate to the NHS online service system<<");
	}
	
	public void clicksstartbutton() {
		
	    driver.findElement(By.xpath("//input[@id='next-button']")).click();
		System.out.println(">>User clicks start button to go to the questions<<");
		
	}
	
	public void whichcountryyoulive() {
		
		driver.findElement(By.xpath("//input[@id='radio-england']")).click();
		driver.findElement(By.xpath("//input[@id='next-button']")).click();
		System.out.println(">>User answers Which country do you live in?<<");
		
	}
	
	public void isyourgppractice() {
		
		driver.findElement(By.xpath("//input[@id='radio-no']")).click();
		driver.findElement(By.xpath("//input[@id='next-button']")).click();	
		System.out.println(">>User answers Is your GP practice in Scotland or Wales?<<");
		
	}
	
	public void whichcountrydentalpractice() {
		
		driver.findElement(By.xpath("//input[@id='radio-england']")).click();
		driver.findElement(By.xpath("//input[@id='next-button']")).click();
		System.out.println(">>User answers Which country is your dental practice in?<<");
		
	}
	
	public void yourdateofbirth() {
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//input[@id='dob-day']")).click();
		driver.findElement(By.xpath("//input[@id='dob-day']")).sendKeys("01");
	    driver.findElement(By.xpath("//input[@id='dob-month']")).click();
	    driver.findElement(By.xpath("//input[@id='dob-month']")).sendKeys("01");
	    driver.findElement(By.xpath("//input[@id='dob-year']")).click();
	    driver.findElement(By.xpath("//input[@id='dob-year']")).sendKeys("1980");
	    driver.findElement(By.xpath("//input[@id='next-button']")).click();
		System.out.println(">>User answers What is your date of birth?<<");
		
	}
	
	public void doyoulivewithpartner() {
		
		driver.findElement(By.xpath("//input[@id='radio-no']")).click();
		driver.findElement(By.xpath("//input[@id='next-button']")).click();
		System.out.println(">>User answers Do you live with a partner?<<");
		
	}
	
	public void claimanybenefitsortaxcredits() {
		
		driver.findElement(By.xpath("//input[@id='radio-no']")).click();		
		driver.findElement(By.xpath("//input[@id='next-button']")).click();		
		System.out.println(">>User answers Do you claim any benefits or tax credits?<<");
		
	}
	
	public void pregnantorhavegivenbirth() {
		
		driver.findElement(By.xpath("//input[@id='radio-no']")).click();
		driver.findElement(By.xpath("//input[@id='next-button']")).click();
		System.out.println(">>User answers Are you pregnant or have you given birth in the last twelve months?<<");
		
	}
	
	public void haveaninjuryorillness() {
		
		driver.findElement(By.xpath("//input[@id='radio-no']")).click();
		driver.findElement(By.xpath("//input[@id='next-button']")).click();
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(">>User answers Do you have an injury or illness caused by serving in the armed forces?<<");

	}
	
	public void doyouhavediabetes() {
		
		driver.findElement(By.xpath("//input[@id='radio-no']")).click();
		driver.findElement(By.xpath("//input[@id='next-button']")).click();
		System.out.println(">>User answers Do you have diabetes?<<");
	}
	
	public void checkwhathelp() {
		
		driver.findElement(By.xpath("//input[@id='radio-no']")).click();
		driver.findElement(By.xpath("//input[@id='next-button']")).click();
		System.out.println(">>User answers To check what help you can get with NHS charges, we need to know if you're affected by any of these conditions<<");

	}
	
	public void familymemberhaveglaucoma() {
		
		driver.findElement(By.xpath("//input[@id='radio-no']")).click();
		driver.findElement(By.xpath("//input[@id='next-button']")).click();
		System.out.println(">>User answers Do you or a family member have glaucoma?<<");
		
	}
	
	public void liveinacarehome() {
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//input[@id='radio-no']")).click();
		driver.findElement(By.xpath("//input[@id='next-button']")).click();
		System.out.println(">>User answers Do you live permanently in a care home?<<");
		
	}
	
	public void investmentsorproperty() {
		
		driver.findElement(By.xpath("//input[@id='radio-no']")).click();
		driver.findElement(By.xpath("//input[@id='next-button']")).click();
		System.out.println(">>User answers Do you have more than sixteen thousand pounds in savings, investments or property?<<");
		
	}
	
	public void yournhscostsoptions() throws IOException {
		
		Screenshot screenshot = new AShot().takeScreenshot(driver);
		
		screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

		ImageIO.write(screenshot.getImage(), "jpg", new File("target\\ElementScreenshot.jpg"));
		
		System.out.println(">>User sees You could get help to pay for your NHS costs options<<");
		
	}

}
