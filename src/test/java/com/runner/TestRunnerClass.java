package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.adactin.report.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"}, glue= {"com/stepdefinition"},
monochrome=true,dryRun=false,plugin= {"html:Reports","json:JsonReports/rep.json"})
public class TestRunnerClass {
	
	@AfterClass
	public static void reportGeneration() {
		
		JVMReport.reportGeneration("JsonReports\\rep.json");
	}
	}