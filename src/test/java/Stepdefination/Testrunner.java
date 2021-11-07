package Stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",glue={"Stepdefination"},
monochrome=true,
//The below line is for HTML report
//plugin={"pretty","html:target/HtmlReports"},
//The below line is for Json report
//plugin={"pretty","json:target/JsonReports/reports.json"}
//The below line is for Junit report
//plugin={"pretty","junit:target/JUnitReports/reports.xml"}
//if you want all 3 format of reports use below
plugin={"pretty","html:target/HtmlReports",
		"json:target/JsonReports/reports.json",
		"junit:target/JUnitReports/reports.xml"
		}
//tags="@smoketest"	
		)
public class Testrunner {

}
