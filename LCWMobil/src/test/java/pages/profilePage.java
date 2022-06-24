package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
public class profilePage {
    By email = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/edtEmail\")");
    By password = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/edtPassword\")");
    By Login = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/buttonLogin\")");
    By showPsw = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/text_input_end_icon\")");
    By message = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/slideDownText\")");
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    public profilePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);}
    public void writeEposta(String mail) {driver.findElement(email).sendKeys(mail);}
    public void writePassword(String psw) {
        driver.findElement(password).sendKeys(psw);
    }
    public void showPassword() {
        driver.findElement(showPsw).click();
    }
    public void clickLogin() {
        driver.findElement(Login).click();
    }
    public void checkErrorMessage() {
        elementHelper.checkElementVisible(message);
    }
    public void printmessage() {String error = driver.findElement(message).getText();System.out.println(error);}
}