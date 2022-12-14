package mtotski.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFaker {
    public static String getRandomMonth() {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

        return months.get(new Random().nextInt(months.size()));
    }

    public static String getRandomSubject() {
        List<String> subject = Arrays.asList("Arts", "Math", "English", "Hindi", "Computer Science");

        return subject.get(new Random().nextInt(subject.size()));
    }

    public static String getRandomHobbies() {
        List<String> hobbies = Arrays.asList("Sports", "Reading", "Music");

        return hobbies.get(new Random().nextInt(hobbies.size()));
    }

    public static String getRandomCity() {
        List<String> state = Arrays.asList("Delhi", "Gurgaon", "Noida");

        return state.get(new Random().nextInt(state.size()));
    }

}

