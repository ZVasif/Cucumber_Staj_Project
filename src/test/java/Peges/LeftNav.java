package Peges;

import Utilites.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    //************************** Ortaq locator **************************//
    @FindBy(xpath = "(//*[text()='Setup'])[1]")
    private WebElement setup;

    @FindBy(xpath = "//*[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//*[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    //*************************** CSP-1 ***************************//




    //*************************** CSP-3 ***************************//


    //*************************** CSP-4 ***************************//
    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    private WebElement fields;



    //*************************** CSP-5 ***************************//



    //*************************** CSP-7 ***************************//
    @FindBy(xpath = "//*[text()='School Setup']")
            private WebElement setupSchool;
    @FindBy(xpath = "//*[text()='Locations']")
            private WebElement locatoins;

    //*************************** CSP-8 ***************************//
    @FindBy(xpath = "//*[text()='Departments']")
            private WebElement departments;



    //*************************** CSP-9 ***************************//






    WebElement myElement;
    public void findAndClick (String strElement){
        switch (strElement){
            case "setup":myElement=setup;break;
            case "parameters":myElement=parameters;break;
            case "nationalities":myElement=nationalities;break;
            case "humanResources":myElement=humanResources;break;
            case "fields":myElement=fields;break;

            //*************************** CSP-7 ***************************//
            case "setupSchool":myElement=setupSchool;break;
            case "locatoins":myElement=locatoins;break;
            //*************************** CSP-8 ***************************//
            case "departments":myElement=departments;break;
        }
        clickFunction(myElement);
    }
}
