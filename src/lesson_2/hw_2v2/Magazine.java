package lesson_2.hw_2v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Magazine extends Book {
    private int price;

    public Magazine(String name, int page, Size size, int price) {
        super(name, page, size);
        this.price = price;
    }
}
