package lesson_1;

import lesson_1.Animals.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
             new Cat("Барсик"),
             new Cat("Буба"),
             new Cat("Пётр"),
             new Dog("Василий"),
             new Dog("Плешивый"),
             new Tiger("Смелый"),
             new Rat("Василиса"),
             new Rat("Мразь"),
             new Varan("Зелёный"),
             new Varan("Мерзкий")
        };
        for(Animal a: animals){
            a.run(50);
            a.swim(10);
        }
        Animal.getAllCount();

    }
}
