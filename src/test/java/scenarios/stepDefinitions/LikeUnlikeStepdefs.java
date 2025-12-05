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
import pages.LikeUnlikePages;
import pages.ShowScreenPages;
import pages.WatchlistPages;
import utilities.ConfigLoader;
import utilities.CredsLoader;


public class LikeUnlikeStepdefs {
    private static final Logger log = LoggerFactory.getLogger(scenarios.stepDefinitions.LikeUnlikeStepdefs.class);
    private final LikeUnlikePages likeUnlikePages;
    CredsLoader credsLoader;
    ConfigLoader configLoader;
    Scenario scenario;
    int scrollTimes;
    private final TestContext context;


    public LikeUnlikeStepdefs(TestContext context) {
        this.likeUnlikePages = context.likeUnlikePages;
        this.credsLoader = context.credsLoader;
        this.configLoader = context.configLoader;
        this.scenario = context.scenario;
        this.context = context;

    }



    @And("User clicks the Like Button")
    public void userClicksTheLikeButton() {
        likeUnlikePages.clickLikeButton();
    }

    @Then("Like Button should be highlighted")
    public void likeButtonShouldBeHighlighted() {

    }

    @When("User scrolls down {int} times and clicks the Like Button each time")
    public void userScrollsDownTimesAndClicksTheLikeButtonEachTime(int times) {
        scrollTimes = times; // store it
       likeUnlikePages.scrollDownAndClicksLikeButton(times);
    }

    @Then("Verify Like status is maintained when scrolling back and forth")
    public void verifyLikeStatusIsMaintainedWhenScrollingBackAndForth() {
        context.showScreen.ScrollUpNTimes(scrollTimes);
    }

    @When("User Unlikes the video")
    public void userUnlikesTheVideo() {
        likeUnlikePages.clickLikeButton();
    }

    @Then("The video is Unliked")
    public void theVideoIsUnliked() {
        Assert.assertTrue(likeUnlikePages.islikeButtonDisplayed(),"Like button is not displayed");
    }

    @Then("User clicks on share button")
    public void userClicksOnShareButton() {
        likeUnlikePages.shareButtonClick();
    }

    @Then("User should see multiple share options")
    public void userShouldSeeMultipleShareOptions() {
       Assert.assertTrue(likeUnlikePages.shareButtonVerify(),"Share button is not displayed");
    }
}
