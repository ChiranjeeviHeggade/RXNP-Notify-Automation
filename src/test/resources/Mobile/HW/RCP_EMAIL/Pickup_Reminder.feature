
  @RCP_Notification_PickupReminder
Feature: Pickup Reminder Email

  Scenario: Validate Pickup Reminder Email after user creation through API call
    When User POSTS API request to generate Pickup Reminder Email
    And User POSTS API request for Batch Job
    Then User validates Email Subject line
    Then User validates Email Sender text
    Then User validates Email Body text
    Then user verify the links present in Email body


