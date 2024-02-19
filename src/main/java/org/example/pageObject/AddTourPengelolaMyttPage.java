package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class AddTourPengelolaMyttPage {
    public static WebDriver webDriver;
    public AddTourPengelolaMyttPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

//    @FindBy(xpath = "//div[@class='flex justify-between items-center gap-x-10 w-full sticky top-0 z-50 bg-transparent transition-background duration-500 ease-in-out px-10']/img[@src='/assets/logo1-CvtGyCwG.png']")
//    private WebElement logoWebsiteMT;
//    @FindBy(xpath = "//button[@class='bg-red-500 w-32 text-white px-5 py-2 rounded-full']")
//    private WebElement signUpButtonMT;
//    @FindBy(xpath = "//a[.='Log in']")
//    private WebElement loginTextMT;
//    @FindBy(xpath = "//input[@name='email']")
//    private WebElement emailFieldMT;
//    @FindBy(xpath = "//input[@name='password']")
//    private WebElement passwordFieldMT;
//    @FindBy(xpath = "//button[@class='w-full py-3 rounded-md bg-red-500 text-white ']")
//    private WebElement loginButtonMT;

    //===============================================MyTour Pengelola===============================================//

    @FindBy(xpath = "//a[.='My Tour']")
    private WebElement buttonLabelMyTour;
    @FindBy(xpath = "//button[@class='bg-slate-900 text-white w-32 py-2 rounded-lg mt-3 ']")
    private WebElement buttonAddTour;
    @FindBy(xpath = "//p[@class='text-md text-slate-500 font-semi-bold']")
    private WebElement backToMyTour;
    @FindBy(xpath = "//input[@name='tour_name']")
    private WebElement tourNameField;
    @FindBy(xpath = "//select[@id='city']")
    private WebElement chooseCityButtonField;
    @FindBy(xpath = "//option[.='Bogor']")
    private WebElement optionSelectCity;
    @FindBy(xpath = "//input[@class='p-2 w-full outline-none']")
    private WebElement searchLocationField;
    @FindBy(xpath = "//button[@class='p-2 bg-slate-500 text-white']")
    private WebElement searchLocationButton;
    @FindBy(xpath = "//span[.='+']")
    private WebElement zoomInMap;
    @FindBy(xpath = "//span[.='−']")
    private WebElement zoomOutMap;
    @FindBy(xpath = "//input[@name='address']")
    private WebElement addressField;
    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement descriptionField;
    @FindBy(xpath = "//input[@name='thumbnail']")
    private WebElement uploadThumbnail;
    @FindBy(xpath = "//input[@name='image']")
    private WebElement uploadImage;
    @FindBy(xpath = "//button[@class='flex justify-center items-center bg-black rounded-lg text-white w-full p-2']")
    private WebElement buttonAddNewTour;

//    public boolean verifyLogoMyttMT(){
//        return logoWebsiteMT.isDisplayed();
//    }
//    public void clickSignUpButtonMT(){
//        signUpButtonMT.click();
//    }
//    public void clickLoginTextMT(){
//        loginTextMT.click();
//    }
//    public void inputEmailFieldMT(String email){
//        emailFieldMT.sendKeys(email);
//    }
//    public void inputPasswordFieldMT(String password){
//        passwordFieldMT.sendKeys(password);
//    }
//    public void clickLoginButtonMT(){
//        loginButtonMT.click();
//    }

    //===============================================MyTour Pengelola===============================================//

    public void clickButtonLabelMyTour(){
        buttonLabelMyTour.click();
    }
    public void clickButtonAddTour(){
        buttonAddTour.click();
    }
    public void clickButtonBackToMyTour(){
        backToMyTour.click();
    }
    public void inputTourNameField(String name){
        tourNameField.sendKeys(name);
    }
    public void selectChooseCityButtonField(){
        chooseCityButtonField.click();
    }
    public void chooseOptionSelectCity(){
        optionSelectCity.click();
    }
    public void inputSearchLocationField(String searchLocation){
        searchLocationField.sendKeys(searchLocation);
    }
    public void clickSearchLocationButton(){
        searchLocationButton.click();
    }
    public void clickZoomInMap(){
        zoomInMap.click();
    }
    public void clickZoomOutMap(){
        zoomOutMap.click();
    }
    public void inputAddressField(String address){
        addressField.sendKeys(address);
    }
    public void inputDescriptionField(String desc){
        descriptionField.sendKeys(desc);
    }
    public void sendUploadThumbnail(File image){
        String thumbnailU = image.getName();
        String directoryPath = "E:/capstone_project/QE-WEB/src/test/resources/image/";
        uploadThumbnail.sendKeys(directoryPath + thumbnailU);
    }
    public void sendUploadImage(File image){
        String imageU = image.getName();
        String directoryPath = "E:/capstone_project/QE-WEB/src/test/resources/image/";
        uploadImage.sendKeys(directoryPath + imageU);
    }
    public void clickButtonAddNewTour(){
        buttonAddNewTour.click();
    }
}
