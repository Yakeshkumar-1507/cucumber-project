package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DatatableSteps {


    @When("user enter {string} and {string}")
    public void user_enter_and(String username, String password, io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<Map<String,String>> datas =dataTable.asMaps(String.class, String.class);
        System.out.println(datas.size());

        System.out.println(datas.get(0).get("username"));
        System.out.println(datas.get(0).get("password"));

        System.out.println(datas.get(1).get("username"));
        System.out.println(datas.get(1).get("password"));
    }
    @Then("verify the username as expected")
    public void verify_the_username_as_expected() {
        System.out.println("verify the username as expected");
    }

    @When("user enter product list")
    public void user_enter_product_list(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
         java.util.List<String> productList=dataTable.asList(String.class);
         System.out.println(productList.get(1));
    }
    @Then("products are added to List")
    public void products_are_added_to_list() {
        System.out.println("products are added to List");
    }
}
