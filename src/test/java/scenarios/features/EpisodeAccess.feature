@EpisodeAccess
Feature: Episode Access Feature

  @BulletTest @TC_050
  Scenario Outline:TES153 Verify the UI on tapping "Episodes" button
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User Clicks on the Episodes Button
    Then Episodes PopUp should visible
    And User see First Episode


    Examples:
      | Mobile Number |
      | 7604913183    |


  @BulletTest @TC_051
  Scenario Outline:TES154 Verify Unlock video functionality if user has coin balance <3 to view the episode
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User Clicks on the Episodes Button
    Then Episodes PopUp should visible
    Then User should click on locked episode
    Then User should see unlock this video popup
    Then User should see refill wallet and unlock button
    Then User should see watch ad & unlock for free

    Examples:
      | Mobile Number |
      | 7604913183   |

  @BulletTest @TC_052
  Scenario Outline:TES155 Verify on tapping "Refill wallet and unlock" button
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User Clicks on the Episodes Button
    Then Episodes PopUp should visible
    Then User should click on locked episode
    Then User should see unlock this video popup
    Then User should see watch ad & unlock for free
    Then User should click any coins payment
    Then User should see payment gateway screen

    Examples:
      | Mobile Number |
      | 7604913183   |



  @BulletTest @TC_053
  Scenario Outline:TES156 Verify if user is able to resume watching videos once payment is done/ post purchasing the coin
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User Clicks on the Episodes Button
    Then Episodes PopUp should visible
    Then User should click on locked episode
    Then User should see unlock this video popup
    Then User should see watch ad & unlock for free
    Then User should click any coins payment
    Then User should see payment gateway screen
    Then User should select card status
    Then User should select the card status as "<Payment status>"
    Then User should click on Buy button
    Then User should check the video is resumed post payment

    Examples:
      | Mobile Number | Payment status |
      | 7604913183    |  Success       |



  @BulletTest @TC_054
  Scenario Outline:TES157 Verify if user is able to resume watching if payment failed
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User Clicks on the Episodes Button
    Then Episodes PopUp should visible
    Then User should click on locked episode
    Then User should see unlock this video popup
    Then User should see watch ad & unlock for free
    Then User should click any coins payment
    Then User should see payment gateway screen
    Then User should select card status
    Then User should select the card status as "<Payment status>"
    Then User should click on Buy button
    Then User should see Error popup
    Then User should click on Got it button
    Then User should see unlock this video popup
    Then User should tap over the screen so the popup will disappear

    Examples:
      | Mobile Number | Payment status |
      | 7604913183    |   Decline      |



  @BulletTest @TC_056
  Scenario Outline:TES159 Verify if coins are deducted again for already unlocked episodes
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    When User tap on Wallet tab
    Then User should be redirected to Wallet Page
    And User should see the Bullet logo
    And User should click on Coins History
    And User should verify whether landed on Coin History page
    And User should check that coin is deducted for already watched episode

    Examples:
      | Mobile Number |
      | 7604913183    |


  @BulletTest @TC_057
  Scenario Outline:TES160 Verify the behaviour on tapping "Watch Ad and unlock for free" button
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User Clicks on the Episodes Button
    Then Episodes PopUp should visible
    Then User should click on locked episode
    Then User should see watch ad & unlock for free
    Then User should click on watch ad & unlock for free
    Then User should verify that ad is running


    Examples:
      | Mobile Number |
      | 7604913183   |