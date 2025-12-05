package scenarios.stepDefinitions;

import context.TestContext;
import io.cucumber.java.PendingException;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.PaymentsAndCoinsPages;
import utilities.ConfigLoader;
import utilities.CredsLoader;

public class PaymentsAndCoinsStepDefs {
        private static final Logger log = LoggerFactory.getLogger(scenarios.stepDefinitions.PaymentsAndCoinsStepDefs.class);
        private final PaymentsAndCoinsPages paymentsAndCoinsPages;
        CredsLoader credsLoader;
        ConfigLoader configLoader;
        Scenario scenario;

        public PaymentsAndCoinsStepDefs(TestContext context) {
            this.paymentsAndCoinsPages = context.paymentsAndCoinsPages;
            this.credsLoader = context.credsLoader;
            this.configLoader = context.configLoader;
            this.scenario = context.scenario;
        }

        @Then("User should see complete tasks and earn coins")
    public void userShouldSeeCompleteTasksAndEarnCoins() {
            Assert.assertTrue(paymentsAndCoinsPages.isCompleteTasksAndEarnCoinsDisplayed(),"Complete Tasks And Earn Coin is not displayed");
    }

    @And("User should see coins present")
    public void userShouldSeeCoinsPresent() {
       Assert.assertTrue(paymentsAndCoinsPages.isCoinsPresentDisplayed(),"Coins are not displayed");
    }

    @And("User should see coin transactions")
    public void userShouldSeeCoinTransactions() {
        Assert.assertTrue(paymentsAndCoinsPages.isCoinTransactionDisplayed(),"Coin Transaction is not displayed");
    }

    @And("User should see 150 coins present")
    public void userShouldSee150CoinsPresent() {
        Assert.assertTrue(paymentsAndCoinsPages.isCoins1Displayed(),"150  coins is not displayed");
    }

    @And("User should see 300 coins present")
    public void userShouldSee300CoinsPresent() {
        Assert.assertTrue(paymentsAndCoinsPages.isCoins2Displayed(),"300  coins is not displayed");
    }

    @And("User should see 389 coins present")
    public void userShouldSee389CoinsPresent() {
        Assert.assertTrue(paymentsAndCoinsPages.isCoins3Displayed(),"389 coins is not Displayed");
    }

    @And("User should see 600+60 coins present")
    public void userShouldSee600CoinsPresent() {
        Assert.assertTrue(paymentsAndCoinsPages.isCoins4Displayed(),"600+60 coins is not Displayed");
    }

    @And("User should see 750+113 coins present")
    public void userShouldSee750CoinsPresent() {
        Assert.assertTrue(paymentsAndCoinsPages.isCoins5Displayed(),"750+113 coins is not Displayed");
    }

    @And("User should see 1060+265 coins present")
    public void userShouldSee1060CoinsPresent() {
        Assert.assertTrue(paymentsAndCoinsPages.isCoin6Displayed(),"1060+265 coins is not Displayed");
    }

    @And("User should see 1515+530 coins present")
    public void userShouldSee1515CoinsPresent() {
        Assert.assertTrue(paymentsAndCoinsPages.isCoin7Displayed(),"1515+530 coins is not Displayed");
    }

    @And("User should see 2999+1500 coins present")
    public void userShouldSee2999CoinsPresent() {
        Assert.assertTrue(paymentsAndCoinsPages.isCoin8Displayed(),"2999+1500 coins is not Displayed");
    }

    @And("User should see 5999+3600 coins present")
    public void userShouldSee5999CoinsPresent() {
        Assert.assertTrue(paymentsAndCoinsPages.isCoin9Displayed(),"5999+3600 coins is not Displayed");
    }

    @And("User should see 8888+6666 coins present")
    public void userShouldSee8888CoinsPresent() {
       Assert.assertTrue(paymentsAndCoinsPages.isCoin10Displayed(),"8888+6666 coins is not displayed");
    }

    @Then("User should verify correct package details is displayed")
    public void userShouldVerifyCorrectPackageDetailsIsDisplayed() {
        Assert.assertTrue(paymentsAndCoinsPages.isCorrectPackageDisplayed(),"Correct package is not displayed");
    }

    @Then("User should click 300 coins payment")
    public void userShouldClick300CoinsPayment() {
        paymentsAndCoinsPages.click300Coins();
    }

    @Then("User should click 389 coins payment")
    public void userShouldClick389CoinsPayment() {
        paymentsAndCoinsPages.click389Coins();
    }

    @Then("User should click 600 coins payment")
    public void userShouldClick600CoinsPayment() {
        paymentsAndCoinsPages.click600Coins();
    }

    @Then("User should click 750 coins payment")
    public void userShouldClick750CoinsPayment() {
            paymentsAndCoinsPages.click750Coins();
    }

    @Then("User should click 1060 coins payment")
    public void userShouldClick1060CoinsPayment() {
        paymentsAndCoinsPages.click1060Coins();
    }

    @Then("User should click 1515 coins payment")
    public void userShouldClick1515CoinsPayment() {
       paymentsAndCoinsPages.click1515Coins();
    }

    @Then("User should click 2999 coins payment")
    public void userShouldClick2999CoinsPayment() {
        paymentsAndCoinsPages.click2999Coins();
    }

    @Then("User should click 5999 coins payment")
    public void userShouldClick5999CoinsPayment() {
       paymentsAndCoinsPages.click5999Coins();
    }

    @Then("User should click 8888 coins payment")
    public void userShouldClick8888CoinsPayment() {
        paymentsAndCoinsPages.click8888Coins();
    }
}
