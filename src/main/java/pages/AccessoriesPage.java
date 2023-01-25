package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import providers.RandomIntGenerator;

import java.util.List;

public class AccessoriesPage extends BasePage{
    public AccessoriesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".material-icons.float-xs-right")
    private WebElement sortBy;

    @FindBy(css = ".dropdown-menu a")
    private List<WebElement> sortByOptions;

    @FindBy(css = "material-icons close")
    private List<WebElement> selectedFilters;

    @FindBy(css = "#js-product-list div .product")
    private List<WebElement> products;

    public FiltersPage sortBy(){
       click(sortByOptions.get(RandomIntGenerator.generateRandomInt(sortByOptions.size())));
       waitForLoadedPage(sortBy);
       return new FiltersPage(driver);
    }

    public AccessoriesPage removeFilters(){
        for (WebElement filter:selectedFilters) {
            click(filter);
        }
        return new AccessoriesPage(driver);
    }

    public ProductPage selectRandomProduct(){
        WebElement selectedProduct = products.get(RandomIntGenerator.generateRandomInt(products.size()));
        if(selectedProduct.getText().equals("CUSTOMIZABLE MUG")){

            do{
            selectedProduct = products.get(RandomIntGenerator.generateRandomInt(products.size()));
            }while (selectedProduct.getText().equals("CUSTOMIZABLE MUG"));
        }
        click(selectedProduct);
      return new ProductPage(driver);
    }


}
