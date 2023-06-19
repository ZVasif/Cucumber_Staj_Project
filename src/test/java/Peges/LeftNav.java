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
    @FindBy(xpath = "(//span[contains(text(),'Setup')])[4]")
    public WebElement setupHumanResourse;
    @FindBy(xpath = "(//span[contains(text(),'Position Categories')])[1]")
    public WebElement positionCategories;
    //*************************** CSP-2 ***************************//
    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    public WebElement attestations;
    //*************************** CSP-3 ***************************//
    @FindBy(xpath = "(//span[text()='Document Types'])[1]")
    private WebElement documentTypes;
    //*************************** CSP-4 ***************************//
    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    private WebElement fields;
    //*************************** CSP-5 ***************************//
    @FindBy(xpath = "//*[text()='Positions']")
    public WebElement position;
    //*************************** CSP-6 ***************************//
    @FindBy(xpath = "//*[text()='Education']")
    private WebElement education;
    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement educationSetup;
    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;
    //*************************** CSP-7 ***************************//
    @FindBy(xpath = "//*[text()='School Setup']")
            private WebElement setupSchool;
    @FindBy(xpath = "//*[text()='Locations']")
            private WebElement locatoins;
    //*************************** CSP-8 ***************************//
    @FindBy(xpath = "//*[text()='Departments']")
            private WebElement departments;
    //**************************  CSP-9    **************************//
    @FindBy (xpath = "    //fuse-nav-vertical-item[@class='ng-tns-c249-8 nav-item ng-star-inserted'][10]//span\n")
    private WebElement bankAccounts;
    //*************************** CSP-10 ***************************//
    @FindBy(xpath = "//*[text()='Grade Levels']")
    private WebElement gradeLevels;
    //*************************** CSP-11 ***************************//
    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    private WebElement discounts;

    WebElement myElement;
    public void findAndClick (String strElement){
        switch (strElement){
            case "setup":myElement=setup;break;
            case "parameters":myElement=parameters;break;
            case "nationalities":myElement=nationalities;break;
            case "humanResources":myElement=humanResources;break;
            case "setupHumanResourse":myElement=setupHumanResourse;break;
            case "positionCategories":myElement=positionCategories;break;
            //*************************** CSP-2 ***************************//
            case "attestations":myElement=attestations;break;
            //*************************** CSP-3 ***************************//
            case "documentTypes":myElement=documentTypes;break;
            //*************************** CSP-4 ***************************//
            case "fields":myElement=fields;break;
            //*************************** CSP-5 ***************************//
            case "position": myElement = position;break;
            //*************************** CSP-6 ***************************//
            case "education":myElement=education;break;
            case "educationSetup":myElement=educationSetup;break;
            case "subjectCategories":myElement=subjectCategories;break;
            //*************************** CSP-7 ***************************//
            case "setupSchool":myElement=setupSchool;break;
            case "locatoins":myElement=locatoins;break;
            //*************************** CSP-8 ***************************//
            case "departments":myElement=departments;break;
            //**************************  CSP-9    **************************//
            case "bankAccounts":myElement=bankAccounts;break;
            //*************************** CSP-10 ***************************//
            case "gradeLevels":myElement=gradeLevels;break;
            //*************************** CSP-11 ***************************//
            case "discounts":myElement=discounts;break;
        }
        clickFunction(myElement);
    }
}
