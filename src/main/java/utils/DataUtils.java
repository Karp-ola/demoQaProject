package utils;

import com.github.javafaker.Faker;

public class DataUtils {
    Faker faker = new Faker();
    public String fullName = faker.name().fullName();
    public String email = faker.internet().emailAddress();
    public String currentAddress = faker.address().fullAddress();
    public String permanentAddress = faker.address().fullAddress();

}
