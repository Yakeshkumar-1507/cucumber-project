package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class AdactinLogin {

    WebDriver driver = Hooks.driver;

    @Given("user is on login page")
    public void user_is_on_login_page() throws FileNotFoundException {
        driver.get(readUrl());
    }

    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        ScreenshotUtils.attachScreenshot(driver,"user login");
    }

    @When("user click login button")
    public void user_click_login_button() {
        driver.findElement(By.id("login")).click();
        ScreenshotUtils.attachScreenshot(driver,"clicked login button");
    }

    @Then("user should be navigate to the home page")
    public void user_should_be_navigate_to_the_home_page() {
        String text=driver.findElement(By.id("username_show")).getAttribute("value");
        System.out.println(text);
        Assert.assertEquals(true,text.contains("Hello"));
    }

    private String readUrl() throws FileNotFoundException {
        File file = new File("src/test/resources/config/configuration.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties prop = new Properties();
        try {
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop.getProperty("url");
    }
}


//    @When("user enter valid username {string} and password {string}")
//    public void user_enter_valid_username_and_password(String username, String username) {
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//    }