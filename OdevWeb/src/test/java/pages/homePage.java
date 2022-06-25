package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class homePage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;
    By womanTitle = By.xpath("//a[@class='menu-header-item__title'][normalize-space()='KADIN']");
    By acceptButton = By.cssSelector("#cookieseal-banner > div > button:nth-child(3)");
    By bluz = By.cssSelector(" li:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(10) > a:nth-child(1)");
    By ColourBox = By.cssSelector("input[placeholder='Renk Ara']");
    By chooseColour = By.cssSelector("img[src='http://akstatic.lcwaikiki.com/Resource/Images/icon/siyah.png']");
    By sizeBox = By.xpath("//input[@placeholder='Beden Ara']");
    By mediumSize = By.xpath("//span[normalize-space()='M']");
    By addChart = By.xpath("//a[@id='pd_add_to_cart']");
    By CartLogo = By.cssSelector("#shopping-cart");
    By cartBluz = By.cssSelector(".rd-cart-item-title");
    By sizeOfBluzOnCart = By.cssSelector("span[class='rd-cart-item-size'] strong");
    By pieceOfProductOnCart = By.cssSelector("input[value='1']");
    By LoginButton = By.xpath("//span[@class='user-wrapper']//a[1]//span[1]");
    By textEmail = By.cssSelector("input[placeholder='E-Posta Adresiniz']");
    By textPassword = By.cssSelector("input[placeholder='Şifreniz']");
    By empty = By.cssSelector(".error");
    By submitButton = By.cssSelector("button[type='submit']");
    By paymentButton = By.cssSelector(".row .col-md-12.pl-20.pr-20");
    By deliveryMethodTitle = By.cssSelector("div[class='text-left sectionTitleBottomMargin'] span[class='sectionTitle']");
    By deliveryAdress = By.cssSelector("div[class='col-md-12 sectionTitleBottomMargin'] span[class='sectionTitle']");
    By paymentMethod = By.cssSelector(".sectionTitle.text-left");
    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);}
    public void mainPage() {
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
    }
    public void clickWoman() {
        wait.until(ExpectedConditions.presenceOfElementLocated(womanTitle));
        WebElement clickable = driver.findElement(womanTitle);
        new Actions(driver)
                .clickAndHold(clickable)
                .perform();
    }

    public void clickBluz() {
        driver.findElement(bluz).click();
    }

    public void accept() {
        driver.findElement(acceptButton).click();
    }

    public void filteringColour(String siyah) {
        driver.findElement(ColourBox).sendKeys("Siyah");
        driver.findElement(chooseColour).click();

    }
    public void chooseSize() {
        wait.until(ExpectedConditions.presenceOfElementLocated(sizeBox));
        driver.findElement(sizeBox).sendKeys("M");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(mediumSize).click();}
    public void chooseProductOftheList() {
        List<WebElement> element = driver.findElements(By.cssSelector(".product-card.product-card--one-of-4"));
        element.get(1).click();
    }
    public void addToChart() {
        new Actions(driver).moveByOffset(1400, 400).click().build().perform(); //Bazı ürünlerde stok bittiğinde verilen uyarı mesajından kurtulmak için sayfada belirlenen noktaya tıklanır
        driver.findElement(addChart).click();
    }
    public void clickCartLogo() {
        driver.findElement(CartLogo).click();
    }
    public void nameOfProduct(String cart) {
        elementHelper.checkElementVisible(cartBluz);
    }
    public void sizeOfProduct(String sizeBluz) {
        elementHelper.checkElementVisible(sizeOfBluzOnCart);
    }
    public void pieceOfProduct(String pieceBluz) {
        elementHelper.checkElementVisible(pieceOfProductOnCart);
    }
    public void clickLoginButton(String button) {
        elementHelper.click(LoginButton);
    }
    public void typeEmailandPassword(String typeInfo, String typePassword) {
        elementHelper.findElement(textEmail).sendKeys("fehaces107@syswift.com");
        elementHelper.findElement(textPassword).sendKeys("Yxd3jPGxevw8.Sb");
        elementHelper.click(submitButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }}
    public void typeEmail(String type) {
        elementHelper.findElement(textEmail).sendKeys("burakikinci@lcwaikiki.com ");
        elementHelper.click(submitButton);
    }
    public void seeErrorMessage(String error) {
        elementHelper.checkElementVisible(empty);
    }
    public void typePassword(String onlyPassword) {
        elementHelper.findElement(textPassword).sendKeys("1234567890");
        elementHelper.click(submitButton);
    }
    public void seeEmptyEmail(String emptyEmailError) {elementHelper.checkElementVisible(empty);
    }
    public void clickPayment() {driver.findElement(paymentButton).click();
    }
    public void deliveryMethodText() {elementHelper.checkElementVisible(deliveryMethodTitle);
    }
    public void deliveryAdressText() {elementHelper.checkElementVisible(deliveryAdress);
    }
    public void paymentMethodText() {elementHelper.checkElementVisible(paymentMethod);
    }
}


