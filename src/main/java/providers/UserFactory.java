package providers;

import models.User;

public class UserFactory {
    RandomStringGenerator rndString = new RandomStringGenerator();
    public User getRandomUserWithBirthDate(){
        return new User.Builder()
                .socialTitle(RandomIntGenerator.generateRandomInt(1))
                .firstName(rndString.generateRandomString(6))
                .lastName(rndString.generateRandomString(7))
                .email(rndString.generateRandomEmail(4))
                .password(rndString.generateRandomString(7))
                .dayOfBirth(RandomIntGenerator.generateRandomInt(29))
                .monthOfBirth(RandomIntGenerator.generateRandomInt(12))
                .yearOfBirth(RandomIntGenerator.generateRandomInt(1950, 2023))
                .build();
    }

    public  User gerAlreadyRegisteredUser(){
        return new User("kowalskijohnIowa@domain.com", "Truskawka");
    }


}
