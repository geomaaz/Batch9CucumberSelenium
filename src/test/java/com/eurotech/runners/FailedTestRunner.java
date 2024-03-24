package com.eurotech.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-html-reports.html"}, //to create the html report, without maven
        features = "@target/rerun.txt", // to know which tests to run
        glue = "com/eurotech/step_definitions" // to link those tests to their StepDefs
)
public class FailedTestRunner {

}