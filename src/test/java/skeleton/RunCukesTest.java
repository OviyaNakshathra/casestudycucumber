package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/skeleton/scenario4add.feature"},glue="skeleton",plugin="json:target/jsonreport.json")
public class RunCukesTest {
}
