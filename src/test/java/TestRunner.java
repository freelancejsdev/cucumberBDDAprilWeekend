import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/features/"},
       // glue = {"steps"}, //location of step definitions
        plugin = {"pretty","html:target/report.html"},
       // tags = "@ui"    // single tag
       // tags = "@regression or @ui"
        tags = "@new and @regression"
       // tags="~@ui" // ignore
       // tags = "@regression or @ui or ~@new"
       // monochrome = true,//output looks cleaner
       // dryRun = true, // whether matching  step definitions are there
        //strict = true // features which don't have steps implemented will fail in junit output



)



public class TestRunner
{

}
