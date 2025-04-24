package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloStepDefs {

    @Autowired
    private TestRestTemplate restTemplate;

    private ResponseEntity<String> response;


    @Given("the application is running")
    public void the_application_is_running() {
        // Spring context is loaded automatically
    }

    @When("I call the hello endpoint")
    public void i_call_the_hello_endpoint() {
        response = restTemplate.getForEntity("/hello", String.class);
    }

    @Then("I should receive {string}")
    public void i_should_receive(String expectedResponse) {
        assertThat(response.getBody()).isEqualTo(expectedResponse);
    }
}
