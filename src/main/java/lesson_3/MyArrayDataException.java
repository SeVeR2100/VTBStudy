package lesson_3;

public class MyArrayDataException extends MyException {

    public MyArrayDataException(int row, int column) {
        super("Invalid data in array pos:"+"["+row+","+column+"]");
    }
}
