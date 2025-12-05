package scenarios.stepDefinitions;

import context.TestContext;
import io.cucumber.java.PendingException;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.EpisodeAccessPages;
import pages.ShowScreenPages;
import utilities.ConfigLoader;
import utilities.CredsLoader;

public class EpisodeAccessStepDefs {
    private static final Logger log = LoggerFactory.getLogger(EpisodeAccessStepDefs.class);
    private final EpisodeAccessPages episodeAccessPages;
    CredsLoader credsLoader;
    ConfigLoader configLoader;
    Scenario scenario;

    public EpisodeAccessStepDefs(TestContext context) {
        this.episodeAccessPages = context.episodeAccessPages;
        this.credsLoader = context.credsLoader;
        this.configLoader = context.configLoader;
        this.scenario = context.scenario;
    }

    @Then("User should see unlock this video popup")
    public void userShouldSeeUnlockThisVideoPopup() {
        Assert.assertTrue(episodeAccessPages.isUnlockVideoPopupDisplayed(),"Unlock this video popup is not displayed");
    }

    @Then("User should see refill wallet and unlock button")
    public void userShouldSeeRefillWalletAndUnlockButton() {
        Assert.assertTrue(episodeAccessPages.isRefillWalletUnlockButtonDisplayed(),"Refill Wallet button is not displayed");
    }

    @Then("User should see watch ad & unlock for free")
    public void userShouldSeeWatchAdUnlockForFree() {
        Assert.assertTrue(episodeAccessPages.isWatchAddButtonDisplayed(),"Watch ad button is not displayed");
    }

    @Then("User should click on locked episode")
    public void userShouldClickOnLockedEpisode() {
        episodeAccessPages.lockedEpisode();
    }

    @Then("User should click on refill wallet and unlock button")
    public void userShouldClickOnRefillWalletAndUnlockButton() {
       episodeAccessPages.clickRefillWallet();
    }

    @Then("User should see refill coins popup screen")
    public void userShouldSeeRefillCoinsPopupScreen() {
       Assert.assertTrue(episodeAccessPages.isRefillCoinScreenDisplayed(),"Refill coins screen is not displayed");
    }

    @Then("User should click any coins payment")
    public void userShouldClickAnyCoinsPayment() {
        episodeAccessPages.clickOnCoins();
    }

    @Then("User should see payment gateway screen")
    public void userShouldSeePaymentGatewayScreen() {
        Assert.assertTrue(episodeAccessPages.isPaymentGatewayDisplayed(),"Payment gateway is not displayed");
    }

    @Then("User should click on Buy button")
    public void userShouldClickOnBuyButton() {
       episodeAccessPages.buyCoinsButton();
    }

    @Then("User should check the video is resumed post payment")
    public void userShouldCheckTheVideoIsResumedPostPayment() {
        episodeAccessPages.clickOnBulletIcon();
    }

    @Then("User should select card status")
    public void userShouldSelectCardStatus() {
        episodeAccessPages.paymentTestCardSelect();
    }

    @Then("User should select the card status as Test card always approves")
    public void userShouldSelectTheCardStatusAsTestCardAlwaysApproves() {
        episodeAccessPages.testCardAlwaysApprove();
    }

    @And("User should check that coin is deducted for already watched episode")
    public void userShouldCheckThatCoinIsDeductedForAlreadyWatchedEpisode() {
        episodeAccessPages.coinsTransactionShouldBeDeductedForEpisodeUnlocked();
    }

    @Then("User should select the card status as Test card always declines")
    public void userShouldSelectTheCardStatusAsTestCardAlwaysDeclines() {
       episodeAccessPages.testCardAlwaysDecline();
    }

    @Then("User should see Error popup")
    public void userShouldSeeErrorPopup() {
    Assert.assertTrue(episodeAccessPages.paymentDeclineError(),"Error screen is not displayed");
    }

    @Then("User should click on Got it button")
    public void userShouldClickOnGotItButton() {
        episodeAccessPages.paymentFailedErrorGotItButtonClick();
    }

    @Then("User should tap over the screen so the popup will disappear")
    public void userShouldTapOverTheScreenSoThePopupWillDisappear() throws InterruptedException {
        episodeAccessPages.tapOutsidePopup();
    }

    @Then("User should select the card status as {string}")
    public void userShouldSelectTheCardStatusAs(String status) {
        episodeAccessPages.selectTestCard(status);
    }

    @And("User should see the pause button")
    public void userShouldSeeThePauseButton() throws InterruptedException {
        Assert.assertTrue(episodeAccessPages.isPauseButtonVisible(),"Pause button is not visible");
    }

    @Then("User should click on watch ad & unlock for free")
    public void userShouldClickOnWatchAdUnlockForFree() {
       episodeAccessPages.clickOnWatchAdButton();
    }

    @Then("User should verify that ad is running")
    public void userShouldVerifyThatAdIsRunning() {
        Assert.assertTrue(episodeAccessPages.isAdDisplayed(),"Ad is not displayed");
    }

    @And("User should see the play button")
    public void userShouldSeeThePlayButton() throws InterruptedException {
        Assert.assertTrue(episodeAccessPages.isPlayButtonVisible(),"Play button is not visible");
    }
}
