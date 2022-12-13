package lesson_4.hw_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Skills> skills = new ArrayList<>();
        skills.add(new Skills("java", 10));
        skills.add(new Skills("js", 12));
        skills.add(new Skills("c++", 8));
        HashSet<User> userHashSet = new HashSet<>();
        userHashSet.add(new User(1, "vasya", "pupkin", "qwed@.com", 31, Gender.MALE, skills, new Car(Model.TOYOTA, 2021, 250)));
        userHashSet.add(new User(2, "masha", "qweer", "qwed@.com", 24, Gender.FEMALE, skills, new Car(Model.AUDI, 2020, 350)));
        userHashSet.add(new User(3, "petya", "asd", "qwed@.com", 35, Gender.MALE, skills, new Car(Model.BMW, 2022, 250)));
        userHashSet.add(new User(4, "marina", "zxcqwe", "qwed@.com", 19, Gender.FEMALE, skills, new Car(Model.TOYOTA, 2019, 150)));
        Iterator<User> iterator = userHashSet.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getGender().equals(Gender.MALE)) {
                iterator.remove();
            }
        }
    }

}

