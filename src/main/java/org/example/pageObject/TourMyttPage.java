package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TourMyttPage {
    public static WebDriver webDriver;
    public TourMyttPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//div[@class='itemscenter flex justify-between']")
    private WebElement titleText;
    @FindBy(xpath = "//button[.='Ticket Regular']")
    private WebElement regularPackage;
    @FindBy(xpath = "//div[.='Sun25 Feb']")
    private WebElement dateChoice;
    @FindBy(xpath = "//input[@class='w-8 text-center outline-none']")
    private WebElement ticketTotalField;
    @FindBy(css = ".lucide-plus-circle")
    private WebElement plusIcon;
    @FindBy(xpath = "//button[@class='bg-blue-500 text-white px-10 py-2 rounded-lg']")
    private WebElement buttonBooking;



    public boolean verifyTitle(){
        return titleText.isDisplayed();
    }
    public void clickRegularPackage(){
        regularPackage.click();
    }
    public void clickDateChoice(){
        dateChoice.click();
    }
    public void clickPlusIcon(int numTimes) {
        for (int i = 0; i < numTimes; i++) {
            plusIcon.click();
        }
    }
    public void clickButtonBooking(){
        buttonBooking.click();
    }
}
