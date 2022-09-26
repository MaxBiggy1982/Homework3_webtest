package mTotski.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public CalendarComponent setDate(String year, String month, String day) {
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--021").click();
        return this;
    }

     }


