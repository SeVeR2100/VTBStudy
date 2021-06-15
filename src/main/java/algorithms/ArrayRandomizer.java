package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRandomizer {
    public static void main(String[] args) {
        int[] array = new int[]{1,34,6,34,6,23,5,7,6768,67,8,4};
        System.out.println(Arrays.toString(array));
        int[] randomArray = randomizer(array);
        System.out.println(Arrays.toString(randomArray));


    }

    private static int[] randomizer(int[] array) {
        int arrayLength = array.length;
        List<Integer> intList = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        int[] newArray = new int[arrayLength];
        for(int i=0;i<arrayLength;i++){
            int randomIndex = (int) (Math.random()*intList.size());
            newArray[i]= (int) intList.remove(randomIndex);
        }
        return newArray;
    }
}
