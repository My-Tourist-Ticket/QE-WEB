package step_definitions;

import io.cucumber.java.en.When;
import org.example.pageObject.EditUserProfileMyttPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class EditUserProfileStepDef {
    private final WebDriver driver = Hooks.driver;

    EditUserProfileMyttPage editUserProfileMyttPage = new EditUserProfileMyttPage(driver);

    @When("User click on image profile")
    public void clickImageProfileButton(){
        editUserProfileMyttPage.clickImageProfile();
    }
    @When("User click on label profile")
    public void clickLabelProfile(){
        editUserProfileMyttPage.clickProfile();
    }
    @When("User click on edit profile button")
    public void clickEditProfileButton(){
        editUserProfileMyttPage.clickEditProfile();
    }
    @When("User click on cancel button")
    public void clickCancelButton(){
        editUserProfileMyttPage.clickCancel();
    }
    @When("User click on edit profile button again")
    public void clickEditProfileButtonAgain(){
        editUserProfileMyttPage.clickEditProfile();
    }
    @When("User input {string} as Full Name")
    public void inputFullNameField(String fullName) {
        editUserProfileMyttPage.inputFullName(fullName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User input {string} as Email")
    public void inputEmailField(String email) {
        editUserProfileMyttPage.inputEmail(email);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User input {string} as Phone Number")
    public void inputPhoneNumberField(String phoneNumber) {
        editUserProfileMyttPage.inputPhoneNumber(phoneNumber);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User input {string} as Password")
    public void inputPasswordField(String pass) {
        editUserProfileMyttPage.inputPassword(pass);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User click on save button")
    public void clickSaveButton(){
        editUserProfileMyttPage.clickSave();
    }
}
