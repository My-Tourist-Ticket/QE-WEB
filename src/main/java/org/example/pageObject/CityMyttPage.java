package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CityMyttPage {
    public static WebDriver webDriver;
    public CityMyttPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//p[2]")
    private WebElement descText;
    @FindBy(xpath = "//a[@href='/tour/46']")
    private WebElement tourImage;
    public boolean verifyDescription(){
        return descText.isDisplayed();
    }
    public void clickTourImage(){
        tourImage.click();
    }

}
