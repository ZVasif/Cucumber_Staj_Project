package StepDefinitions;


import Peges.DialogContent;
import Peges.FormContect;
import Peges.LeftNav;
import Utilites.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class _02_DataTableSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    FormContect fc=new FormContect();
    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String > listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));

        }
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String > listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));

        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String >> listElement=elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));

        }
    }

    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String > listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.SearchAndDelete(listElement.get(i));

        }
    }

    @And("Click on the element in the Form contect")
    public void clickOnTheElementInTheFormContect(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            fc.findAndClick(listElement.get(i));
        }
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }


}
