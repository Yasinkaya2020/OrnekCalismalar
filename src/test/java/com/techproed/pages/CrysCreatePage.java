package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrysCreatePage {

    public CrysCreatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Log in")
    public WebElement ilklogin;

    @FindBy(linkText = "/Account/Register")
    public WebElement createLink;

    @FindBy (id = "UserName")
    public WebElement userNameBox;

    @FindBy (id = "Password")
    public WebElement passwordBox;

    @FindBy(id = "Email")
    public WebElement emailBox;

    @FindBy(id = "NameSurname")
    public WebElement fulNameBox;

    @FindBy(id = "PhoneNo")
    public WebElement phoneBox;

    @FindBy(id = "SSN")
    public WebElement ssnBox;

    @FindBy(id = "DrivingLicense")
    public WebElement drivingLiceBox;

    @FindBy(id = "Address")
    public WebElement adressBox;

    @FindBy(id = "WorkingSector")
    public WebElement workingSecBox;












}
