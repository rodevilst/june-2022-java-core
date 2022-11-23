package lesson_2.hw_2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor


public class Pc {
    private String cpu;
    private int ram;

    public Pc(String cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
}
