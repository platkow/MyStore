package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage{
    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#contact-link")
    private WebElement contactUs;

    @FindBy(css = "#_desktop_user_info")
    private WebElement signIn;

    @FindBy(css = "_desktop_cart")
    private WebElement cart;

    @FindBy(css = ".logo.img-responsive")
    private WebElement logo;

    @FindBy(css = "#category-3")
    private WebElement clothes;

    @FindBy(css = "#category-6")
    private WebElement accessories;

    @FindBy(css = "#category-9")
    private WebElement art;

    @FindBy(css = "input[name='s']")
    private WebElement searchBox;

    @FindBy(css = "button[type='submit']")
    private WebElement searchIcon;

    @FindBy(css = ".account .hidden-sm-down")
    private WebElement loggedUser;

    public SignInPage clickSignIn(){
        click(signIn);
        return new SignInPage(getDriver());
    }

    public String getLoggedUser(){
        waitForElementToBeVisible(driver, loggedUser);
       return loggedUser.getText();
    }
}
