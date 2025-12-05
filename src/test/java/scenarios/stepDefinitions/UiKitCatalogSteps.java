package scenarios.stepDefinitions;

import context.TestContext;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.UiKitCatalogPage;
import utilities.ConfigLoader;
import utilities.CredsLoader;

public class UiKitCatalogSteps {
    UiKitCatalogPage uiKitCatalogPage;
    CredsLoader credsLoader;
    ConfigLoader configLoader;
    Scenario scenario;

    public UiKitCatalogSteps(TestContext context) {
        uiKitCatalogPage = new UiKitCatalogPage(context.driver);
        this.credsLoader = context.credsLoader;
        this.configLoader = context.configLoader;
        this.scenario = context.scenario;
    }


    @Given("User click on Alert Views menu")
    public void iClickOnAlertViewsMenu() {
        uiKitCatalogPage.clickOnAlertViews();
    }

    @When("User click on text entry option")
    public void userClickOnOkayCancelOption() {
        uiKitCatalogPage.clickOnTextEntry();
    }

    @Then("Verify Pop up is displayed or not")
    public void verifyPopUpIsDisplayedOrNot() {
        Assert.assertFalse(uiKitCatalogPage.isPopUpDisplayed(), "Text entry pop up is not displayed");
    }

    @When("User click on Cancel option")
    public void userClickOnCancelOption() {
        uiKitCatalogPage.cancelTextEntry();
    }

    @And("User click on OK option")
    public void userClickOnOKOption() {
        uiKitCatalogPage.okTextEntry();
    }

    @Given("User click on Search menu")
    public void userClickOnSearchMenu() {
        uiKitCatalogPage.clickOnSearchOption();
    }

    @When("User click on Default option")
    public void userClickOnDefaultOption() {
        uiKitCatalogPage.clickOnDefaultSearch();
    }

    @Then("Verify default option page is displayed")
    public void verifyDefaultOptionPageIsDisplayed() {
        Assert.assertTrue(uiKitCatalogPage.isDefaultPageDisplayed());
    }

    @And("User click on back to search button")
    public void userClickOnBackToSearchButton() {
        uiKitCatalogPage.clickOnSearchToGoBack();
    }

    @Then("User click on Custom option")
    public void userClickOnCustomOption() {
        uiKitCatalogPage.clickOnCustomSearch();
    }

    @And("verify custom option page is displayed")
    public void verifyCustomOptionPageIsDisplayed() {
        Assert.assertTrue(uiKitCatalogPage.isCustomPageDisplayed());
    }
}
