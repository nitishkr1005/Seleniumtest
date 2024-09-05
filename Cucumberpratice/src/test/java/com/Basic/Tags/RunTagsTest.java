package com.Basic.Tags;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				tags = "@Smoke or @Regression",  // Runs scenarios tagged with @smoke OR @regression
//				tags = "@Regression and @Smoke", // which has both then only 
			
				features= {"src/test/java/Resource/basic/tagsFeature/"},
						 glue = {"com.Basic.Tags"},
						 
				
				plugin= {"pretty",
						"html:target/cucumber-htmlreport", 
						"json:target/cucumber-report2.json",
						"comcucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
						
				}
				)
public class RunTagsTest   {	
}
 