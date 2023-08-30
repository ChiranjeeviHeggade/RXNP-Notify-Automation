package uiRun;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report/cucumber.html","rerun:target/failed_scenarios.html"},
		features = {"src/test/resources/ui/features/P0_TC_CareGiver"},
		glue = {"com.digital.ui.steps"},
        tags = "@Smoke",
		monochrome = true
)

/**
 *AuthorName: Murali Krishnan Nagaraj
 *AuthorEmail: muralikrishnan.nagaraj@albertsons.com
 *Summary : Cucumber Runner
 *CreatedDate : Nov-04-2018
 */

public class CucumberRunnerTest {}
