package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class profilPageStep {

    pages.profilePage profilePage = new pages.profilePage(DriverFactory.getDriver());
    @When("Write for e-mail address: {string}")
    public void writeForEMailAddress(String email) {profilePage.writeEposta(email);}
    @When("Write for password : {string}")
    public void writeForPassword(String pswrd) {profilePage.writePassword(pswrd);}
    @When("Click show password button")
    public void clickShowPasswordButton() {profilePage.showPassword();}
    @When("Click Login button")
    public void clickLoginButton() {profilePage.clickLogin();}
    @Then("Check Message")
    public void checkMessage() {profilePage.checkErrorMessage();}

    @When("Print Message")
    public void printMessage() {
        profilePage.printmessage();
    }}