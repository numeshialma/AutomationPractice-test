package AutomationPractice;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.TestApp;

@CucumberOptions(
        features = {"src/test/resources/features/RegisterUser.feature"}, // ,"Aaaaa.feature"
        glue = {"AutomationPractice"}, //package name
        monochrome = true,
        plugin = {
                "pretty",
                "junit:target/JUnitReports/report.xml",
                "html:target/HtmlReports",
                "json:target/JSONReports/report.json"}
)
public class TestRunner {

        private TestNGCucumberRunner testNGCucumberRunner;

        @BeforeClass(alwaysRun = true)
        public void setUpClass()throws Exception{
            testNGCucumberRunner=new TestNGCucumberRunner(this.getClass());
        }

        @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
        public void feature(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
            testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
        }

        @DataProvider
        public Object[][]features(){
            return testNGCucumberRunner.provideScenarios();
        }

        @AfterClass(alwaysRun = true)
        public void tearDownClass()throws Exception{
        TestApp.getInstance().closeBrowser();
        testNGCucumberRunner.finish();
        }
}
