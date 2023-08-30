
  @RCP_Notification_Refill_2
Feature: Refill Reminder_Email

  Scenario: Validate Refill Reminder email after user creation through API call
    When User posts API request to generate Refill Reminder Email for two days
    Then User validates Email Subject line
    Then User validates Email Sender text
    Then User validates Email Body text
    Then user verify the links present in Email body


