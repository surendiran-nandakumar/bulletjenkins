Feature: Video Control Feature

  @BulletTest @TC_077 @Watchlist
  Scenario Outline:TES180 Verify on tapping "+" icon, user is able to add show to watchlist
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    When User tap on My List tab
    And User take Watchlist count
    And User Clicked  on the Explore Tab in Home
    Then User clicks on Add to Watchlist
    Then User should click on Home navigation icon
    When User tap on My List tab
    Then User verifies Show Added to Watchlist

    Examples:
      | Mobile Number |
      | 7604913183   |


  @BulletTest @TC_079 @Watchlist
  Scenario Outline:TES182 Verify if user is able to delete show from Watchlist
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    When User tap on My List tab
    And User take Watchlist count
    And User Clicked  on the Explore Tab in Home
    Then User clicks on Add to Watchlist
    Then User should click on Home navigation icon
    When User tap on My List tab
    Then User verifies Show Added to Watchlist
    Then User should click on Home navigation icon
    When User tap on My List tab
    Then User verifies Show Added to Watchlist
    Then User clicks on Edit Watchlist Icon
    And User Deletes the first show
    And user should click on save button
    Then User verifies Show Removed from Watchlist

    Examples:
      | Mobile Number |
      | 7604913183   |

  @BulletTest @TC_080 @Watchlist
  Scenario Outline:TES183 Verify if user is able to add the same shows again to watchlist once deleted
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    When User tap on My List tab
    And User take Watchlist count
    And User Clicked  on the Explore Tab in Home
    Then User clicks on Add to Watchlist
    Then User should click on Home navigation icon
    When User tap on My List tab
    Then User verifies Show Added to Watchlist
    Then User should click on Home navigation icon
    When User tap on My List tab
    Then User verifies Show Added to Watchlist
    Then User clicks on Edit Watchlist Icon
    And User Deletes the first show
    And user should click on save button
    Then User verifies Show Removed from Watchlist
    And User Clicked  on the Explore Tab in Home
    Then User clicks on Add to Watchlist
    Then User should click on Home navigation icon
    When User tap on My List tab
    Then User verifies Show Added to Watchlist

    Examples:
      | Mobile Number |
      | 7604913183   |