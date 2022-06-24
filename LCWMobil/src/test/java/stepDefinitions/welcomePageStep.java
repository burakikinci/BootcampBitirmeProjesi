package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;
public class welcomePageStep {
    pages.welcomePage welcomePage = new pages.welcomePage(DriverFactory.getDriver());
    @Given("burak is opened LcWaikiki App")
    public void burakIsOpenedLcWaikikiApp() {welcomePage.checkAppIcon();}
    @Then("should see {string} title")
    public void shouldSeeTitle(String title) {
        welcomePage.checkTitle(title);
    }
    @Then("should see {string}  description")
    public void shouldSeeDescription(String des) {
        welcomePage.checkTitleDescription(des);
    }
    @When("should see skip button")
    public void shouldSeeSkipButton() {
        welcomePage.checkButton();
    }}