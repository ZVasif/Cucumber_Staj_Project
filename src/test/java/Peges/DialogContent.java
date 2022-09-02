package Peges;

import Utilites.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    //************************** Login **************************//
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id ="mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dahsboard;

    //**************************      **************************//

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addBTN;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement code;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement save;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement sucses;
    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;
    @FindBy(css = "[aria-label='Close']")
    private WebElement closeDialog;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//mat-form-field[contains(@class,'mat-form-field')]//input")
    private WebElement searchBox;
    @FindBy(xpath = "//ms-search-button//button")
            private WebElement searchBTN;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
            private WebElement deletebutton;
    @FindBy(xpath = "//*[text()=' Delete ']")
            private WebElement deleteDialogbutton;
    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'INTEGRATION_CODE')]//input")
    private WebElement integrationCode;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priority;
    @FindBy(xpath = "//*[text()='Campus School']")
    private WebElement mainPage;

    //**************************  CSP-4    **************************//

    @FindBy(xpath = "//ms-add-button[@tooltip='GENERAL.BUTTON.ADD']//div//button")
    private WebElement addButton2;







    WebElement myElement;
    public void findAndSend (String strElement,String value){
       switch (strElement){
           case "username":myElement=username;break;
           case "password":myElement=password;break;
           case "nameInput":myElement=nameInput;break;
           case "code":myElement=code;break;
           case "shortName":myElement=shortName;break;
           case "searchBox":myElement=searchBox;break;
           case "integrationCode":myElement=integrationCode;break;
           case "priority":myElement=priority;break;
       }


        sendKeysFunction(myElement,value);

    }


    public void findAndClick (String strElement){
        switch (strElement){
            case "loginButton":myElement=loginButton;break;
            case "acceptCookies":myElement=acceptCookies;break;
            case "addBTN":myElement=addBTN;break;
            case "save":myElement=save;break;
            case "closeDialog":myElement=closeDialog;break;
            case "searchBTN":myElement=searchBTN;break;
            case "deletebutton":myElement=deletebutton;break;
            case "deleteDialogbutton":myElement=deleteDialogbutton;break;
            case "mainPage":myElement=mainPage;break;

            case "addButton2":myElement=addButton2;break;


        }
        clickFunction(myElement);
    }


    public void findAndContainsText (String strElement,String text){
        switch (strElement){
            case "dahsboard":myElement=dahsboard;break;
            case "sucses":myElement=sucses;break;
            case "alreadyExist":myElement=alreadyExist;break;


        }
        verifyContainsText(myElement,text);
    }

    public void SearchAndDelete(String searchText){
        findAndSend("searchBox",searchText);
        findAndClick("searchBTN");

       // WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.stalenessOf(deleteBTN));

        waitUntilLoading();
        findAndClick("deletebutton");
        findAndClick("deleteDialogbutton");

    }

}
