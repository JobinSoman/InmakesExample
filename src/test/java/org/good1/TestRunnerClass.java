package org.good1;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources",
		glue ="org.good1",
		monochrome=true,
		dryRun=false,
		snippets=SnippetType.CAMELCASE,
		tags="@FeatureChallenge",
		plugin={"html:Report\\reportatc.html","junit:Report\\reportatc.junit",
				"json: Report\\reportatc.json"}                                                                          
		)
public class TestRunnerClass 
{

}
