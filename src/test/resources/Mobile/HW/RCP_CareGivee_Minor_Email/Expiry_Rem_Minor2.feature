
@RCP_EMAIL_Expiry_Minor2
Feature: Expiry Reminder_Email For Minor Care Givee

  Scenario: Validate Expiry Reminder Email For Minor Care Givee after user creation through API call
    When User posts API request to generate Expiry Reminder Email
    Then User validates Email Subject line
    Then User validates Email Sender text
    Then User validates Email Body text
    Then user verify the links present in Email body


