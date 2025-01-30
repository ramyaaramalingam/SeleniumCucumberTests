package StepDefinition;

import io.cucumber.java.en.When;

import static pages.SignInPage.*;

public class SignInPage {
    @When("^User successfully enters the log in details$")
    public void user_login_to_the_login_page() {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }

}
