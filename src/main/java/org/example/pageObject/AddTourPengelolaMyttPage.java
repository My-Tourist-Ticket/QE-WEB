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
