package algorithms.listToArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strings = convert(String.class, List.of("val1","val2","val3"));
        System.out.println(Arrays.toString(strings));
    }

    public static <T> T[] convert (Class<T> clazz, List<T> values){
        T [] array = (T[]) Array.newInstance(clazz,values.size());
        for(int i=0;i<array.length;i++){
            array[i]= values.get(i);
        }
        return array;
    }
}
