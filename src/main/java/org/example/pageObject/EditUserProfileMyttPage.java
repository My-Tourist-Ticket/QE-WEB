package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUserProfileMyttPage {
    public static WebDriver webDriver;
    public EditUserProfileMyttPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//img[@src='https://res.cloudinary.com/dxs6vn7i7/image/upload/v1708324945/BE20_MyTouristTicket/k13vjkc15bpaf0kzxcgb.jpg']")
    private WebElement imageProfile;
    @FindBy(xpath = "//div[.='Profile']")
    private WebElement profile;
    @FindBy(xpath = "//button[@class='bg-orange-500 text-white w-32 py-2 rounded-lg mt-3 ']")
    private WebElement editProfile;
    @FindBy(xpath = "//button[@class='w-32 py-2 rounded-md border bg-red-500 text-white']")
    private WebElement cancel;
    @FindBy(xpath = "//input[@name='full_name']")
    private WebElement fullName;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@name='phone_number']")
    private WebElement phoneNumber;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@class='w-32 py-2 rounded-md border bg-sky-500 text-white']")
    private WebElement save;

    public void clickImageProfile(){
        imageProfile.click();
    }
    public void clickProfile(){
        profile.click();
    }
    public void clickEditProfile(){
        editProfile.click();
    }
    public void clickCancel(){
        cancel.click();
    }
    public void inputFullName(String fName){
        fullName.sendKeys(fName);
    }
    public void inputEmail(String mail){
        email.sendKeys(mail);
    }
    public void inputPhoneNumber(String pNumber){
        phoneNumber.sendKeys(pNumber);
    }
    public void inputPassword(String pass){
        password.sendKeys(pass);
    }
    public void clickSave(){
        save.click();
    }
}
