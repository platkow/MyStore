package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".col-md-6 input[name='email']")
    private WebElement email;

    @FindBy(css = "input[name='password']")
    private WebElement password;

    @FindBy(css = "submit-login")
    private WebElement signInBtn;

    @FindBy(css = ".no-account a")
    private WebElement createAccount;

    public CreateAccountPage createNewAccount(){
        click(createAccount);
        return new CreateAccountPage(getDriver());
    }
}
