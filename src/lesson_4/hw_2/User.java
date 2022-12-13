package lesson_4.hw_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Comparable<User>{
    private int id;
    private String name;
    private String username;
    private String email;
    private int age;
    private Gender gender;
    private List<Skills> skills = new ArrayList<>();
    private Car car;


    @Override
    public int compareTo(User o) {
        return this.skills.size()- o.skills.size();
    }
}
