package lesson_2.hw_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Car {
    private Model model;
    private int year;
    private int power;
}
