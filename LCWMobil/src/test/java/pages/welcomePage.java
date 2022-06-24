package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
public class welcomePage {
    By titleText = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvTitle\")");
    By descriptionText = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvContent\")");
    By box = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/ivTutorial\")");
    By skipButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvNext\")");
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    public welcomePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);}
    public void checkAppIcon() {elementHelper.checkElementPresence(box);}
    public void checkTitle(String title) {
        elementHelper.checkElementText(titleText,title);
    }
    public void checkTitleDescription(String desc) {
        elementHelper.checkElementText(descriptionText,desc);
    }
    public void checkButton() {
        elementHelper.checkElementPresence(skipButton);
    }
}