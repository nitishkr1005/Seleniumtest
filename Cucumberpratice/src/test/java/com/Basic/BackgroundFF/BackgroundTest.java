package com.Basic.BackgroundFF;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				
				features= {"src/test/java/Resource/basic/BackgroundFeature/"},
						 glue = {"com.Basic.BackgroundFF"},
				
				plugin= {"pretty",
						"html:target/cucumber-htmlreport", 
						"json:target/cucumber-report3.json",
				}
				)
public class BackgroundTest   {	
}
 