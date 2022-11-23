package lesson_2.hw_2v2;

public class Main {
    public static void main(String[] args) {
        Papyrus papyrus = new Papyrus(
                "asd",
                345);
        Book book = new Book(
                "asd",
                345,
                new Size(27.5,37.6));
        Magazine magazine = new Magazine(
                "asd",
                345,
                new Size(27.5,37.6),
                27);
        Comics comics = new Comics(
                "asd",
                345,
                new Size(27.5,37.6),
                Company.DC
                );

    }
}
