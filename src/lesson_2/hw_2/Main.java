package lesson_2.hw_2;

public class Main {
    public static void main(String[] args) {
        Pc pc = new Pc(
                "Intel",
                32);
        Laptop laptop = new Laptop(
                "Intel",
                32,
                true);
        Ultrabook ultrabook = new Ultrabook(
                "Intel",
                32,
                true,
                2.1);
        Workstation workstation = new Workstation(
                "Intel",
                32,
                true,
                92);

    }
}
