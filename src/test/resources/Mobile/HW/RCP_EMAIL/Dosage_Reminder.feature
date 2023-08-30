Feature: Dosage Reminder_Email

  @RCP_Notification_Dosagee
  Scenario: Validate Dosage Remainder email after user creation through API call
    When User POSTS API request to generate Dosage Reminder Email
    Then User validates Email Subject line
    Then User validates Email Sender text
    Then User validates Email Body text
    Then user verify the links present in Email body


