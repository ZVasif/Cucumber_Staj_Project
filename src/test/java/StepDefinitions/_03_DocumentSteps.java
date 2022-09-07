package StepDefinitions;

import io.cucumber.java.en.And;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _03_DocumentSteps {
    @And("Click on the element with Robot")
    public void clickOnTheElementWithRobot() throws AWTException {
        Robot rbt=new Robot();
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
    }
}
