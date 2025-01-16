package com.fdmgroup.stepDefinitionFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/com/fdmgroup/featureFiles", 
		glue = "com.fdmgroup", 
		publish = true,
		plugin = { "pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cucumber.xml" })

public class TestRunner {

}
