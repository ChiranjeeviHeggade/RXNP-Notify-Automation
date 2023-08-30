
  @RCP_Notification_Expiry_2
Feature: Expiry Remainder_Email

  Scenario: Validate Expiry Reminder email after user creation through API call
    When User posts API request to generate Expiry Reminder Email
    Then User validates Email Subject line
    Then User validates Email Sender text
    Then User validates Email Body text
    Then user verify the links present in Email body


