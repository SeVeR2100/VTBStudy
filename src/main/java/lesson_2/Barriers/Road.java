package lesson_2.Barriers;

public class Road implements IBarrier{
    private int length;

    public Road(int length) {
        this.length = length;
    }

    @Override
    public int getValue() {
        return length;
    }
}
