package algorithms.bag;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(4,20);
        Item item2 = new Item(3,18);
        Item item3 = new Item(2,14);

        Item[]itemArr = {item1,item2,item3};
        //Сортируем обьекты по ценности
        Arrays.sort(itemArr, Comparator.comparingDouble(Item::getValueByWeight).reversed());
        System.out.println(Arrays.toString(itemArr));

        final int valueOfBag = 7;

        int currentWeightOfBag = 0;
        double currentValueOfBag = 0;
        int checkedItem = 0;

        while(checkedItem<itemArr.length && currentValueOfBag!=valueOfBag){
            //Если предмет помещается целиком
            if(currentWeightOfBag + itemArr[checkedItem].getWeight()<valueOfBag){
                currentValueOfBag+=itemArr[checkedItem].getValue();
                currentWeightOfBag+=itemArr[checkedItem].getWeight();
            } else{
            //Вычисляем нужную чать под оставцийся обьём
                currentValueOfBag+=((valueOfBag-currentWeightOfBag)/(double) itemArr[checkedItem].getWeight())*
                        itemArr[checkedItem].getValue();
                currentWeightOfBag = valueOfBag;
            }
            checkedItem++;
        }
        System.out.println("Ценность наилучшего набора - " + currentValueOfBag);
    }

}
class Item{
    private int weight;
    private int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double getValueByWeight(){
        return value/(double)weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}
