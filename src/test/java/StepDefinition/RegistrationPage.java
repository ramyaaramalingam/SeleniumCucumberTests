package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.RegistrationPage.visiblity_registrationheading;
import static pages.SignInPage.click_newregistration_btn;

public class RegistrationPage {
    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() {
        click_newregistration_btn();
    }

    @Then("^User should be able to view the Registration page$")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {
        String actualRegistrationPageheading = visiblity_registrationheading();
        assertEquals(actualRegistrationPageheading, "Create a New Account");
    }
}
