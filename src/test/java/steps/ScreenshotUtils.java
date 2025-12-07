package steps;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

    public static void attachScreenshot(WebDriver driver, String name) {
        try {
            if (driver != null) {
                // 1. Capture the screenshot as a byte array
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

                // 2. Attach the screenshot to the current test step in the report
                Allure.getLifecycle().addAttachment(
                        name,               // The name that will appear in the report
                        "image/png",        // MIME type
                        "png",              // File extension
                        screenshot
                );
            }
        } catch (Exception e) {
            // Log if the capture failed (e.g., driver error)
            System.err.println("Failed to attach screenshot: " + e.getMessage());
        }
    }
}
