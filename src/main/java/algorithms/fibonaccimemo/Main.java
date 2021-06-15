package algorithms.fibonaccimemo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        long[]memory = new long[n+1];
        Arrays.fill(memory, -1);
        System.out.println(getFibonacciMem(100,memory));

    }
    public static long getFibonacciMem (int n,long[]memory){
        if(memory[n] !=-1){
            return memory[n];
        }
        if(n<=1){
            return n;
        }
        long result = getFibonacciMem(n-1,memory)+getFibonacciMem(n-2,memory);
        memory[n]=result;

        return result;
    }
}
