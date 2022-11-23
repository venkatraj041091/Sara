package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		dryRun=true,
		plugin = {"pretty"},
		monochrome=true,
		features="src\\test\\resources\\features",
		glue="com.StepDefinition"
		)
public class TestRunnerClass {



}


