package lesson_3.hw_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Trumpet implements Instrument{
    private double diameter;

    @Override
    public void play() {
        System.out.println("Now play " + getClass().getSimpleName() + " with this characteristics : " +"diameter "  + getDiameter());

    }
}
