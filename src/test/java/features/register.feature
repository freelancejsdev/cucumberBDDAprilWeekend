Feature: Register new user

  Background: navigate to register page
    Given I navigate to url "https://demo.nopcommerce.com/"
    Then  I should be navigated to home page

  @sanity @smoke
  Scenario: verify register functionality by providing data in mandatory fields

    When  I click on the register link from the navbar
    Then  I should be navigated to register page
    When  I select gender as male
    And   I enter firstName lastName email password confirmPassword
      | firstName | lastName | email           | password    | confirmPassword |
      | user      | qa       | qauser1@nop.com | Testing@123 | Testing@123     |

    And I click on register button
    Then I should be registered successfully


   @ui @regression
  Scenario: verify register functionality by not providing data in mandatory fields

    When  I click on the register link from the navbar
    Then  I should be navigated to register page
    And I click on register button
    Then I should see error messages for all the mandatory fields


