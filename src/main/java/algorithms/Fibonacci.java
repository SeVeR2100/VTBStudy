package algorithms;

import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        BigInteger n1 = new BigInteger(String.valueOf(1));      // Инициализируем обьект БигИнтеджер с чилом 1
        BigInteger n2 = new BigInteger(String.valueOf(1));      // Инициализируем обьект БигИнтеджер с чилом 1
        BigInteger n3 = null;                                   // Инициализируем пустой обьект БигИнтеджер
        System.out.print(n1+ " "+ n2+" ");                    // ЕСЛИ надо выводить всю последовательность
        for(int i=3;i<=10;i++){                                // Цикл до искомого или крайнего обьекта
            n3=n1.add(n2);                                      // 1-е +2-е становться 3
            System.out.print(n3+" ");                        // ЕСЛИ надо выводить всю последовательность
            n1=n2;                                              // 2-й становиться 1-м
            n2=n3;                                              // 3-й становться 2-м

        }
        //    System.out.println(n3);                                 // ЕСЛИ нужен только исковый выводим
    }
}