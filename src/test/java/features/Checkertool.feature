Feature: Check what help you could get to pay for NHS costs
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
	@test
  Scenario: User read information on the webpage to begin nhs online service
    Given User launch browser to navigate to the NHS online service system
    When User clicks start button to go to the questions
    And User answers Which country do you live in?
    And User answers Is your GP practice in Scotland or Wales?
    And User answers Which country is your dental practice in?
    And User answers What is your date of birth?
    And User answers Do you live with a partner?
    And User answers Do you claim any benefits or tax credits?
    And User answers Are you pregnant or have you given birth in the last twelve months?
    And User answers Do you have an injury or illness caused by serving in the armed forces?
    And User answers Do you have diabetes?
    And User answers To check what help you can get with NHS charges, we need to know if you're affected by any of these conditions
    And User answers Do you or a family member have glaucoma?
    And User answers Do you live permanently in a care home?
    And User answers Do you have more than sixteen thousand pounds in savings, investments or property?
    Then User sees You could get help to pay for your NHS costs options
