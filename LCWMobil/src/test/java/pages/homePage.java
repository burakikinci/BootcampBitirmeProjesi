package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import java.util.List;
public class homePage {
    By skipButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvNext\")");
    By welcomeText = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/txtWelcomeHeader\")");
    By profileButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Profil\")");
    By categoryButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By filterButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/filter_product\")");
    By applyButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/subFilterButton\")");
    By searchBox = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/searchFilterEditText\")");
    By chooseBlack = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/checked_color_text\")");
    By resultButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/buttonFilter\")");
    By womanCategoryButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kadın\")");
    By bluzButton = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textMatches(\"Bluz\").instance(0))");
    By addToChartButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/basket\")\n");
    By chartButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/notificationsBadgeTextView\")");
    By productName = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/itemBasketTitleText\")");
    By productSize = MobileBy.AndroidUIAutomator("new UiSelector().text(\"M\")");
    By productPiece = MobileBy.AndroidUIAutomator("new UiSelector().text(\"1\")");
    By paymentButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tv_go_checkout\")");
    By deliveryTypeTitle = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Teslimat Türü\")");
    By deliveryToHome = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Adrese Teslimat\")");
    By deliveryToShop = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Mağazadan Dene Al\")");
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    public homePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);}
    public void clickSkipButton() {
        driver.findElement(skipButton).click();
    }
    public void checkHomePage() {
        elementHelper.checkElementPresence(welcomeText);
    }
    public void clickProfileButton() {
        driver.findElement(profileButton).click();
    }
    public void clickCategoryButton() {
        driver.findElement(categoryButton).click();
    }
    public void clickWoman() {driver.findElement(womanCategoryButton);}
    public void clickGiyim() {
        List<WebElement> element = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/categoryText\")"));
        element.get(2).click();}
    public void clickBluz() {driver.findElement(bluzButton).click();}


    public void clickFilterButton() {
        driver.findElement(filterButton).click();
    }
    public void clickSizeButton() {
        List<WebElement> elementSize = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/itemFilterText\")"));
        elementSize.get(0).click();
        List<WebElement> elementSizePage = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/onSaleOnlyFilterLayout\")"));
        elementSizePage.get(10).click();
        driver.findElement(applyButton).click();}
    // Bazı ürünlerde M beden olmadığın burada sadece "M" Beden için filtreleme yapıldı.
    public void chooseColourPart() {
        List<WebElement> element = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/itemFilterText\")"));
        element.get(1).click();
        driver.findElement(searchBox).sendKeys("Siyah");
        driver.findElement(chooseBlack).click();
        driver.findElement(applyButton).click();}
    public void clickResults() {
        driver.findElement(resultButton).click();
    }
    public void chooseProduct() {
        List<WebElement> element = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/productImageView\")"));
        element.get(1).click();}

    public void chooseMediumonChart() {driver.findElement(addToChartButton).click();driver.findElement(productSize).click();driver.findElement(addToChartButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);}
        driver.navigate().back();
        driver.findElement(chartButton).click();}
    public void checkChartPage() {elementHelper.checkElementVisible(productName);elementHelper.checkElementVisible(productSize);elementHelper.checkElementVisible(productPiece);}
    public void clickPayment() {driver.findElement(paymentButton).click();}
    public void checkDelivery() {elementHelper.checkElementVisible(deliveryTypeTitle);elementHelper.checkElementVisible(deliveryToHome);elementHelper.checkElementVisible(deliveryToShop);}
}
