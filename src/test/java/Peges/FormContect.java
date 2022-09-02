package Peges;

import Utilites.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContect extends Parent {
    public FormContect() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='Academic Period'])[1]")
    private WebElement academicPeriod;
    @FindBy(xpath = "//*[text()=' 2021-2022 ']")
            private WebElement academicSelect;
    @FindBy(xpath = "(//*[text()='Grade Level'])[1]")
    private WebElement gradeLevel;
    @FindBy (xpath = "(//*[@class='mat-option-text'])[4]")
    private WebElement gradeSelect;
    @FindBy(xpath = "(//mat-toolbar//button)[2]")
            private WebElement returnExam;

    //*********************** Human Resource -> employee **************************//
    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement fistName;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastName;
    @FindBy(xpath = "(//mat-select[contains(@class,'mat-select')]//span)[1]")
    private WebElement gender;
    @FindBy(xpath = "(//mat-option[contains(@class,'mat-option')]//span)[2]")
    private WebElement male;
    @FindBy(xpath = "//mat-select[@formcontrolname='types']//span")
    private WebElement employeeType;
    @FindBy(xpath = "//*[text()=' Supervisor ']")
    private WebElement typeSupervizor;
    @FindBy(xpath = "(//mat-form-field[contains(@class,'mat-form-field')]//input)[6]")
    private WebElement empyoleeID;
    @FindBy(xpath = "//mat-select[@formcontrolname='qualification']//span")
    private WebElement qualification;
    @FindBy(xpath = "//*[text()=' Master ']")
    private WebElement qualif_Master;
    @FindBy(xpath = "//mat-select[@formcontrolname='type']//span")
    private WebElement documentType;
    @FindBy(xpath = "//*[text()=' Passport ']")
    private WebElement document;
    @FindBy(xpath = "//mat-form-field[@formgroupname='documentInfo']//input")
    private WebElement documentNumber;
    @FindBy(xpath = "(//mat-form-field[@formgroupname='documentInfo']//input)[2]")
    private WebElement personalID;
    @FindBy(xpath = "//mat-chip-list[contains(@class,'mat-chip-list')]//input")
    private WebElement school;
    @FindBy(xpath = "//*[text()='Contact & Address']")
    private WebElement contAddress;
    @FindBy(xpath = "//auto-complete-country")
    private WebElement country;
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.FIRST_NAME']//input")
    private WebElement fistNameDelete;

    //***********************            **************************//



    WebElement myElement;

    public void findAndClick (String strElement){
        switch (strElement){
            case "academicPeriod":myElement=academicPeriod;break;
            case "academicSelect":myElement=academicSelect;break;
            case "gradeLevel":myElement=gradeLevel;break;
            case "gradeSelect":myElement=gradeSelect;break;
            case "returnExam":myElement=returnExam;break;

            case "gender":myElement=gender;break;
            case "male":myElement=male;break;
            case "employeeType":myElement=employeeType;break;
            case "typeSupervizor":myElement=typeSupervizor;break;
            case "qualification":myElement=qualification;break;
            case "qualif_Master":myElement=qualif_Master;break;
            case "documentType":myElement=documentType;break;
            case "document":myElement=document;break;
            case "contAddress":myElement=contAddress;break;
            case "country":myElement=country;break;

        }
        clickFunction(myElement);
    }

    public void findAndSend(String strelement,String value){
        switch (strelement){
            case "fistName":myElement=fistName;break;
            case "lastName":myElement=lastName;break;
            case "empyoleeID":myElement=empyoleeID;break;
            case "documentNumber":myElement=documentNumber;break;
            case "personalID":myElement=personalID;break;
            case "school":myElement=school;break;
            case "country":myElement=country;break;
            case "fistNameDelete":myElement=fistNameDelete;break;

        }
        sendKeysFunction(myElement,value);
    }



}
