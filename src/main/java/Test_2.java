import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        System.out.println(maxLengthWord("A b C d cBA"));
    }


    static boolean maxLengthWord(String  s){
        String[] split = s.split(" ");
        for(String ss: split){
            System.out.println(ss);
        }
        char[]arrayChar = s.toCharArray();
        int j= arrayChar.length-1;

        for(int i = 0 ; i<= arrayChar.length/2;i++){
            String s1 = String.valueOf(arrayChar[i]).toUpperCase();
            String s2 = String.valueOf(arrayChar[j-1]).toUpperCase();
            if(!s1.equals(s2)){
                return false;
            }
            j--;
        }
        return true;
    }

}
