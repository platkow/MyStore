package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HamcrestPage extends BasePage{

    public HamcrestPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#hamcrest-tutorial")
    private WebElement title;

    public String getTitle(){
        return title.getText();
    }
}
