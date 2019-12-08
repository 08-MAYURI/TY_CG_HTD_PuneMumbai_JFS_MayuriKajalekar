package com.capgemini.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="features",glue= {"com.capgemini.StepDefination"})
public class BDDRunner{

}
