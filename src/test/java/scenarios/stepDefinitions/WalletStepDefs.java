package scenarios.stepDefinitions;

import context.TestContext;
import io.cucumber.java.PendingException;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.BasePage;
import pages.EmailNavigatorPage;
import pages.WalletPage;
import utilities.ConfigLoader;
import utilities.CredsLoader;

public class WalletStepDefs {
    private static final Logger log = LoggerFactory.getLogger(WalletStepDefs.class);
    private final WalletPage walletPage;
    CredsLoader credsLoader;
    ConfigLoader configLoader;
    Scenario scenario;

    public WalletStepDefs(TestContext context) {
        walletPage = context.walletPage;
        this.credsLoader = context.credsLoader;
        this.configLoader = context.configLoader;
        this.scenario = context.scenario;
    }



    @When("User tap on Wallet tab")
    public void userTapOnWalletTab() {
        walletPage.ClickWalletButton();
    }

    @Then("User should be redirected to Wallet Page")
    public void userShouldBeRedirectedToWalletPage() {
        Assert.assertTrue(walletPage.YourWalletIsDisplayed(),"User is not Redirected to wallet Page");
    }

    @And("User should see the Bullet logo")
    public void userShouldSeeTheBulletLogo() {
        Assert.assertTrue(walletPage.BulletLogoIsDisplayed(),"Bullet Logo is not Visible");
    }

    @And("User should See Search Icon")
    public void userShouldSeeSearchIcon() {
        Assert.assertTrue(walletPage.SearchIconIsDisplayed(),"Search Icon is not Visible");
    }

    @And("User should See Profile Icon")
    public void userShouldSeeProfileIcon() {
        Assert.assertTrue(walletPage.ProfileIconIsDisplayed(),"Profile Icon is not Visible");
    }

    @And("User should See Current Balance")
    public void userShouldSeeCurrentBalance() {
        Assert.assertTrue(walletPage.currectBalanceIsDisplayed(),"Current Balance is not Visible");
    }

    @And("User should See Wallet ID and Copy option")
    public void userShouldSeeWalletIDAndCopyOption() {
        Assert.assertTrue(walletPage.WalletIDWithCopyButtonIsDisplayed(),"Either Wallet Id or Copy Button is not Visible");
    }

    @And("User should see the Free Coins Tab")
    public void userShouldSeeTheFreeCoinsTab() {
        Assert.assertTrue(walletPage.FreeCoinsTabIsDisplayed(),"Free Coin Tab is not Visible");
    }

    @And("User should see the Buy Coins Tab")
    public void userShouldSeeTheBuyCoinsTab() {
        Assert.assertTrue(walletPage.BuyCoinsTabIsDisplayed(),"Buy Coin Tab is not Visible");
    }

    @And("User should see the Coin History  Tab")
    public void userShouldSeeTheCoinHistoryTab() {
        Assert.assertTrue(walletPage.CoinHistoryTabIsDisplayed(),"Coin History Tab is not Visible");
    }

    @And("User should click on Buy coins")
    public void userShouldClickOnBuyCoins() {
        walletPage.buyCoinsClick();
    }

    @And("User should select the coins")
    public void userShouldSelectTheCoins() {
       walletPage.coinsSelect();
    }

    @And("User should verify that navigates to purchase gateway")
    public void userShouldVerifyThatNavigatesToPurchaseGateway() {
       Assert.assertTrue(walletPage.PaymentNavigationIsDisplayed(),"Payment Gateway is not Displayed");
    }

    @And("User should click on Coins History")
    public void userShouldClickOnCoinsHistory() {
        walletPage.coinsHistoryClick();
    }

    @And("User should verify whether landed on Coin History page")
    public void userShouldVerifyWhetherLandedOnCoinHistoryPage() {
       Assert.assertTrue(walletPage.CoinHistoryIsDisplayed(),"Coin History is not displayed");
    }

    @And("User should check the transaction history")
    public void userShouldCheckTheTransactionHistory() {
        Assert.assertTrue(walletPage.coinsUsage(),"Coins Transaction is not Displayed");
        walletPage.coinsCount();
    }

    @And("User should click on Free coins tab")
    public void userShouldClickOnFreeCoinsTab() {
       walletPage.freeCoinsTab();
    }

    @And("User should able to see Collect free coin tab")
    public void userShouldAbleToSeeCollectFreeCoinTab() {
        Assert.assertTrue(walletPage.collectFreeCoinsButtonIsDisplayed(),"Coins Transaction is not Displayed");
    }

    @And("User should click on Collect Free coin button")
    public void userShouldClickOnCollectFreeCoinButton() {
       walletPage.collectFreeCoinsButtonClick();
    }

    @And("User should see free coins checkin popup")
    public void userShouldSeeFreeCoinsCheckinPopup() {
       Assert.assertTrue(walletPage.checkInPopUpIsDisplayed(),"Free coins Check in page is not displayed");
    }

    @And("User should click on Ok button in coins checkin popup")
    public void userShouldClickOnOkButtonInCoinsCheckinPopup() {
        walletPage.coinCheckInOkayButtonClick();
    }

    @And("User should click on cancel icon in watch add popup")
    public void userShouldClickOnCancelIconInWatchAddPopup() {
        walletPage.CoinsCheckInCancelClick();
    }

    @And("User should see profile completion task")
    public void userShouldSeeProfileCompletionTask() {
        walletPage.swipeScreen();
       Assert.assertTrue(walletPage.completeProfileTaskIsDisplayed(),"Complete Profile Task is not displayed");
    }

    @And("User should see Turn On Notification task")
    public void userShouldSeeTurnOnNotificationTask() {
        walletPage.swipeScreen();
        Assert.assertTrue(walletPage.NotificationTurnOnTaskIsDisplayed(),"Turn on notification Task is not displayed");
    }

    @And("User should click go on profile completion")
    public void userShouldClickGoOnProfileCompletion() {
        walletPage.completeYourProfileClick();
    }

    @And("User should verify whether landed on Edit Profile page")
    public void userShouldVerifyWhetherLandedOnEditProfilePage() {
        Assert.assertTrue(walletPage.editProfilePageCheck(),"Edit profile page is not displayed");
    }

    @And("User should enter {} in the particular field")
    public void userShouldEnterFullNameInTheParticularField(String nameField) {
        walletPage.fullNameEntry();
        walletPage.enterName(nameField);
    }

    @And("User should select age group")
    public void userShouldSelectAgeGroup() {
       walletPage.ageGroupSelection();
    }

    @And("User should select gender and click on save button")
    public void userShouldSelectGenderAndClickOnSaveButton() {
        walletPage.genderSelectAndSave();
    }

    @And("User should see coins credit screen")
    public void userShouldSeeCoinsCreditScreen() {
        walletPage.editProfileCoinPopupScreen();
    }

    @And("User should click Go button in Turn on notification")
    public void userShouldClickGoButtonInTurnOnNotification() {
        walletPage.turnNotificationOnClick();
    }

    @And("User should see reward coins popup for turning on notification")
    public void userShouldSeeRewardCoinsPopupForTurningOnNotification() {
        Assert.assertTrue(walletPage.notificationPopupCheck(),"Notification popup is not displayed");
    }

    @And("User should click Okay button in turn on notification popup screen")
    public void userShouldClickOkayButtonInTurnOnNotificationPopupScreen() {
        walletPage.notificationClickOkay();
    }

    @And("User click on profile cancel icon")
    public void userClickOnProfileCancelIcon() throws InterruptedException {
        Thread.sleep(2000);
        walletPage.profileCancelClick();
    }
}
