Feature: Partial fill Order Push Notification.


   @PushNotification_PartialFillOrder
  Scenario: Partial Fill Order for selected prescription
     When user login to Grocery with auth user
     When user click on pharmacy CTA
     And user login to Pharmacy App
     When user posts API request to generate Partial Fill Order Push Notification
     Then User opens the Notification bar from the Mobile
     Then User Validates the Title of the Push Notification
     Then User Validates the body of the push
     Then User closes the Notification bar from the Mobile



