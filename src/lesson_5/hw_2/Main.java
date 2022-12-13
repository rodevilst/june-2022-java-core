package lesson_5.hw_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,10,432,425342,123,50,63,57,87,49,2,4546,564,97,23,123,323);
        integers.stream()
                .distinct()
                .sorted()
                .map(integer -> integer * 3)
//                .filter(integer -> integer % 10 == 0)
//                .filter(integer -> integer % 3 == 0) кратность к 3
                .forEach(System.out::println);





    }
}
