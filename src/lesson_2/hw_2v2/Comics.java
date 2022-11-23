package lesson_2.hw_2v2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Comics extends Book {
    private Company company;

    public Comics(String name, int page, Size size, Company company) {
        super(name, page, size);
        this.company = company;
    }

}
