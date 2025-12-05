package context;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Scenario;
import pages.*;
import utilities.ConfigLoader;
import utilities.CredsLoader;

public class TestContext {
    public AppiumDriver driver;
    public CredsLoader credsLoader;
    public ConfigLoader configLoader;
    public Scenario scenario;
    public LoginPage loginPage;
    public EmailNavigatorPage emailNavigatorPage;
    public WelcomePage welcomePage;
    public LanguagePreference languagePreference;
    public HomeScreenPages homeScreenPages;
    public WalletPage walletPage;
    public ShowScreenPages showScreen;
    public EpisodeAccessPages episodeAccessPages;
    public VideoControlPages videoControlPages;
    public WatchlistPages watchlistPages;
    public LikeUnlikePages likeUnlikePages;
    public String otp;
    public ProfileScreenPages profileScreenPages;
    public SearchPages searchPages;
    public PaymentsAndCoinsPages paymentsAndCoinsPages;
}
