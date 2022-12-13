package lesson_4.hw_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(12,"qweq"));
        users.add(new User(14,"asd"));
        users.add(new User(16,"zxctt"));
        users.add(new User(18,"rtyjgm"));
        users.add(new User(20,"fghgfdsfd"));
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println(users);
        users.sort((o1, o2) -> o2.getAge()- o1.getAge());
        System.out.println(users);
        users.sort(Comparator.comparingInt(o -> o.getName().length()));
        System.out.println(users);
        users.sort((o1, o2) -> o2.getName().length()-o1.getName().length());
        System.out.println(users);


        ArrayList<String> words = new ArrayList<>();
        words.add("qwe");
        words.add("wwe");
        words.add("ewe");
        words.add("rwe");
        words.add("twe");
        words.add("ywe");
        words.add("uwe");
        words.add("iwe");
        words.add("owe");
        words.add("pwe");
        words.add("awe");
        words.add("swe");
        words.add("dwe");
        words.add("fwe");
        words.add("gwe");
        words.add("hwe");
        Collections.sort(words);
        System.out.println(words);
    }
}
