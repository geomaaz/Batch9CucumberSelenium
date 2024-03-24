package com.eurotech.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin ={"json:target/cucumber.json",
                "html:target/default-html-reports.html", //this allows CukesRunner to create an html report without using the one from Maven
                "rerun:target/rerun.txt"}, //this creates a txt report that mentions only the failed tests. (the FailedTestRunner uses it to know what tests to run)
        features ="src/test/resources/Features", //this defines the origin of the tests that CukesRunner is allowed to run
        glue = "com/eurotech/step_definitions", //this links the Features to their StepDefs
        dryRun = false, //true will not run any defined steps. false will run all the steps.
        tags = "@Teacher" //this defines which tags of tests to run. can use: @ and @ | @ or @ | @ and not @ | @ and @ and not @ and not @ |...
)
public class CukesRunner {


}
