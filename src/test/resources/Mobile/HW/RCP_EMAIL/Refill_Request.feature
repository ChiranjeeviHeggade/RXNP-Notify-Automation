
  @RCP_Notification_RefillRequest
Feature: Refill Request_Email

  Scenario: Validate Refill Request email after user creation through API call
    When User POSTS API request to generate Refill request Email
    Then User validates Email Subject line
    Then User validates Email Sender text
    Then User validates Email Body text
    Then user verify the links present in Email body


