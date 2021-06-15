package algorithms.arrayToMaxDigits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] digits = new int[]{1,2,5,3,7,3,1,4,8,5,7,4,6};
        System.out.println(toMaxDigits(digits));
    }
    public static String toMaxDigits (int[]array){
        Arrays.sort(array);
        StringBuilder result = new StringBuilder();
        for(int i =array.length-1;i>=0;i--){
            result.append(array[i]);
        }
        return result.toString();
    }
}
