Feature: User registration on utest.com

  Scenario: The user can register on the page with utest
    Given I am on the website
    When the user fills in the data of the first form
      | firstname | lastname | emailaddress             | dateofbirthmouth | dateofbirthday | dateofbirthyear |
      | Lorena    | Galeano  | lorena-galeano@gmail.com | May              |             20 |            1995 |
    And the user fills in the data of the second form
      | cityfield | ziporpostalcodefield | country  |
      | Bello  |               001121 | Colombia |
    And the user fills in the data of the third form
      | computer | versionfield | languagefield |
      | Linux    | Ubuntu       | Spanish       |
    Then the user will see the message The last step
