package lesson_4;

import lesson_4.fruits.Apple;
import lesson_4.fruits.Fruit;
import lesson_4.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.__________________________________________________________");
        String[]arr= new String[]{"1","2","3","4","5","6","7","8"};
        getSwitch(arr,2,6);
        for(String s: arr){
            System.out.println(s);
        }

        System.out.println("2.__________________________________________________________");
        ArrayList arrayList = castToArrayList(new String[]{"A","B","C","D","E","F","G"});
        System.out.println(arrayList.toString());

        System.out.println("3.__________________________________________________________");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        appleBox.putFruits(apple,apple,apple,apple,apple,apple,apple);
        orangeBox.putFruits(orange,orange,orange,orange);
        appleBox.getWeightInfo();
        orangeBox.getWeightInfo();
        orangeBox.getCompareInfo(appleBox);

        System.out.println(appleBox.getBoxOfFruit().toString());
        appleBox.relocateFruit(appleBox2);
        appleBox2.putFruits(new Apple());
        System.out.println(appleBox.getBoxOfFruit().toString());
        System.out.println(appleBox2.getBoxOfFruit().toString());

    }

    public static void getSwitch(Object[] array,int pos1,int pos2){
        Object tempPos1 = array[pos1];
        array[pos1]=array[pos2];
        array[pos2]=tempPos1;

    }

    public static <T>ArrayList castToArrayList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }
}
