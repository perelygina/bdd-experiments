Feature: Notifications

  @PFM-1 @OPEN
  Scenario: Delayed train notification
    Given I have for the 10:35am train to Union station
    When the train is delayed by ten minutes
    Then I will recieve a message
