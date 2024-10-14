Feature: Sign In

    @mobile
    Scenario: Sign In
        Given user already open galileo apps
        When user input pin "111111"
        Then assert there is search feature
        Then assert there is notification icon


