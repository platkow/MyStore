package test.tests.env_int;

import models.User;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.CreateAccountPage;
import pages.MenuPage;
import providers.UserFactory;
import test.testbase.TestBase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MyStoreTests extends TestBase {
    Logger logger = LoggerFactory.getLogger("MyStoreTests.class");
    private MenuPage menuPage;
    private CreateAccountPage createAccountPage;
    private User user;

    @BeforeEach
    public void setup(){
        menuPage = new MenuPage(driver);
        createAccountPage = new CreateAccountPage(driver);
        user = new UserFactory().getRandomUserWithBirthDate();
    }

    @Test
    @DisplayName("RegisterNewUser")
    public void shouldRegisterNewUser(){
        logger.info(" ---------- Start test ---------- ");
        menuPage.clickSignIn()
                .createNewAccount()
                .registerNewUser(user);
        String expectedUser = user.getFirstName() + " " + user.getLastName();
        String actualUser = menuPage.getLoggedUser();

        assertThat(expectedUser, equalTo(actualUser));
    }
}
