package lesson_5.hw_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("qweqw");
        words.add("wwerty");
        words.add("ewew");
        words.add("rwe");
        words.add("twe");
        words.add("ywe");
        words.add("uwexcz");
        words.add("iwefdv");
        words.add("ow");
        words.add("pwefgd");
        words.add("awefgh");
        words.add("swe");
        words.add("dwetty");
        words.add("fwe");
        words.add("gwe");
        words.add("hwew");
        Collections.sort(words);
        words.stream()
                .filter(s -> s.length() > 4)
                .forEach(System.out::println);
    }
}
