package org.example.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeMyttPage {
    public static WebDriver webDriver;
    public HomeMyttPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//div[@class='flex justify-between items-center gap-x-10 w-full sticky top-0 z-50 bg-transparent transition-background duration-500 ease-in-out px-10']/img[@src='/assets/logo1-CvtGyCwG.png']")
    private WebElement logoWebsite;
    @FindBy(xpath = "//button[@class='bg-red-500 w-32 text-white px-5 py-2 rounded-full']")
    private WebElement signUpButton;
    @FindBy(xpath = "//img[@src='https://res.cloudinary.com/dxs6vn7i7/image/upload/v1708166114/BE20_MyTouristTicket/sbpxkfdrjumg8ubt7oqd.jpg']")
    private WebElement baliImage;
    @FindBy(xpath = "//div[@class='flex justify-between items-center gap-x-10 w-full sticky top-0 z-50 bg-transparent transition-background duration-500 ease-in-out px-10']")
    private WebElement layoutHeader;
    @FindBy(xpath = "//div[@class='container border-slate-300 border rounded-lg ']")
    private WebElement topPickTourist;
    @FindBy(xpath = "//div[@class='container border-slate-300 border my-6 rounded-lg']")
    private WebElement cityList;
    @FindBy(xpath = "//div[@class='flex items-center justify-between container p-6 h-full']")
    private WebElement layoutFooter;
    @FindBy(xpath = "//input[@class='px-5 py-1 outline-none border-none bg-transparent text-zinc-800 w-full']")
    private WebElement searchField;
    public boolean verifyLogoMytt(){
        return logoWebsite.isDisplayed();
    }
    public boolean verifyLayoutHeader(){
        return layoutHeader.isDisplayed();
    }
    public boolean verifyTopPickTourist(){
        return topPickTourist.isDisplayed();
    }
    public boolean verifyCityList(){
        return cityList.isDisplayed();
    }
    public boolean verifyLayoutFooter(){
        return layoutFooter.isDisplayed();
    }
    public void clickSignUpButton(){
        signUpButton.click();
    }
    public void clickBaliImage(){
        baliImage.click();
    }
    public void inputSearchField(String search){
        searchField.sendKeys(search);
    }
    public void enterSearchField(){
        searchField.sendKeys(Keys.ENTER);
    }
}
