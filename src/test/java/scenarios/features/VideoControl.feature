Feature: Video Control Feature

  @BulletTest @TC_058
  Scenario Outline:TES161 Verify if user is able to pause the episode playback
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User should see the Start Button and Episodes Button
    And User Clicks on the Start Button
    Then User should see pause Icon
    And User clicks on pause Icon
    Then Video Playback should be paused


    Examples:
      | Mobile Number |
      | 7604913183   |


  @BulletTest @TC_059
  Scenario Outline:TES162 Verify if user is able to resume play
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User should see the Start Button and Episodes Button
    And User Clicks on the Start Button
    Then User should see pause Icon
    And User clicks on pause Icon
    Then Video Playback should be paused
    Then User clicks on Play Icon
    Then Verify Video Playback resumed from where it is paused


    Examples:
      | Mobile Number |
      | 7604913183    |


  @BulletTest @TC_060
  Scenario Outline:TES163 Verify if on increasing/ decreasing audio setting, audio of content increases/ decreases
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User should see the Start Button and Episodes Button
    And User Clicks on the Start Button
    Then User should see pause Icon
    And User clicks on pause Icon
    When User increases the device volume
    When User decreases the device volume

    Examples:
      | Mobile Number |
      | 7604913183    |


  @BulletTest @TC_063
  Scenario Outline:TES166 Verify if user is able to mute/ unmute while while watching content
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User should see the Start Button and Episodes Button
    And User Clicks on the Start Button
    Then User should see MuteUnmute Icon
    And User Clicks on mute Icon
    Then playback audio should be muted
    And User Clicks on Unmute Icon
    Then playback audio should be Unmuted


    Examples:
      | Mobile Number |
      | 7604913183   |

  @BulletTest @TC_069
  Scenario Outline:TES172 Verify if video playback gives any error
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User should see the Start Button and Episodes Button
    And User Clicks on the Start Button
    Then User verifies video playback works without errors
    Then User scrolls down 1 times
    And User verifies video playback works without errors


    Examples:
      | Mobile Number |
      | 7604913183   |


  @BulletTest @TC_072 @P0
  Scenario Outline:TES175 Verify trailer playback resumes on launching app to foreground
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User should see the Start Button and Episodes Button
    And User Clicks on the Start Button
    When User puts the app in background for 10 seconds
    And User brings the app to foreground
    Then Trailer playback should resume from where it left off

    Examples:
      | Mobile Number |
      | 7604913183   |


  @BulletTest @TC_074 @P0
  Scenario Outline:TES177 Verify if user is able to report video
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User should see the Start Button and Episodes Button
    And User Clicks on the Start Button
    And User should see Settings button
    And User Clicks settings button
    And User should see Report video option
    Then User clicks Report video option
    And User See the reasons listed
    Then User Selects the Reason
    Then user clicks the submit button

    Examples:
      | Mobile Number |
      | 7604913183   |


  @BulletTest @TC_076
  Scenario Outline:TES179 Verify if Bullet watermark is visible on all videos
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User should see the Start Button and Episodes Button
    And User Clicks on the Start Button
    And User should see the Bullet Watermark
    Then User scrolls down 1 times
    And User should see the Bullet Watermark

    Examples:
      | Mobile Number |
      | 7604913183   |

  @BulletTest @TC_067
  Scenario Outline:TES170 Verify all the video related settings is applied smoothly and video playback is not paused
    Given User should select the language preference for new user
    Then User should select add button after selecting the language
    Then User should click on Home navigation icon
    Then User should click on Profile Icon
    When User click on <Mobile Number> Text Box And Enter The Number
    Then User Enter The OTP Number
    And User should See Profile Picture
    And User click on profile cancel icon
    And User Clicked  on the Explore Tab in Home
    And User should see the Start Button and Episodes Button
    And User Clicks on the Start Button
    And User should see Settings button
    And User Clicks settings button
    And User should verify that video is playing in the background

    Examples:
      | Mobile Number |
      | 7604913183   |



