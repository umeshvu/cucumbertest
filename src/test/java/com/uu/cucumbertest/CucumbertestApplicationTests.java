package com.uu.cucumbertest;

import io.cucumber.spring.CucumberContextConfiguration;
import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Cucumber
@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CucumbertestApplicationTests {

    @Test
    void contextLoads() {
    }

}
