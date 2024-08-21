package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefile/login.feature",
glue = {"utility", "stepdefinitions"},
plugin = {"pretty", "html:target/cucumber-reports.html"},
monochrome = true)
public class TestRunner {

}
