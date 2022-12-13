package lesson_4.hw_3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ZooClub {
    private Map<Person, List<Pet>> map = new LinkedHashMap<>();

    //    +pers
    public void addPerson(Person person) {
        map.put(person, null);
    }

    //    +pet
    public void addPetToPerson(Person person, Pet pet) {
        List<Pet> pets = map.get(person);
        pets.add(pet);
    }

    //    -petFromPers
    public void deletePetFromPerson(Pet pet, Person person) {
        List<Pet> pets = map.get(person);
        pets.removeIf(p -> p.equals(pet));
    }

    //    -pers
    public void deletePersonFromClub(Person person) {
        map.remove(person);
    }
    public void deletePetFromAll(Pet pet) {
        Set<Map.Entry<Person, List<Pet>>> entries = map.entrySet();
        entries.forEach(personListEntry -> {
            List<Pet> value = personListEntry.getValue();
            value.removeIf(pet1 -> pet1.equals(pet));
        });
    }
    public void print() {
        System.out.println(this.map);
    }

}
