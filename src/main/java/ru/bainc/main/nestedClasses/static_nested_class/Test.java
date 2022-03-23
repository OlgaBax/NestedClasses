package ru.bainc.main.nestedClasses.static_nested_class;

import ru.bainc.main.nestedClasses.static_nested_class.Car;

public class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);

    }
}
