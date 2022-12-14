package lesson_5.hw_3;

import lesson_4.hw_2.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(Model.TOYOTA, 255, new Owner("maxim", 27, 5), 10050, 2021));
        cars.add(new Car(Model.BMW, 350, new Owner("andrey", 22, 2), 12340, 2022));
        cars.add(new Car(Model.AUDI, 160, new Owner("igor", 20, 1), 40234, 2020));
        cars.add(new Car(Model.TOYOTA, 245, new Owner("dima", 32, 10), 54500, 2015));
        cars.add(new Car(Model.BMW, 220, new Owner("anton", 45, 20), 32500, 2018));
        cars.add(new Car(Model.AUDI, 215, new Owner("lesha", 23, 3), 9500, 2010));
        cars.add(new Car(Model.TOYOTA, 200, new Owner("alex", 19, 1), 10500, 2008));
        cars.add(new Car(Model.BMW, 300, new Owner("david", 35, 10), 42500, 2021));
        cars.add(new Car(Model.AUDI, 320, new Owner("denis", 42, 16), 27400, 2019));
        cars.add(new Car(Model.TOYOTA, 160, new Owner("egor", 59, 28), 15000, 2016));
        cars.add(new Car(Model.BMW, 180, new Owner("mark", 22, 4), 19000, 2009));
        cars.add(new Car(Model.AUDI, 200, new Owner("petro", 23, 4), 23000, 2019));
        cars.add(new Car(Model.TOYOTA, 350, new Owner("ruslan", 18, 0), 47000, 2022));
        cars.add(new Car(Model.BMW, 240, new Owner("yura", 34, 9), 12000, 2016));
        cars.add(new Car(Model.AUDI, 210, new Owner("yarik", 26, 4), 14000, 2014));
        cars.stream()
                .map(Owner -> {
                    if (Owner.getOwner().getExp() < 5 && Owner.getOwner().getAge() > 25) {
                        Owner.getOwner().setExp(Owner.getOwner().getExp() + 1);
                    }
                    return Owner;
                })
                .peek(car -> car.setPower(car.getPower() / 100 * 110)).toList();
        int totalPriceCars = cars.stream().reduce(0, (car, car2) -> car + car2.getPrice(), Integer::sum);
        System.out.println(cars);
        System.out.println("The total price of all cars: "+ totalPriceCars);

//                .forEach(System.out::println);

//                .reduce((car,car1) -> {
//            double v = car.getPower() + car1.getPower();
//            System.out.println(result);
//            return result;


//        System.out.println(cars);


    }
}
