package lesson_3.hw_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Magazine implements Printable{
    private int price;
    private String title;
     public void print() {
         System.out.println(this);
    }
}
