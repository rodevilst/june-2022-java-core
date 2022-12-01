package lesson_3.hw_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Drum implements Instrument {
    private Size size;

    @Override
    public void play() {
        System.out.println("Now play " + getClass().getSimpleName() + " with this characteristics : " + "size "  + size);

    }
}
