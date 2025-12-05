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
import pages.VideoControlPages;
import pages.WatchlistPages;
import utilities.ConfigLoader;
import utilities.CredsLoader;

public class WatchlistStepdefs {
    private static final Logger log = LoggerFactory.getLogger(scenarios.stepDefinitions.WatchlistStepdefs.class);
    private final WatchlistPages watchlistPages;
    CredsLoader credsLoader;
    ConfigLoader configLoader;
    Scenario scenario;
    private int before;
    private int after;

    public WatchlistStepdefs(TestContext context) {
        this.watchlistPages = context.watchlistPages;
        this.credsLoader = context.credsLoader;
        this.configLoader = context.configLoader;
        this.scenario = context.scenario;
    }


    @When("User tap on My List tab")
    public void userTapOnMyListTab() {
        watchlistPages.myListClick();
    }

    @And("User take Watchlist count")
    public void userTakeWatchlistCount() {
       before = watchlistPages.getWatchlistCount();
    }

    @Then("User clicks on Add to Watchlist")
    public void userClicksOnAddToWatchlist() {
       watchlistPages.watchlistClick();
    }

    @Then("User verifies Show Added to Watchlist")
    public void userVerifiesShowAddedToWatchlist() {
       after = watchlistPages.getWatchlistCount();
        Assert.assertTrue(after > before,
                "❌ Watchlist count did not increase! Before=" + before + ", After=" + after);
        System.out.println("✅ Watchlist increased from " + before + " to " + after);
    }

    @Then("User clicks on Edit Watchlist Icon")
    public void userClicksOnEditWatchlistIcon() {
    watchlistPages.clickEditWatchlist();
    }

    @And("User Deletes the first show")
    public void userDeletesTheFirstShow() {
       watchlistPages.clickDeleteShowWatchlist();
    }

    @And("user should click on save button")
    public void userShouldClickOnSaveButton() {
       watchlistPages.afterDeleteSaveWatchlist();
    }

    @Then("User verifies Show Removed from Watchlist")
    public void userVerifiesShowRemovedFromWatchlist() {
        after = watchlistPages.getWatchlistCount();

        Assert.assertEquals(before, after, "❌ Watchlist count did not decrease! Before=" + before + ", After=" + after);
        System.out.println("✅ Watchlist decreased from " + before + " to " + after);
    }
}
