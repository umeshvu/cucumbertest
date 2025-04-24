package stepdefs;
import com.uu.cucumbertest.GarCall;
import com.uu.cucumbertest.GarCallConfig;
import com.uu.cucumbertest.GarCallService;
import io.cucumber.java.en.*;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

public class GarCallStepDefs {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withUserConfiguration(GarCallConfig.class);

    private String isAllowed;
    private String response;

    @Given("isAllowed is {string}")
    public void setIsAllowed(String value) {
        this.isAllowed = value;
    }

    @When("GarCallService is invoked")
    public void invokeService() {
        contextRunner
                .withPropertyValues("isAllowed=" + isAllowed)
                .run(context -> {
                    GarCallService service = new GarCallService(context.getBean(GarCall.class));
                    response = service.doCall();
                });
    }

    @Then("response should be {string}")
    public void verifyResponse(String expected) {
        assertThat(response).isEqualTo(expected);
    }
}

