package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMyttPage {
    public static WebDriver webDriver;
    public LoginMyttPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//div[@class='flex justify-between items-center gap-x-10 w-full sticky top-0 z-50 bg-transparent transition-background duration-500 ease-in-out px-10']/img[@src='data:image/png;base64,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']")
    private WebElement logoWebsite;
    @FindBy(xpath = "//button[@class='bg-red-500 w-32 text-white px-5 py-2 rounded-full']")
    private WebElement signUpButton;
    @FindBy(xpath = "//img[@alt='logo-brand']")
    private WebElement logoBrand;
    @FindBy(xpath = "//a[.='Log in']")
    private WebElement loginText;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@class='w-full md:w-1/3 py-3 rounded-md bg-red-500 text-white ']")
    private WebElement loginButton;

    public boolean verifyLogoMytt(){
        return logoWebsite.isDisplayed();
    }
    public void clickSignUpButton(){
        signUpButton.click();
    }
    public boolean verifyLogoBrand(){
        return logoBrand.isDisplayed();
    }
    public void clickLoginText(){
        loginText.click();
    }
    public void inputEmailField(String email){
        emailField.sendKeys(email);
    }
    public void inputPasswordField(String password){
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }


}
