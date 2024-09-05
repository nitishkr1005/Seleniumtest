package com.Basic.Datadriven;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				
				features= {"src/test/java/Resource/basic/DatadrivenFeature/"},
						 glue = {"com.Basic.Datadriven"},
				
				plugin= {"pretty",
						"html:target/cucumber-htmlreport", 
						"json:target/cucumber-report5.json",
				}
				)
public class DatadrivenTest   {	
}
 