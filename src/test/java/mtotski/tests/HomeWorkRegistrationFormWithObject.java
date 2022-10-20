package mtotski.tests;

import com.codeborne.selenide.Configuration;
import mtotski.pages.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HomeWorkRegistrationFormWithObject {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @BeforeAll
    static void setUP() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        registrationFormPage
                .openPage()
                .setFirstName("Maksim")
                .setLastName("Tytskiy")
                .setEmail("Tytskiy@gmail.com")
                .setGenderWrapper("Male")
                .setPhoneNumber("1234567890")
                .setBirthdate("1982", "November", "21")
                .setSubjects("Arts")
                .setHobbies("Reading")
                .uploadPicture("src/test/resources/VTRUKSRPHR.jpg")
                .setAddress("Tallinn")
                .setState("NCR")
                .setCity("Gurgaon")
                .submit()

                .checkResultsVisible()
                .checkResult("Student Name", "Maksim Tytskiy")
                .checkResult("Student Email", "Tytskiy@gmail.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "1234567890")
                .checkResult("Date of Birth", "21 November,1982")
                .checkResult("Subjects", "Arts")
                .checkResult("Hobbies", "Reading")
                .checkResult("Address", "Tallinn")
                .checkResult("State and City", "NCR Gurgaon")
        ;


    }
}
