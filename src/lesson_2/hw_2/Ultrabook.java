package lesson_2.hw_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ultrabook extends Laptop {
    private double weight;

    public Ultrabook(String cpu, int ram, boolean touchpad, double weight) {
        super(cpu, ram, touchpad);
        this.weight = weight;
    }
}
