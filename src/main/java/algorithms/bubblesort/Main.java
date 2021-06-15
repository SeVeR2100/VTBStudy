package algorithms.bubblesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]array=new int[]{42,32,4,23,6,3495,23,534,2,3,5824,23,345,23,1,32495,6};
        System.out.println(Arrays.toString(array));
        getSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void getSort(int[]array){
        boolean isSorted=false;
        while(!isSorted){
            isSorted=true;
            for(int i =0,j =array.length-1;i<j;i++){
                if(array[i]>array[i+1]){
                    int temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    j--;
                    isSorted=false;
                }
            }
        }
    }
}
