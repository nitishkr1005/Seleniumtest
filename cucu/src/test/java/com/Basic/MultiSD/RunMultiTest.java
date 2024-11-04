package com.Basic.MultiSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				
				features= {"src/test/java/Resource/basic/Multifeature/"},
						 glue = {"com.Basic.MultiSD"},
				
				plugin= {"pretty",
						"html:target/cucumber-htmlreport.html", 
						"json:target/cucumber-report9.json",
				//		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
				}
				)
public class RunMultiTest   {	
}
 