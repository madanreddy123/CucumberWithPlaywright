
Feature: First Test

  Background:
    Given user on login page
  @rr
  Scenario Outline: To enter few data
    Given validate the homepage
    And I enter the name a first_name '<first_name>'
    And I enter the name a Middle_Name '<middle_Name>'
    And I enter the name a Last_Name '<last_Name>'
    When I enter the name a phone_number '<phone_number>'
    When I enter the name a Address_One '<address_One>'
#    Then upload a file and validate if its downloaded
    When I enter the Address_Two '<address_Two>'
#    When I enter the pin_code '<pin_code>'
    When I enter the continent '<continent>'
    And I enter the name a Primary_School '<primary_School>'
    And I enter the name a Secondary_School '<secondary_School>'
    And I enter the name a Intermediate '<intermediate>'
    When I enter the name a Engineering '<engineering>'
    When I enter the name a University '<university>'
    When I enter the intermediate_Percentage '<intermediate_Percentage>'
    When  I click on gender '<gender>'



    Examples:
      | first_name| middle_Name| last_Name| phone_number|         address_One          | address_Two   |pin_code  |continent|  primary_School           | secondary_School        | intermediate| engineering                   |University|intermediate_Percentage |
      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
#      | madan     |    mohan   |  reddy   |111111111111   |Flat no 2, kingsmill court    |bolton street  |   D0001111| Europe |  model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |
