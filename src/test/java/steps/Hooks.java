package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // run without UI
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");driver = new ChromeDriver(options);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        System.out.println("Browser launched before Scenarios");
    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Ensure the driver is not null and is active before trying to capture
                if (driver != null) {
                    byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                    // The attachment logic is correct:
                    Allure.getLifecycle().addAttachment(
                            "Failure Screenshot", "image/png", "png", screenshot
                    );
                }
            } catch (Exception e) {
                System.err.println("Could not capture or attach screenshot: " + e.getMessage());
            }
        }
        // IMPORTANT: Close the driver *after* attempting the screenshot capture.
        if (driver != null) {
            driver.quit();
        }
    }


}
