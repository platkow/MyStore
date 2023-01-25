package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebListener extends AbstractWebDriverEventListener {
    Logger logger = LoggerFactory.getLogger(WebListener.class);

    public void beforeClickOn(WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>> Before clicking on element: " + element.getTagName() + " " + element.getText() + " <<<<<<<<<<<");
    }

    public void afterClickOn(WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>> After clicking on element <<<<<<<<<<<");
    }

    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        logger.info(">>>>>>>>>>> Before changing value of: " + element.getTagName() + " " + element.getText() + " to: " + keysToSend + " <<<<<<<<<<<");
    }

    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        logger.info(">>>>>>>>>>> After changing value of element <<<<<<<<<<<");
    }
}
