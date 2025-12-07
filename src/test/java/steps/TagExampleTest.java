package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class TagExampleTest {

    @Given("user launch the application")
    public void user_launch_the_application() {
        System.out.println("Launching the application");
    }
    @Then("user validated the login crenditals")
    public void user_validated_the_login_crenditals() {
        System.out.println("Login crenditals validated");
    }

    @Then("user verified the product page")
    public void user_verified_the_product_page() {
        System.out.println("verified the product page");
    }

    @Then("user verified the cart page")
    public void user_verified_the_cart_page() {
        System.out.println("verified the cart page");
    }

    @Then("user verified the payment page")
    public void user_verified_the_payment_page() {
        System.out.println("verified the payment page");
    }

    @Then("user verified the delivery page")
    public void user_verified_the_delivery_page() {
        System.out.println("verified the delivery page");
    }

}
