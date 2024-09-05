package com.Basic.SecondScenario;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				
				features= {"src/test/java/Resource/basic/Secondfeature/"},
						 glue = {"com.Basic.SecondScenario"},
				
				plugin= {"pretty",
						"html:target/cucumber-htmlreport",
						"json:target/cucumber-report1.json",
				}
				)
public class SecondScenarioTest   {	
}
 