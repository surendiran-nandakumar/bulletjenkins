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
import pages.SearchPages;
import pages.ShowScreenPages;
import utilities.ConfigLoader;
import utilities.CredsLoader;

public class SearchStepDefs {
    private static final Logger log = LoggerFactory.getLogger(SearchStepDefs.class);
    private final SearchPages searchPages;
    CredsLoader credsLoader;
    ConfigLoader configLoader;
    Scenario scenario;

    public SearchStepDefs(TestContext context) {
        this.searchPages = context.searchPages;
        this.credsLoader = context.credsLoader;
        this.configLoader = context.configLoader;
        this.scenario = context.scenario;

    }

    @And("User should see Search Bar")
    public void userShouldSeeSearchBar() {
        Assert.assertTrue(searchPages.isSearchBarDisplayed(),"Search Bar is not displayed");
    }

    @And("User clicks on Search Bar")
    public void userClicksOnSearchBar() {
        searchPages.searchBarClick();
    }

    @Then("User should see Explore inside Search Bar")
    public void userShouldSeeExploreInsideSearchBar() {
        Assert.assertTrue(searchPages.isSearchBarDisplayed(),"Explore is not displayed");
    }

    @And("User should see keypad is displayed")
    public void userShouldSeeKeypadIsDisplayed() {
        Assert.assertTrue(searchPages.isKeyboardVisible(),"Keypad is not displayed");
    }

    @When("User searches for {}")
    public void userSearchesForContent(String Content) {
        searchPages.searchEpisode(Content);
    }

    @Then("User should see search results containing {}")
    public void userShouldSeeSearchResultsContainingContent(String Content) {
     Assert.assertTrue(searchPages.isFirstContentDisplayed(Content),"First Content is not displayed");
    }

    @And("User clicks on the first search result")
    public void userClicksOnTheFirstSearchResult() {
        searchPages.firstContentSelect();
    }

    @Then("User should be navigated to content page containing {}")
    public void userShouldBeNavigatedToContentPageContainingContent(String Content) {
        Assert.assertTrue(searchPages.isWaterMarkDisplayed(Content),"Water mark is not Displayed");
    }

    @Then("User should see Last Searched section {}")
    public void userShouldSeeLastSearchedSection(String Content) {
        Assert.assertTrue(searchPages.isFirstContentDisplayed(Content),"First Content is not displayed");
    }

    @And("User should see series listed")
    public void userShouldSeeSeriesListed() {
       Assert.assertTrue(searchPages.isSeriesListed(),"Series are not listed");
    }

    @And("User should see Top Cross Icon")
    public void userShouldSeeTopCrossIcon() {
        Assert.assertTrue(searchPages.isCancelIconDisplayed(),"Search Icon is not displayed");
    }

    @And("User clicks Cross Icon")
    public void userClicksCrossIcon() {
        searchPages.clickCancelIcon();
    }

    @Then("User redirected Home Page")
    public void userRedirectedHomePage() {
       Assert.assertTrue(searchPages.isHomeScreenDisplayed(),"Home screen is not displayed");
    }
}
