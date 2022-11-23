package lesson_2.hw_2v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Papyrus{
    private Size size;

    public Book(String name, int page, Size size) {
        super(name, page);
        this.size = size;
    }
}
