package lesson_3.hw_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Guitare implements Instrument {
    private Strings strings;

    @Override
    public void play() {
        System.out.println("Now play " + getClass().getSimpleName() + " with this characteristics : "  + strings);

    }
}
