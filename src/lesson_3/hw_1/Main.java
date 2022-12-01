package lesson_3.hw_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Printable> printableList = new ArrayList<>();
        printableList.add(new Book(230,"asd"));
        printableList.add(new Magazine(2000,"qwe"));
        for (Printable printable : printableList) {
            printable.print();
        }


    }
}
