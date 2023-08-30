
  @RCP_Notification_Transfer
Feature: Transfer Request_Email

  Scenario: Validate Transfer Request email after user creation through API call
    When User POSTS API request to generate Transfer request Email
    Then User validates Email Subject line
    Then User validates Email Sender text
    Then User validates Email Body text
    Then user verify the links present in Email body


