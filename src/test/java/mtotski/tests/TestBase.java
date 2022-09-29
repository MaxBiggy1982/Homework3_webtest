package mtotski.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

//    String firstName = "Maksim",
//            lastName = "Tytskiy",
//            email = "Tytskiy@gmail.com",
//            phone = "1234567890",
//            day = "21",
//            month = "November",
//            year = "1982";


    @BeforeAll

    static void setUP() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }
}

