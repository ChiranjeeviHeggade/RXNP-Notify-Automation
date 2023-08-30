
  @RCP_Notification_PartialFillOrder
Feature: Partial Fill Order Email

  Scenario: Validate Partial Fill Order Email after user creation through API call
    When User POSTS API request to generate Partial Fill Order Email
    Then User validates Email Subject line
    Then User validates Email Sender text
    Then User validates Email Body text
    Then user verify the links present in Email body


