package scenarios.stepDefinitions;

import context.TestContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.PendingException;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.EpisodeAccessPages;
import pages.ShowScreenPages;
import pages.VideoControlPages;
import utilities.ConfigLoader;
import utilities.CredsLoader;

public class VideoControlStepDefs {
        private static final Logger log = LoggerFactory.getLogger(scenarios.stepDefinitions.VideoControlStepDefs.class);
        private final VideoControlPages videoControlPages;
        CredsLoader credsLoader;
        ConfigLoader configLoader;
        Scenario scenario;
        private AppiumDriver driver;

        public VideoControlStepDefs(TestContext context) {
            this.videoControlPages = context.videoControlPages;
            this.credsLoader = context.credsLoader;
            this.configLoader = context.configLoader;
            this.scenario = context.scenario;
            this.driver = context.driver;
        }


        @Then("User should see pause Icon")
         public void userShouldSeePauseIcon() {
            Assert.assertTrue(videoControlPages.isPlaybackIconDisplayed(),"Pause icon is not displayed");
        }

    @And("User clicks on pause Icon")
    public void userClicksOnPauseIcon() {
        videoControlPages.playbackPauseIcon();
    }

    @Then("Video Playback should be paused")
    public void videoPlaybackShouldBePaused() {
        Assert.assertTrue(videoControlPages.isPlaybackPlayIcon(),"Play icon is not displayed");
    }

    @Then("User clicks on Play Icon")
    public void userClicksOnPlayIcon() {
//       videoControlPages.tapOnVideo();
        videoControlPages.playbackPlayIcon();
    }

    @Then("Verify Video Playback resumed from where it is paused")
    public void verifyVideoPlaybackResumedFromWhereItIsPaused() {
        Assert.assertTrue(videoControlPages.isPlaybackIconDisplayed(),"Pause icon is not displayed");
    }

    @Then("playback audio should be muted")
    public void playbackAudioShouldBeMuted() {
        Assert.assertTrue(videoControlPages.isPlaybackAudioMuted(),"Playback audio is not muted");
    }

    @And("User Clicks on Unmute Icon")
    public void userClicksOnUnmuteIcon() {
            videoControlPages.clickUnmuteIcon();
    }

    @Then("playback audio should be Unmuted")
    public void playbackAudioShouldBeUnmuted() {
        Assert.assertTrue(videoControlPages.isPlaybackAudioMuted(),"Playback audio is muted");
    }

    @Then("User verifies video playback works without errors")
    public void userVerifiesVideoPlaybackWorksWithoutErrors() {
        Assert.assertTrue(videoControlPages.isPlaybackIconDisplayed(),"Pause icon is not displayed");
    }

    @And("User should see Settings button")
    public void userShouldSeeSettingsButton() {
    Assert.assertTrue(videoControlPages.isSettingsButtonDisplayed(),"Setting button is not displayed");
    }

    @And("User Clicks settings button")
    public void userClicksSettingsButton() {
       videoControlPages.settingButton(90);
    }

    @And("User should see Report video option")
    public void userShouldSeeReportVideoOption() {
       Assert.assertTrue(videoControlPages.isReportVideoDisplayed(),"Report Video is not displayed");
    }

    @Then("User clicks Report video option")
    public void userClicksReportVideoOption() {
        videoControlPages.reportVideo();
    }

    @And("User See the reasons listed")
    public void userSeeTheReasonsListed() {
        Assert.assertTrue(videoControlPages.isReportReasonsSeen(),"Reason is not displayed");
    }

    @Then("User Selects the Reason")
    public void userSelectsTheReason() {
            videoControlPages.reportReasonClick();
    }

    @Then("user clicks the submit button")
    public void userClicksTheSubmitButton() {
        videoControlPages.submitButtonClick();
    }

    @And("User should see the Bullet Watermark")
    public void userShouldSeeTheBulletWatermark() {
        Assert.assertTrue(videoControlPages.isBulletWatermarkDisplayed(),"Bullet Watermark is not displayed");
    }

    @And("User should verify that video is playing in the background")
    public void userShouldVerifyThatVideoIsPlayingInTheBackground() {
        VideoControlPages.isVideoPlayingInBackground((AndroidDriver) driver,5);
    }
}
