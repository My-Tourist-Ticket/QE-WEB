package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddVoucherPage {
    public static WebDriver webDriver;
    public AddVoucherPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//a[.='Add Voucher']")
    private WebElement addVoucher;
    @FindBy(xpath = "//input[@name='name']")
    private WebElement voucherName;
    @FindBy(xpath = "//input[@name='code']")
    private WebElement voucherCode;
    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement description;
    @FindBy(xpath = "//input[@name='discount_value']")
    private WebElement discountValue;
    @FindBy(xpath = "//input[@name='expired_voucher']")
    private WebElement expVoucher;
    @FindBy(xpath = "//button[@class='bg-black hover:bg-gray-700 active:bg-gray-800 rounded-lg text-white w-[500px] p-2 text-[15px]']")
    private WebElement buttonAdd;
    @FindBy(xpath = "//p[@class='py-4 px-3']")
    private WebElement message;
    public void clickAddVoucher(){
        addVoucher.click();
    }
    public void inputVoucherName(String name){
        voucherName.sendKeys(name);
    }
    public void inputVoucherCode(String voucher_code){
        voucherCode.sendKeys(voucher_code);
    }
    public void inputDescription(String Description){
        description.sendKeys(Description);
    }
    public void inputDiscountValue(String discValue){
        discountValue.sendKeys(discValue);
    }
    public void clickExpVoucher(){
        expVoucher.click();
    }
    public void clickButtonAdd(){
        buttonAdd.click();
    }
    public String getMessage(){
        return message.getText();
    }
}
