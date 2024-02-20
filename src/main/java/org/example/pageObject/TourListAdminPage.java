package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TourListAdminPage {
    public static WebDriver webDriver;
    public TourListAdminPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//a[.='Tour List']")
    private WebElement tourList;
    @FindBy(xpath = "//div[8]/button[@class='absolute top-0 right-0 p-2 z-10']")
    private WebElement titikTiga;
    @FindBy(xpath = "//div[@class='z-50 min-w-[8rem] overflow-hidden rounded-md border bg-popover p-1 text-popover-foreground shadow-md data-[state=open]:animate-in data-[state=closed]:animate-out data-[state=closed]:fade-out-0 data-[state=open]:fade-in-0 data-[state=closed]:zoom-out-95 data-[state=open]:zoom-in-95 data-[side=bottom]:slide-in-from-top-2 data-[side=left]:slide-in-from-right-2 data-[side=right]:slide-in-from-left-2 data-[side=top]:slide-in-from-bottom-2 w-56']/div[.='Delete']")
    private WebElement delete;
    public void clickTourList(){
        tourList.click();
    }
    public void clickTitikTiga(){
        titikTiga.click();
    }
    public void clickDelete(){
        delete.click();
    }

}
