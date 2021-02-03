import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String s1 = scan.nextLine();
        System.out.println(s1);
        String s2 = s1.replaceAll(" ","");
        System.out.println(s2);
        int maxLength = 0;
        char[] chars = s2.toCharArray();
        for (int i=0;i<chars.length-1;i++){
            if(chars[i]>chars[i+1]){
                maxLength++;
                if(i==chars.length-2){
                    if(chars[i+1]>chars[i+2]){
                        maxLength++;
                    }
                }
            } else continue;
        }
        System.out.println(maxLength);

    }
}
