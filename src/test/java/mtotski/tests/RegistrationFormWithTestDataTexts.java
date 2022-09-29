package mtotski.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormWithTestDataTexts extends TestBase {
    String firstName = "Maksim",
            lastName = "Tytskiy",
            email = "Tytskiy@gmail.com",
            phone = "1234567890",
            day = "21",
            month = "November",
            year = "1982";


    @Test
    void fillFormTest() {
               open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue(phone);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0"+ day).click();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#currentAddress").setValue("Tallinn");
        $(byText("Select State")).click();
        $(byText("NCR")).click();
        $(byText("Select City")).click();
        $(byText("Gurgaon")).click();
        $("#uploadPicture").uploadFromClasspath("VTRUKSRPHR.jpg");
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName),
                text(lastName),
                text(email),
                text("Male"),
                text(phone),
                text(day + "," + month +" " + year),
                text("Arts"),
                text("Reading"),
                text("VTRUKSRPHR.jpg"),
                text("Tallinn"),
                text("NCR Gurgaon"));

        $("#closeLargeModal").click();
    }
}