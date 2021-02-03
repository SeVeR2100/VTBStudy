package lesson_3;

public class Main {
    public static void main(String[] args) {
        String[][] array1 = {
            {"5","12","234","-1"},
            {"12","62","1234","345"},
            {"3654","33","-344","-345"},
            {"6","45","3456","-45"}
        };
        String[][] array2 = {
                {"5","12","234","-1"},
                {"12","62","1234","345"},
                {"3654","33","-344","-345"},
                {"3654","33","-344","-345"},
                {"6","45","3456","-45"}
        };
        String[][] array3 = {
                {"5","12","234","-1"},
                {"12","62","1234","345"},
                {"3654","33","-344","-345"},
                {"6","45","s","-45"}
        };
        try {
            System.out.println("Value of array is: " + arrayWork(array1));
        } catch (MyException e){
            e.printStackTrace();
        }
        try {
            System.out.println("Value of array is: " + arrayWork(array2));
        } catch (MyException e){
            e.printStackTrace();
        }
        try {
            System.out.println("Value of array is: " + arrayWork(array3));
        } catch (MyException e){
            e.printStackTrace();
        }

    }

    public static int arrayWork(String[][] array){
        if(array.length!=4){
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int value = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try{
                    value+=Integer.valueOf(array[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return value;
    }
}
