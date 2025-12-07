package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureFile/AdactinLogin.feature.feature",
        glue = "steps", tags = "@smoke"
//        plugin = {
//                "pretty",
//                "html:reports/cucumber-html-report.html",
//                "json:reports/cucumber.json",
//                "junit:reports/cucumber.xml"
//        }
//        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class TestRunner {
}
