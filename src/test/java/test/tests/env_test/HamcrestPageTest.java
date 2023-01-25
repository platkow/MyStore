package test.tests.env_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.HamcrestPage;
import test.testbase.TestBase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HamcrestPageTest extends TestBase {
    Logger logger = LoggerFactory.getLogger("HamcrestPageTest.class");
    private HamcrestPage hamcrestPage = new HamcrestPage(driver);

    @Test
    @DisplayName("Hamcrest main page title check")
    public void shouldCheckTitle(){
        logger.info("---------- Test start ----------");
        String actualTitle = System.getProperty("eTitle");
        String expectedTitle = hamcrestPage.getTitle();

        assertThat(actualTitle, equalTo(expectedTitle));

    }
}
