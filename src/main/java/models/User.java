package models;

public class User {

    private int socialTitle;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public User(int socialTitle, String firstName, String lastName, String email, String password, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.socialTitle = socialTitle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getSocialTitle() {
        return socialTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getDateOfBirthMMddYYYY(){
        return String.valueOf(getMonthOfBirth()) + "/" + String.valueOf(getDayOfBirth()) + "/" + String.valueOf(getYearOfBirth());
    }

    public static final class Builder{
        private int socialTitle;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private int dayOfBirth;
        private int monthOfBirth;
        private int yearOfBirth;

        public Builder socialTitle(int socialTitle){
            this.socialTitle = socialTitle;
            return this;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder dayOfBirth(int dayOfBirth){
            this.dayOfBirth = dayOfBirth;
            return this;
        }

        public Builder monthOfBirth(int monthOfBirth){
            this.monthOfBirth = monthOfBirth;
            return this;
        }

        public Builder yearOfBirth(int yearOfBirth){
            this.yearOfBirth = yearOfBirth;
            return this;
        }

        public User build(){
            if (firstName.isEmpty()) {
                throw new IllegalStateException("First name cannot be empty.");
            }

            if (lastName.isEmpty()) {
                throw new IllegalStateException("Last name cannot be empty.");
            }

            if (email.isEmpty()) {
                throw new IllegalStateException("Email cannot be empty.");
            }

            if (password.isEmpty()) {
                throw new IllegalStateException("Password cannot be empty.");
            }

            if (String.valueOf(dayOfBirth).isEmpty()) {
                throw new IllegalStateException("Day of birth cannot be empty.");
            }

            if (String.valueOf(monthOfBirth).isEmpty()) {
                throw new IllegalStateException("Month of birth cannot be empty.");
            }

            if (String.valueOf(yearOfBirth).isEmpty()) {
                throw new IllegalStateException("Year of birth cannot be empty.");
            }

            return new User(socialTitle, firstName, lastName, email, password, dayOfBirth, monthOfBirth, yearOfBirth);
        }
    }
}
