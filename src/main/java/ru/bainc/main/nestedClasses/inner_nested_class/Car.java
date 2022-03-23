package ru.bainc.main.nestedClasses.inner_nested_class;

public class Car {
        String color;
        int doorCount;
        Engine engine;

        public Car(String color, int doorCount){ //int horsePower) {
            this.color = color;
            this.doorCount = doorCount;
//            this.engine = this.new Engine(horsePower);// создание объекта иннер класса.
            // В создании объекта иннер класса всегда задействовам объект внешнего класса.
        }
        public void setEngine (Engine engine){
            this.engine = engine;
        }


        @Override
        public String toString() {
            return "My car {" +
                    "color='" + color + '\'' +
                    ", doorCount=" + doorCount +
                    ", engine=" + engine +
                    '}';
        }

        public class Engine {
            private   int horsePower;

            public Engine(int horsePower) {
                this.horsePower = horsePower;
            }

            @Override
            public String toString() {
                return "Engine{" +
                        "horsePower=" + horsePower +
                        '}';
            }
        }
    }


