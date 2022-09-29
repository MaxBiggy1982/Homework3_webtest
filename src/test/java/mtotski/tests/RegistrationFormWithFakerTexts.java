package mtotski.tests;

import mtotski.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;

import static mtotski.tests.TestData.*;

public class RegistrationFormWithFakerTexts extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();    @Test
    void fillFormTest() {
        registrationFormPage
                .openPage()
                .setFirstName(firstName1)
                .setLastName(lastName1)
                .setEmail(email1)
                .setGenderWrapper(gender1)
                .setPhoneNumber(number1)
                .setBirthdate(year, month, day)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .uploadPicture(picturePath)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .submit();

        registrationFormPage.checkResultsVisible()
                .checkResult("Student Name", firstName1 + " " + lastName1)
                .checkResult("Student Email", email1)
                .checkResult("Gender", gender1)
                .checkResult("Mobile", number1)
                .checkResult("Date of Birth", day + " " + month + "," + year)
                .checkResult("Subjects", subjects)
                .checkResult("Hobbies", hobbies)
                .checkResult("Picture", picture)
                .checkResult("Address", address)
                .checkResult("State and City", state + " " + city);
    }


    }
