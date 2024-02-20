package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    public static WebDriver webDriver;
    public AccountPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//a[.='Verification Account']")
    private WebElement verifyAccount;
    @FindBy(xpath = "//tbody[@class='[&_tr:last-child]:border-0']/tr[1]//button[1]")
    private WebElement checklist;
    public void clickVerificationAccount(){
        verifyAccount.click();
    }
    public void clickChecklist(){
        checklist.click();
    }
}
