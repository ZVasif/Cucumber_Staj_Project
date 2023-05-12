package StepDefinitions;
import Peges.DialogContent;
import Utilites.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
        // https://demo.mersys.io/

    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.findAndSend("username","turkeyts"); //richfield.edu
        dc.findAndSend("password","TechnoStudy123"); //Richfield2020!
        dc.findAndClick("loginButton");
        //dc.findAndClick("acceptCookies");


    }

    @Then("User sholud login successfuly")
    public void userSholudLoginSuccessfuly() {

        dc.findAndContainsText("dahsboard","Dashboard");
    }
}

