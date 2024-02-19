package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPackagePengelolaMyttPage {
    public static WebDriver webDriver;
    public AddPackagePengelolaMyttPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//img[@src='https://res.cloudinary.com/dxs6vn7i7/image/upload/v1708358243/BE20_MyTouristTicket/d4wi1vg4l6mpdq57ew5l.jpg']")
    private WebElement imageTour;
    @FindBy(xpath = "//button[@class='bg-black rounded-lg px-4 py-2 mt-4 font-semibold text-white']")
    private WebElement addPackageButton;
    @FindBy(xpath = "//input[@name='package_name']")
    private WebElement packageName;
    @FindBy(xpath = "//button[@class='bg-black text-white p-2 text-sm px-4 rounded-md']")
    private WebElement addServicesButton;
    @FindBy(xpath = "//div[@class='flex gap-3']/input[@class='flex h-10 w-full rounded-md bg-white px-3 py-2 text-sm ring-offset-white file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-slate-500 focus-visible:outline-none focus-visible:ring-slate-950 focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 dark:border-slate-800 dark:bg-slate-950 dark:ring-offset-slate-950 dark:placeholder:text-slate-400 dark:focus-visible:ring-slate-300 border border-black focus-visible:ring-0']")
    private WebElement servicesList1;
    @FindBy(xpath = "//div[@class='flex flex-col space-y-8']/div[2]//input[@class='flex h-10 w-full rounded-md bg-white px-3 py-2 text-sm ring-offset-white file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-slate-500 focus-visible:outline-none focus-visible:ring-slate-950 focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 dark:border-slate-800 dark:bg-slate-950 dark:ring-offset-slate-950 dark:placeholder:text-slate-400 dark:focus-visible:ring-slate-300 border border-black focus-visible:ring-0']")
    private WebElement servicesList2;
    @FindBy(xpath = "//div[@class='flex flex-col space-y-8']/div[1]//button[@class='bg-red-500 text-white p-2 text-sm px-4 rounded-md']")
    private WebElement removeServicesList1;
    @FindBy(xpath = "//input[@name='jumlah_tiket']")
    private WebElement jumlahTiket;
    @FindBy(xpath = "//input[@name='price']")
    private WebElement priceField;
    @FindBy(xpath = "//button[@class='bg-black rounded-lg text-white w-[500px] p-2']")
    private WebElement buttonSubmit;

    public void clickImageTour(){
        imageTour.click();
    }
    public void clickAddPackageButton(){
        addPackageButton.click();
    }
    public void inputPackageName(String pName){
        packageName.sendKeys(pName);
    }
    public void clickAddServicesButton(){
        addServicesButton.click();
    }
    public void inputServicesList1(String services1){
        servicesList1.sendKeys(services1);
    }
    public void inputServicesList2(String services2){
        servicesList2.sendKeys(services2);
    }
    public void clickRemoveServicesList1(){
        removeServicesList1.click();
    }
    public void inputJumlahTiket(String jumket){
        jumlahTiket.sendKeys(jumket);
    }
    public void inputPrice(String price){
        priceField.sendKeys(price);
    }
    public void clickButtonSubmit(){
        buttonSubmit.click();
    }
}
