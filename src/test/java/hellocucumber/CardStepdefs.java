package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hellocucumber.model.Customer;
import hellocucumber.model.Seller;
import org.junit.Assert;

public class CardStepdefs {

    private int price;
    private int minimumLimit = 2;
    Customer maria = new Customer();
    Seller li = new Seller();

    @Given("Maria orders ${int} of coffee from Li")
    public void maria_orders_$_of_coffee_from_Li(Integer coffeePrice) {

        maria.orders();
        this.price = coffeePrice;
    }

    @When("Maria pays with a credit card")
    public void maria_pays_with_a_credit_card() {
        maria.paysWithCard();
    }

    @Then("Li should process the payment")
    public void li_should_process_the_payment() {
        Assert.assertEquals(true, li.processPayment(price,minimumLimit));
    }

    @Then("Li should not process the payment")
    public void li_should_not_process_the_payment() {
        Assert.assertEquals(false, li.processPayment(price,minimumLimit));
    }

}
