package lesson_1.Animals;

import static lesson_1.Animals.Cat.getCatCount;
import static lesson_1.Animals.Dog.getDogCount;
import static lesson_1.Animals.Rat.getRatCount;
import static lesson_1.Animals.Tiger.getTigerCount;
import static lesson_1.Animals.Varan.getVaranCount;

public abstract class Animal {
    protected static int animalCount;

    public abstract void run(int distance);
    public abstract void swim(int distance);


    public static void getAllCount(){
        System.out.println("Всего было создано "+animalCount+" животных. Из них: " +
                "\nКотов : "+ getCatCount() +
                "\nСобак : "+ getDogCount()+
                "\nТигров : "+ getTigerCount() +
                "\nКрыс: "+getRatCount() +
                "\nВаранов: "+ getVaranCount());
    }

}
