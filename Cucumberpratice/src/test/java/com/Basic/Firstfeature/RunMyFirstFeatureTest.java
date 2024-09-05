package com.Basic.Firstfeature;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				
				features= {"src/test/java/Resource/basic/Firstfeature"},
						 glue = {"com.Basic.Firstfeature"},
				
				plugin= {"pretty",
						"html:target/cucumber-htmlreport",
						"json:target/cucumber-report.json",
				}
				)
public class RunMyFirstFeatureTest {	
}
 