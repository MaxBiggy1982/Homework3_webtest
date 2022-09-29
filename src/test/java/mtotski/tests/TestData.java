package mtotski.tests;

import com.github.javafaker.Faker;
import mtotski.utils.RandomFaker;

import java.util.Locale;

public class TestData{

    private static final Faker faker = new Faker((new Locale("fi-FI")));
    public static String
            firstName1 = faker.name().firstName(),
            lastName1 = faker.name().lastName(),
            email1 = faker.internet().emailAddress(),
            gender1 = faker.demographic().sex(),
            number1 = faker.phoneNumber().subscriberNumber(10),
            day = String.valueOf(faker.number().numberBetween(10, 31)),
            month = RandomFaker.getRandomMonth(),
            year = String.valueOf(faker.number().numberBetween(1900, 2000)),
            subjects = RandomFaker.getRandomSubject(),
            hobbies = RandomFaker.getRandomHobbies(),
            picturePath = "src/test/resources/VTRUKSRPHR.jpg",
            picture = "VTRUKSRPHR.jpg",
            address = faker.address().fullAddress(),
            state = "NCR",
            city = RandomFaker.getRandomCity();
        //    birthday1 = String.valueOf(faker.number().numberBetween(1, 31)),
}

