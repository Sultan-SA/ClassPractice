package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sulta\\eclipse-workspace\\cucumber-Class-Practice\\src\\test\\resources\\ClassPractice.feature", glue="stepDefinitions")
public class Runner {

}
