package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FiltersPage extends BasePage{
    private Logger logger = LoggerFactory.getLogger("FiltersPage.class");
    public FiltersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#facet_input_67201_0")
    private WebElement categoriesHomeAccessories;

    @FindBy(css = "#facet_input_30998_0")
    private WebElement availabilityAvailable;

    @FindBy(css = "#slider-range_75617")
    private WebElement price;

    @FindBy(css = "#facet_label_84348")
    private WebElement priceLabel;

    public FiltersPage selectHomeAccessories(){
        selectCbx(categoriesHomeAccessories);
        return new FiltersPage(driver);
    }

    public AccessoriesPage selectAvailable(){
        selectCbx(availabilityAvailable);
        return new AccessoriesPage(driver);
    }

    //dokoncz
    public AccessoriesPage changePrice(){
        String startPrice = priceLabel.getText();
        price.sendKeys(Keys.ARROW_RIGHT);
        String endPrice = priceLabel.getText();

        if(!startPrice.equals(endPrice)){

        }
        return new AccessoriesPage(driver);
    }
}
