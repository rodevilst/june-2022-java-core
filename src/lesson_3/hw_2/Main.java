package lesson_3.hw_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                List<Instrument> instrumentList = new ArrayList<>();
                instrumentList.add(new Guitare(new Strings(8)));
                instrumentList.add(new Trumpet(28.4));
                instrumentList.add(new Drum(Size.BIG));
                for (Instrument instrument : instrumentList) {
                        instrument.play();
                }

        }
}
