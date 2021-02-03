package lesson_4;

import lesson_4.fruits.Fruit;
import java.util.ArrayList;
import java.util.Arrays;


public class Box<T extends Fruit> {
    private ArrayList<T> boxOfFruit = new ArrayList<>();
    private double value =0.0;

    public Box() {
    }

    private double getWeight(){
        for (Fruit t: boxOfFruit) {
            value+=t.getWeight();
        }
        return value;
    }

    public boolean compare(Box<?> anotherBox){
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void putFruits(T... fruit){
        this.boxOfFruit.addAll(Arrays.asList(fruit));
    }

    public void putFruits(T fruit){
        this.boxOfFruit.add(fruit);
    }

    public void getWeightInfo(){
        getWeight();
        System.out.println("Вес всех фруктов в коробке равен: " + value );
    }

    public void getCompareInfo(Box<?> anotherBox){
        if(compare(anotherBox)){
            System.out.println("Эти коробки равны по весу");
        }else{
            System.out.println("Эти коробки не равны по весу");
        }
    }

    public void relocateFruit(Box<T>box){
        box.boxOfFruit.addAll(this.boxOfFruit);
        boxOfFruit.clear();
    }


    @Override
    public String toString() {
        return "Box{" +
                "boxOfFruit=" + boxOfFruit +
                '}';
    }

    public ArrayList<T> getBoxOfFruit() {
        return boxOfFruit;
    }
}
