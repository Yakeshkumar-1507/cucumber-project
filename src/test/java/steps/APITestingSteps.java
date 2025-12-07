package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class APITestingSteps {
    Response response;

    public APITestingSteps() {
        baseURI = "https://reqres.in/";
    }

    @Given("user verify the get endpoint")
    public void user_verify_the_get_endpoint() {
        response = given()
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres_4ea9fe95f9b947b590c81e010d3553ae")
                .when()
                .get("api/users/2")
                .then()
                .extract().response();
    }

    @Then("user successfully verify {int} status code")
    public void user_successfully_verify_status_code(Integer value) {
        System.out.println("Status code is " + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("Successfully verified");
        }
        else {
            throw new RuntimeException("Failed verification");
        }
    }
}
