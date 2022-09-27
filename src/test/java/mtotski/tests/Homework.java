package mtotski.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Homework {

    @BeforeAll
    static void setUP() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        $("#firstName").setValue("Maksim");
        $("#lastName").setValue("Tytskiy");
        $("#userEmail").setValue("Tytskiy@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("November");
        $(".react-datepicker__year-select").selectOption("1982");
        $(".react-datepicker__day--021").click();
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
   $(".table-responsive").shouldHave(text("Maksim Tytskiy"),
                text("Tytskiy@gmail.com"),
                 text("Male"),
                  text("1234567890"),
                  text("21 November,1982"),
                  text("Arts"),
                 text("Reading"),
                 text("VTRUKSRPHR.jpg"),
                   text("Tallinn"),
                  text("NCR Gurgaon"));

//        $(".modal-header").shouldHave(text("Thanks for submitting the form"));
//        $(".table").shouldHave(Condition.text("Maksim Tytskiy"));
//        $(".table").shouldHave(Condition.text("Tytskiy@gmail.com"));
//        $(".table").shouldHave(Condition.text("Male"));
//        $(".table").shouldHave(Condition.text("1234567890"));
//        $(".table").shouldHave(Condition.text("21 November,1982"));
//        $(".table").shouldHave(Condition.text("Arts"));
//        $(".table").shouldHave(Condition.text("Reading"));
//        $(".table").shouldHave(Condition.text("VTRUKSRPHR.jpg"));
//        $(".table").shouldHave(Condition.text("Tallinn"));
//        $(".table").shouldHave(Condition.text("NCR Gurgaon"));
        $("#closeLargeModal").click();
    }
}