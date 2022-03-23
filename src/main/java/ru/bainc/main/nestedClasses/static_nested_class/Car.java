package ru.bainc.main.nestedClasses.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }
    void method() {
        System.out.println(Engine.countOfObject);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "My car {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
       private   int horsePower;
        static int countOfObject; // счетчик, кот-ый считает сколько моторов создано

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObject++;
            System.out.println(a);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
