package runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(monochrome = true, features = {"src/test/resources/features"}, glue={"steps"})
public class GoogleRunner {

}
