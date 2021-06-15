import java.util.Arrays;
import java.util.Comparator;

public class Comporator {
    public static void main(String[] args) {
        Integer [] arr = new Integer[]{1,21,4,324,546,23,34,2,45,6,2,432,5,675};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(arr));
        
    }
}
