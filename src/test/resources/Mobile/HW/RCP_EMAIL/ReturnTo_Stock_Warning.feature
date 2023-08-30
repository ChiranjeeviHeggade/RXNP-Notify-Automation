
  @RCP_Notification_ReturnToStockWarning
Feature: Return to Stock Warning Email

  Scenario: Validate Return to Stock Warning Email after user creation through API call
    When User POSTS API request to generate Return To Stock Warning Email
    Then User validates Email Subject line
    Then User validates Email Sender text
    Then User validates Email Body text
    Then user verify the links present in Email body


