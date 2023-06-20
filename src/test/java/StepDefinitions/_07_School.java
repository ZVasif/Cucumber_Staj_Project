package StepDefinitions;

import Utilites.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_School {
    @And("Click on the element in the Dialog with action")
    public void clickOnTheElementInTheDialogWithAction() {

        WebElement save=GWD.getDriver().findElement(By.xpath("//ms-save-button//button"));

        Actions actions=new Actions(GWD.getDriver());
        Action action=actions.moveToElement(save).doubleClick().build();
        action.perform();

    }
}
