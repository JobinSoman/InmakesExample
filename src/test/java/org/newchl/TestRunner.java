package org.newchl;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(
features ="src/test/resources", 
glue ="org.newchl",
monochrome=true, 
dryRun=false,
snippets=SnippetType.CAMELCASE,
tags="@Feature7 or @Smoke1",
plugin= {"html:Report\\reportam.html","junit:Report\\reportam.junit",
		"json:Report\\reportam.json"}
)
public class TestRunner {
}
