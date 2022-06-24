package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;
public class homePageStep {
    pages.homePage homePage = new pages.homePage(DriverFactory.getDriver());
    @When("click Skip button")
    public void clickSkipButton() {homePage.clickSkipButton();}
    @Then("should see Home Page")
    public void shouldSeeHomePage() {homePage.checkHomePage();}
    @When("click Profile button")
    public void clickProfileButton(){homePage.clickProfileButton();}
    @When("Click Category button")
    public void clickCategoryButton() {homePage.clickCategoryButton();}
    @When("Click Filtering button")
    public void clickFilteringButton() {
        homePage.clickFilterButton();
    }
    @When("Click Size button and choose Medium then click Apply button")
    public void clickSizeButtonAndChooseMediumThenClickApplyButton() {homePage.clickSizeButton();
    }
    @When("Click Colour button and choose siyah then click Apply button")
    public void clickColourButtonAndChooseSiyahThenClickApplyButton() {homePage.chooseColourPart();}
    @When("Click List Results")
    public void clickListResults() {
        homePage.clickResults();
    }
    @When("Choose Product from list")
    public void chooseProductFromList() {
        homePage.chooseProduct();
    }
    @When("Click Woman button")
    public void clickWomanButton() {homePage.clickWoman();}
    @When("Click giyim button")
    public void clickGiyimButton() {
        homePage.clickGiyim();
    }
    @When("Click bluz button")
    public void clickBluzButton() {homePage.clickBluz();}
    @When("Choose Medium Size and add to Chart then go to Chart Page")
    public void chooseMediumSizeAndAddToChartThenGoToChartPage() {homePage.chooseMediumonChart();}
    @Then("Check Product Name and Size and Piece")
    public void checkProductNameAndSizeAndPiece() {
        homePage.checkChartPage();
    }

    @When("Click go to Payment Page")
    public void clickGoToPaymentPage() {
        homePage.clickPayment();
    }

    @Then("Check delivery method types on Payment Page")
    public void checkDeliveryMethodTypesOnPaymentPage() {
        homePage.checkDelivery();
    }
}
