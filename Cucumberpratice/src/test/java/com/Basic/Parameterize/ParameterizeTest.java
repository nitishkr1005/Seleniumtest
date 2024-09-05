package com.Basic.Parameterize;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				
				features= {"src/test/java/Resource/basic/Parameterizefeature/"},
						 glue = {"com.Basic.Parameterize"},
				
				plugin= {"pretty",
						"html:target/cucumber-htmlreport", 
						"json:target/cucumber-report2.json",
				}
				)
public class ParameterizeTest   {	
}
 