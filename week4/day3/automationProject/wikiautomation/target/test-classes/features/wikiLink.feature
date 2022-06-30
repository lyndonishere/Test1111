Feature: Users should be able to view content in their own language
Scenario: As an english reader I wish to view content in english
    Given The user is on the wikipedia homepage
    When The user clicks the english link
    Then The user should be viewing content in english