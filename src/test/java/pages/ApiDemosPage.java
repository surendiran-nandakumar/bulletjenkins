package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ApiDemosPage extends BasePage {

    @AndroidFindBy(accessibility = "Accessibility")
    private WebElement accessibilityOption;

    @AndroidFindBy(accessibility = "Preference")
    private WebElement preferenceOption;

    @AndroidFindBy(accessibility = "3. Preference dependencies")
    private WebElement preferenceDependenciesOption;

    @AndroidFindBy(id = "android:id/checkbox")
    private WebElement wifiCheckBox;

    public ApiDemosPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickOnAccessibility() {
        click(accessibilityOption);
    }

    public void clickOnPreference() {
        click(preferenceOption);
    }

    public void clickOnPreferenceDependencies() {
        click(preferenceDependenciesOption);
    }

    public void selectWifiCheckbox() {
        click(wifiCheckBox);
    }

    public boolean isWifiEnabled() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String isChecked = wifiCheckBox.getAttribute("checked");
        if(isChecked.equalsIgnoreCase("true")){
            return true;
        }
        return false;
    }
}
