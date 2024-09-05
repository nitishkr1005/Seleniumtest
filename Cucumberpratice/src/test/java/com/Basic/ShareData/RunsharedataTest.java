package com.Basic.ShareData;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				
				features= {"src/test/java/Resource/basic/ShareData/"},
						 glue = {"com.Basic.ShareData"},
				
				plugin= {"pretty",
						"html:target/cucumber-htmlreport", 
						"json:target/cucumber-report10.json",
					//	"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
				}
				)
public class RunsharedataTest   {	
}
 