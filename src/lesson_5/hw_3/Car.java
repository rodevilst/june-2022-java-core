package lesson_5.hw_3;

import lesson_4.hw_2.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Model model;
    private double power;
    private Owner owner;
    private int price;
    private int year;
}
