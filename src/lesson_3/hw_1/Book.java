package lesson_3.hw_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Book implements Printable {
    private int pages;
    private String title;

    public void print() {
        System.out.println(this);

    }
}
