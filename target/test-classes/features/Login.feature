Feature: Validate Place API
  @Smoke
  Scenario: Verify if Place is being successfully added using AddPlaceAPI
    Given Add Place payload with request
    When user calls "maps/api/place/add/json" with "POST" HTTP request
    Then the API call gets success with status code 200
    And status in response body is OK
    And scope in response body is APP
