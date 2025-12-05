Feature: Wallet Feature

  @BulletTest  @TC_028 @Wallet
  Scenario Outline: TES131 Verify if user lands on Coin screen on tapping coins option from bottom nav bar
    #Given User click the arrow button
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    When User tap on Wallet tab
    Then User should be redirected to Wallet Page
    And User should see the Bullet logo
    And User should See Search Icon
    And User should See Profile Icon
    And User should See Wallet ID and Copy option
    And User should see the Free Coins Tab
    And User should see the Buy Coins Tab
    And User should see the Coin History  Tab

    Examples:
      | Mobile Number |
      | 7604913183    |

  @BulletTest  @TC_029 @Wallet
  Scenario Outline: TES132 Verify user lands on coin purchase screen on tapping "Buy coins"
    #Given User click the arrow button
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    When User tap on Wallet tab
    Then User should be redirected to Wallet Page
    And User should see the Bullet logo
    And User should click on Buy coins
    And User should select the coins
    And User should verify that navigates to purchase gateway

    Examples:
      | Mobile Number |
      | 7604913183    |

  @BulletTest  @TC_030 @Wallet
  Scenario Outline: TES133 Verify user lands on coin history screen on tapping it
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    When User tap on Wallet tab
    Then User should be redirected to Wallet Page
    And User should see the Bullet logo
    And User should click on Coins History
    And User should verify whether landed on Coin History page
    And User should check the transaction history


    Examples:
      | Mobile Number |
      | 7604913183    |


  @BulletTest  @TC_031 @Wallet
  Scenario Outline: TES134 Verify "Free coins" page on tapping it
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    When User tap on Wallet tab
    Then User should be redirected to Wallet Page
    And User should see the Bullet logo
    And User should able to see Collect free coin tab
    And User should click on Free coins tab
    And User should click on Collect Free coin button
    And User should see free coins checkin popup
    And User should click on Ok button in coins checkin popup
    And User should click on cancel icon in watch add popup
    And User should click on Coins History
    And User should verify whether landed on Coin History page
    And User should check the transaction history

    Examples:
      | Mobile Number |
      | 7604913183    |

  @BulletTest  @TC_032 @Wallet
  Scenario Outline: TES135 Verify if newly registered user is displayed with "Profile completion task" and "Turn on Notifications" task
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    When User tap on Wallet tab
    Then User should be redirected to Wallet Page
    And User should see the Bullet logo
    And User should able to see Collect free coin tab
    And User should click on Free coins tab
    And User should see profile completion task
    And User should see Turn On Notification task


    Examples:
      | Mobile Number |
      | 7604913183  |


  @BulletTest  @TC_033 @Wallet
  Scenario Outline: TES136 Verify if user is able to complete profile on tapping "Complete your profile" task
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    When User tap on Wallet tab
    Then User should be redirected to Wallet Page
    And User should see the Bullet logo
    And User should able to see Collect free coin tab
    And User should click on Free coins tab
    And User should see profile completion task
    And User should click go on profile completion
    And User should verify whether landed on Edit Profile page
    And User should enter <Full Name> in the particular field
    And User should select age group
    And User should select gender and click on save button
    And User should see coins credit screen
    And User should click on Coins History
    And User should verify whether landed on Coin History page
    And User should check the transaction history


    Examples:
      | Mobile Number | Full Name |
      | 7604913183  | surendiran |


  @BulletTest  @TC_034 @Wallet
  Scenario Outline: TES137 Verify if user is able to tap Turn on notification banner
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    When User tap on Wallet tab
    Then User should be redirected to Wallet Page
    And User should see the Bullet logo
    And User should able to see Collect free coin tab
    And User should click on Free coins tab
    And User should see Turn On Notification task
    And User should click Go button in Turn on notification
#    And User should see reward coins popup for turning on notification
    And User should click Okay button in turn on notification popup screen
    And User should click on Coins History
    And User should verify whether landed on Coin History page
    And User should check the transaction history


    Examples:
      | Mobile Number |
      | 7604913183   |