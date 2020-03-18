package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = {"src/test/resources"},
        glue = {"com.example.glue"}
)
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {
}
