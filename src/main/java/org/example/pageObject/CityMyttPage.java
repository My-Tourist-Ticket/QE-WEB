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
    @FindBy(xpath = "//img[@src='https://res.cloudinary.com/dxs6vn7i7/image/upload/v1708166643/BE20_MyTouristTicket/gxklb1m4mshv6vfsqijm.jpg']")
    private WebElement cityImage;
    public boolean verifyDescription(){
        return descText.isDisplayed();
    }
    public boolean verifyCityImage(){
        return cityImage.isDisplayed();
    }
    public void clickTourImage(){
        tourImage.click();
    }

}
