package lesson_2.Barriers;

public class Wall implements IBarrier{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getValue() {
        return height;
    }
}
