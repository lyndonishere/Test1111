Feature: Users of my bug catcher app should be able to login to their respective homepages

    Scenario: As a manager I want to login to my homepage

        Given   the employee is on the login page
        When    the manager enters his username
        When    the manager enters his password
        When    the employee clicks on the login button
        Then    the manager should be logged into the manager home page

    Scenario: As a tester I want to sign in so I can view my custom homepage

        Given   the employee is on the login page
        When    the tester enters his username
        When    the tester enters his password
        When    the employee clicks on the login button
        Then    the tester should be logged into the tester home page

    Scenario: As a manager I want to be able to create and assign defects

        Given   the manager is on the manager page
        When    the manager enters a defect description
        When    the manager selects a tester
        When    the manager clicks the assign button
        Then    the manager should have created and assigned a defect

    Scenario: As a tester I want to be able to view defects and accept them

        Given   the tester is on the tester page
        When    the tester selects a pending defect
        When    the tester clicks the pull pending defect button
        When    the tester clicks the accept button
        Then    the defect should have status accepted

    Scenario: As a tester I want to be able to view defects and decline them

        Given   the tester is on the tester page
        When    the tester selects a pending defect
        When    the tester clicks the pull pending defect button
        When    the tester clicks the decline button
        Then    the defect should have status declined

    Scenario: As a tester I want to be able to view accepted defects and reject them

        Given   the tester is on the tester page
        When    the tester selects an accepted defect
        When    the tester clicks the pull accepted defect button
        When    the tester selects the reject option
        Then    the defect should have status rejected

    Scenario: As a tester I want to be able to view accepted defects and fix them

        Given   the tester is on the tester page
        When    the tester selects an accepted defect
        When    the tester clicks the pull accepted defect button
        When    the tester selects the fixed option
        Then    the defect should have status fixed

    Scenario: As a tester I want to be able to view accepted defects and shelves them

        Given   the tester is on the tester page
        When    the tester selects an accepted defect
        When    the tester clicks the pull accepted defect button
        When    the tester selects the shelved option
        Then    the defect should have status shelved

