package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.pageObjectslocators;


public class checkerTools {
	
	pageObjectslocators pg;
			
	WebDriver driver = new ChromeDriver(); 
	//WebDriver driver = new FirefoxDriver();
	
	@Before 
    public void setup() {
				
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--window-size=1920,1200");
		WebDriver driver = WebDriverManager.chromedriver().capabilities(options).create();
		driver.manage().window().maximize();*/
		
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize(); 
        
   } 

    @After 
    public void teardown() { 
         driver.close(); 
         driver.quit(); 
    } 
    
    @Given("User launch browser to navigate to the NHS online service system")
	public void user_launch_browser_to_navigate_to_the_nhs_online_service_system() throws InterruptedException {
    	
    	pg = new pageObjectslocators(driver);
    	
		pg.launchbrowsernavigation();
		Thread.sleep(3000);
		
	}

	@When("User clicks start button to go to the questions")
	public void user_clicks_start_button_to_go_to_the_questions() throws InterruptedException {
		
		Thread.sleep(3000);
		pg.clicksstartbutton();

	}

	@And("User answers Which country do you live in?")
	public void user_answers_which_country_do_you_live_in() throws InterruptedException {
		
		Thread.sleep(3000);		
		pg.whichcountryyoulive();

	}

	@And("User answers Is your GP practice in Scotland or Wales?")
	public void user_answers_is_your_gp_practice_in_scotland_or_wales() throws InterruptedException {
		
		Thread.sleep(3000);	
		pg.isyourgppractice();
	}

	@And("User answers Which country is your dental practice in?")
	public void user_answers_which_country_is_your_dental_practice_in() throws InterruptedException {
		
		Thread.sleep(3000);
		pg.whichcountrydentalpractice();
		
	}

	@And("User answers What is your date of birth?")
	public void user_answers_what_is_your_date_of_birth() throws InterruptedException {
		
		Thread.sleep(3000);	
		pg.yourdateofbirth();

	}

	@And("User answers Do you live with a partner?")
	public void user_answers_do_you_live_with_a_partner() throws InterruptedException {
		
		Thread.sleep(3000);
		pg.doyoulivewithpartner();

	}

	@And("User answers Do you claim any benefits or tax credits?")
	public void user_answers_do_you_claim_any_benefits_or_tax_credits() throws InterruptedException {
		
		Thread.sleep(3000);
		pg.claimanybenefitsortaxcredits();

	}

	@And("User answers Are you pregnant or have you given birth in the last twelve months?")
	public void user_answers_are_you_pregnant_or_have_you_given_birth_in_the_twelve_months() throws InterruptedException {
		
		Thread.sleep(3000);
		pg.pregnantorhavegivenbirth();
		
	}

	@And("User answers Do you have an injury or illness caused by serving in the armed forces?")
	public void user_answers_do_you_have_an_injury_or_illness_caused_by_serving_in_the_armed_forces() throws InterruptedException {
		
		Thread.sleep(3000);
		pg.haveaninjuryorillness();
		
	}

	@And("User answers Do you have diabetes?")
	public void user_answers_do_you_have_diabetes() throws InterruptedException {
		
		Thread.sleep(3000);
		pg.doyouhavediabetes();

	}

	@And("User answers To check what help you can get with NHS charges, we need to know if you're affected by any of these conditions")
	public void user_answers_to_check_what_help_you_can_get_with_nhs_charges_we_need_to_know_if_you_re_affected_by_any_of_these_conditions() throws InterruptedException {
		
		Thread.sleep(3000);
		pg.checkwhathelp();
		
	}

	@And("User answers Do you or a family member have glaucoma?")
	public void user_answers_do_you_or_a_family_member_have_glaucoma() throws InterruptedException {
		
		Thread.sleep(3000);
		pg.familymemberhaveglaucoma();

	}

	@And("User answers Do you live permanently in a care home?")
	public void user_answers_do_you_live_permanently_in_a_care_home() throws InterruptedException {
		
		pg.liveinacarehome();
		Thread.sleep(3000);
	}

	@And("User answers Do you have more than sixteen thousand pounds in savings, investments or property?")
	public void user_answers_do_you_have_more_than_sixteen_thousand_pounds_in_savings_investments_or_property() throws InterruptedException {
		
		pg.investmentsorproperty();
		Thread.sleep(3000);
	}

	@Then("User sees You could get help to pay for your NHS costs options")
	public void user_sees_you_could_get_help_to_pay_for_your_nhs_costs_options() throws IOException, InterruptedException {
		
		pg.yournhscostsoptions();
		Thread.sleep(3000);
		

	}

	
	

}
