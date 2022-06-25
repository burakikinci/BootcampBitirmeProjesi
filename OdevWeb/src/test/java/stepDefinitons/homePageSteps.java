package stepDefinitons;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.homePage;
import util.DriverFactory;
public class homePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    homePage homePage = new homePage(driver);
    @Given("User is on Home Page")
    public void userIsOnHomePage() {
        homePage.mainPage();}
    @When("click woman category")
    public void clickWomanCategory() {
        homePage.clickWoman();}
    @When("click bluz category")
    public void clickBluzCategory() {
        homePage.clickBluz();}
    @When("accept cookie")
    public void acceptCookie() {
        homePage.accept();
    }
    @When("write {string} for filtering")
    public void writeForFiltering(String siyah) {
        homePage.filteringColour(siyah);}
    @When("choose size for products")
    public void chooseSizeForProducts() {
        homePage.chooseSize();}
    @When("choose product of the list")
    public void chooseProductOfTheList() {
        homePage.chooseProductOftheList();}
    @When("add to cart")
    public void addToCart() {
        homePage.addToChart();}
    @When("go to the cartpage")
    public void goToTheCartpage() {
        homePage.clickCartLogo();}
    @Then("should see name of {string}")
    public void shouldSeeNameOf(String name) {
        homePage.nameOfProduct(name);}
    @Then("should see size of {string}")
    public void shouldSeeSizeOf(String size) {
        homePage.sizeOfProduct(size);
    }
    @Then("should see piece of {string}")
    public void shouldSeePieceOf(String piece) {
        homePage.pieceOfProduct(piece);}
    @When("click {string} button")
    public void clickButton(String LoginButton) {
        homePage.clickLoginButton(LoginButton);}
    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String typeInfo, String Password) {
        homePage.typeEmailandPassword(typeInfo,Password);}
    @When("type Email {string} and click login")
    public void typeEmailAndClickLogin(String onlyEmail) {
        homePage.typeEmail(onlyEmail);}
    @Then("should see {string} Password False message")
    public void shouldSeePasswordFalseMessage(String errorEmail) {
        homePage.seeErrorMessage(errorEmail);
    }
    @When("type {string} and click login")
    public void typeAndClickLogin(String onlyPassword) {
        homePage.typePassword(onlyPassword);
    }
    @Then("should see {string} Email Empty message")
    public void shouldSeeEmailEmptyMessage(String emptyEmailError) {
        homePage.seeEmptyEmail(emptyEmailError);
    }
    @When("click go to payment page")
    public void clickGoToPaymentPage() {
        homePage.clickPayment();}
    @Then("should see delivery method text")
    public void shouldSeeDeliveryMethodText() {
        homePage.deliveryMethodText();}
    @Then("should see delivery adress text")
    public void shouldSeeDeliveryAdressText() {
        homePage.deliveryAdressText();}
    @Then("should see payment method text")
    public void shouldSeePaymentMethodText() {
        homePage.paymentMethodText();}}
