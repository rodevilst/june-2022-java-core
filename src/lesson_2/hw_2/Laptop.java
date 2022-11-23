package lesson_2.hw_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Laptop extends Pc {
    private boolean touchpad;

    public Laptop(String cpu, int ram, boolean touchpad) {
        super(cpu, ram);
        this.touchpad = touchpad;
    }
}
