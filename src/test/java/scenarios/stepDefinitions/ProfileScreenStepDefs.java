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
import pages.ProfileScreenPages;
import pages.ShowScreenPages;
import utilities.ConfigLoader;
import utilities.CredsLoader;

public class ProfileScreenStepDefs {
    private static final Logger log = LoggerFactory.getLogger(ProfileScreenStepDefs.class);
    private final ProfileScreenPages profileScreenPages;
    CredsLoader credsLoader;
    ConfigLoader configLoader;
    Scenario scenario;

    public ProfileScreenStepDefs(TestContext context) {
        this.profileScreenPages = context.profileScreenPages;
        this.credsLoader = context.credsLoader;
        this.configLoader = context.configLoader;
        this.scenario = context.scenario;
    }

    @And("User should See User Name with ID")
    public void userShouldSeeUserNameWithID() {
        Assert.assertTrue(profileScreenPages.isNameandIDDisplayed(),"Name and Id is not Displayed");
    }

    @And("User should See Profile Picture")
    public void userShouldSeeProfilePicture() {
        Assert.assertTrue(profileScreenPages.isProfilePhotoDisplayed(),"Profile Photo is not displayed");
    }

    @And("User should See Edit option")
    public void userShouldSeeEditOption() {
        Assert.assertTrue(profileScreenPages.isEditIconDisplayed(),"Edit icon is not displayed");
    }

    @And("User should See Wallet info")
    public void userShouldSeeWalletInfo() {
        Assert.assertTrue(profileScreenPages.isWalletInfoDisplayed(),"Wallet Info is not displayed");
    }

    @And("User should see the Earn rewards Tab")
    public void userShouldSeeTheEarnRewardsTab() {
        Assert.assertTrue(profileScreenPages.isEarnRewardTabDisplayed(),"Earn reward Tab is not displayed");
    }

    @And("User should see the My watchlist Tab")
    public void userShouldSeeTheMyWatchlistTab() {
        Assert.assertTrue(profileScreenPages.isMyWatchlistDisplayed(),"My watchlist Tab is not displayed");
    }

    @And("User should see the App settings Tab")
    public void userShouldSeeTheAppSettingsTab() {
        Assert.assertTrue(profileScreenPages.isAppSettingsDisplayed(),"App Setting Tab is not displayed");
    }

    @And("User should see the Language Preference tab")
    public void userShouldSeeTheLanguagePreferenceTab() {
        Assert.assertTrue(profileScreenPages.isLanguagePreferencesDisplayed(),"Language Preference Tab is not displayed");
    }

    @And("User should see the Help centre Tab")
    public void userShouldSeeTheHelpCentreTab() {
        Assert.assertTrue(profileScreenPages.isHelpCentreDisplayed(),"Help Centre Tab is not displayed");
    }

    @And("User should see the Log out Tab")
    public void userShouldSeeTheLogOutTab() {
        Assert.assertTrue(profileScreenPages.isLogoutDisplayed(),"Logout Tab is not displayed");
    }

    @Then("User should See  Made in India text, T&C link and App version")
    public void userShouldSeeMadeInIndiaTextTCLinkAndAppVersion() {
        Assert.assertTrue(profileScreenPages.isTermsAndConditionsDisplayed(),"Terms and conditions is not displayed");
    }

    @Then("User clicks on edit option")
    public void userClicksOnEditOption() {
        profileScreenPages.clickEditIcon();
    }

    @Then("User Clicks on App settings Tab")
    public void userClicksOnAppSettingsTab() {
      profileScreenPages.appSettingClick();
    }

    @And("User should see Deactivate account Option")
    public void userShouldSeeDeactivateAccountOption() {
        Assert.assertTrue(profileScreenPages.isDeactivateAccountDisplayed(),"Deactivate Account is not displayed");
    }

    @Then("User clicks on Deactivate Account")
    public void userClicksOnDeactivateAccount() {
     profileScreenPages.deactivateAccountClick();
    }

    @And("User should See Confirmation Popup with Yes No Buttons")
    public void userShouldSeeConfirmationPopupWithYesNoButtons() {
        Assert.assertTrue(profileScreenPages.isDeactivatePopupDisplayed(),"Deactivate popup is not displayed");
    }


}
