package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public static WebDriver webDriver;
    public DashboardPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//a[.='Dashboard']")
    private WebElement Dashboard;
    @FindBy(xpath = "//a[@href='/admin-tour/46']/div[@class='rounded-lg bg-white text-slate-950 dark:border-slate-800 dark:bg-slate-950 dark:text-slate-50 w-[180px]']")
    private WebElement topTour;
    @FindBy(xpath = "//button[@id='radix-:rb:']")
    private WebElement ticketRegular;
    @FindBy(xpath = "//button[@id='radix-:rd:']")
    private WebElement familyBundling;
    @FindBy(xpath = "//button[@id='radix-:rf:']")
    private WebElement happyBudling;
    public boolean verifyDashboard(){
        return Dashboard.isDisplayed();
    }
    public void clickTopTour(){
        topTour.click();
    }
    public void clickTicketRegular(){
        ticketRegular.click();
    }
    public void clickFamilyBundling(){
        familyBundling.click();
    }
    public void clickHappyBundling(){
        happyBudling.click();
    }
}
