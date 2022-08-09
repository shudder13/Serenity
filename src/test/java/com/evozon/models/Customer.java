package com.evozon.models;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public class Customer {
    private String firstName;
    private String middleName;
    private String lastName;

    private String fullName;
    private String email;
    private String password;
    private String confirmPassword;

    public Customer(String firstName, String middleName, String lastName, String email, String password, String confirmPassword) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public Customer() {
        Faker faker = new Faker();
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());

        this.firstName = faker.name().firstName();
        this.middleName = "";
        this.lastName = faker.name().lastName();
        this.fullName = this.firstName + " " + this.lastName;
        this.email = fakeValuesService.bothify("????????????##@gmail.com");
        this.password = faker.lorem().characters(8, 16);
        this.confirmPassword = this.password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
