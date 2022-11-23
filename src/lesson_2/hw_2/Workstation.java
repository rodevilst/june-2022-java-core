package lesson_2.hw_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Workstation extends Laptop {
    private int size;

    public Workstation(String cpu, int ram, boolean touchpad, int size) {
        super(cpu, ram, touchpad);
        this.size = size;
    }
}
