package ru.bainc.main.nestedClasses.inner_nested_class;


public class Test {
    public static void main(String[] args) {
        Car car = new Car("black", 4); //, 200);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);
    }
}
