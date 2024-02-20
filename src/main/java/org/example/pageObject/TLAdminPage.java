package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TLAdminPage {
    public static WebDriver webDriver;
    public TLAdminPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//a[.='Transaction List']")
    private WebElement transactionListAdmin;
    @FindBy(xpath = "//li[.='2']")
    private WebElement paginationDua;
    @FindBy(xpath = "//li[.='3']")
    private WebElement paginationTiga;

    public void clickTransactionListAdmin(){
        transactionListAdmin.click();
    }
    public void clickPaginationDua(){
        paginationDua.click();
    }
    public void clickPaginationTiga(){
        paginationTiga.click();
    }

}
