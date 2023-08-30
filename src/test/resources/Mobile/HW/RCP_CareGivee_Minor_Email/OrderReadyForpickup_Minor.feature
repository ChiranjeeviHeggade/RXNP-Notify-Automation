
  @RCP_Notification_OrderReadyForPickup
Feature: Order Ready For Pickup Email

  Scenario: Validate Order Ready For Pickup Email after user creation through API call
    When User POSTS API request to generate Order Ready For Pickup Email
    Then User validates Email Subject line
    Then User validates Email Sender text
    Then User validates Email Body text
    #Then user verify the links present in Email body


