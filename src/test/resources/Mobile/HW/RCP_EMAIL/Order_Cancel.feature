
  @RCP_Notification_OrderCancel
Feature: Order Cancel Email

  Scenario: Validate Order Cancel Email after user creation through API call
    When User POSTS API request to generate Order Cancel Email
    Then User validates Email Subject line
    Then User validates Email Sender text
    Then User validates Email Body text
    Then user verify the links present in Email body


