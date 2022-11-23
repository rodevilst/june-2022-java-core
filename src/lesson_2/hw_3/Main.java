package lesson_2.hw_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "vasya",
                "pupkin",
                "asd@gmail.com",
                31,
                Gender.MALE,
                Arrays.asList(new Skills("java",10),new Skills("js",8)),
                new Car(Model.AUDI,2019,250));
    }
}
