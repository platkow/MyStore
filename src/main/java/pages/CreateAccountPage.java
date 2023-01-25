package pages;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import providers.RandomIntGenerator;

import java.util.List;

public class CreateAccountPage extends BasePage{

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name=id_gender]")
    private List<WebElement> socialTitle;

    @FindBy(css = "input[name=firstname]")
    private WebElement firstName;

    @FindBy(css = "input[name=lastname]")
    private WebElement lastName;

    @FindBy(css = "input[name=email]")
    private WebElement email;

    @FindBy(css = "input[name=password]")
    private WebElement password;

    @FindBy(css = "input[name=birthday]")
    private WebElement birthDate;

    @FindBy(css = "input[name=optin]")
    private WebElement offersFromPartnersCbx;

    @FindBy(css = "input[name=customer_privacy]")
    private WebElement dataPrivacyCbx;

    @FindBy(css = "input[name=newsletter]")
    private WebElement newsletterCbx;

    @FindBy(css = "input[name=psgdpr]")
    private WebElement overallConditionsCbx;

    @FindBy(css = ".btn.btn-primary.form-control-submit.float-xs-right")
    private WebElement save;

    public MenuPage registerNewUser(User user) {
        socialTitle.get(RandomIntGenerator.generateRandomInt(socialTitle.size())).click();
        sendKeys(firstName, user.getFirstName());
        sendKeys(lastName, user.getLastName());
        sendKeys(email, user.getEmail());
        sendKeys(password, user.getPassword());
        sendKeys(birthDate, user.getDateOfBirthMMddYYYY());
        selectCbx(offersFromPartnersCbx);
        selectCbx(dataPrivacyCbx);
        selectCbx(newsletterCbx);
        selectCbx(overallConditionsCbx);
        click(save);
        return new MenuPage(driver);
    }

}
