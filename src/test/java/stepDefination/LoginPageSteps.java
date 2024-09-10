package stepDefination;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.TestDataBuild;
import resources.Utils;

import static io.restassured.RestAssured.*;

public class LoginPageSteps extends Utils {

	RequestSpecification req;
	Response res;

	TestDataBuild b = new TestDataBuild();

	@Given("Add Place payload with request")
	public void add_place_payload_with_request() throws IOException {

		req = given().log().all().spec(requestdetails()).body(b.requestSpecification());
	}
	
	
	@When("user calls {string} with {string} HTTP request")
	public void user_calls_with_http_request(String endpoint, String requestMethod) {
		if (requestMethod.equalsIgnoreCase("get")) {
			res = req.get(endpoint);
			
		}else if (requestMethod.equalsIgnoreCase("post")) {
				res = req.post(endpoint);
				
			
			
		}
	}
	
	
	

	
	@Then("the API call gets success with status code {int}")
	public void the_api_call_gets_success_with_status_code(Integer int1) {
		res.then().log().all();
		int statuscode = res.statusCode();
		Assert.assertEquals(200, statuscode);

	}

	@Then("status in response body is OK")
	public void status_in_response_body_is_ok() {
		String response = res.asString();
		JsonPath js = new JsonPath(response);
		String statusvalue = js.getString("status");

		Assert.assertEquals("OK", statusvalue);

	}

	@Then("scope in response body is APP")
	public void scope_in_response_body_is_app() {
		String response = res.asString();
		JsonPath js = new JsonPath(response);
		String scopevalue = js.getString("scope");

		Assert.assertEquals("APP", scopevalue);

	}

}
