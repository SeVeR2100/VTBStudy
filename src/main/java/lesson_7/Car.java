package lesson_7;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private static AtomicInteger win;
    static {
        CARS_COUNT = 0 ;
        win= new AtomicInteger(1);
    }
    private Race race;
    private int speed;
    private String name;
    private CyclicBarrier barrier;
    public String getName () {
        return name;
    }
    public int getSpeed () {
        return speed;
    }
    public Car (Race race, int speed, CyclicBarrier barrier) {
        this .race = race;
        this .speed = speed;
        CARS_COUNT++;
        this .name = "Участник #" + CARS_COUNT;
        this.barrier=barrier;
    }
    @Override
    public void run () {
        try {
            System.out.println( this .name + " готовится" );
            Thread.sleep( 500 + ( int )(Math.random() * 800 ));
            System.out.println( this .name + " готов" );
            barrier.await();
            barrier.await();
            for ( int i = 0 ; i < race.getStages().size(); i++) {
                race.getStages().get(i).go( this );
            }
            win.incrementAndGet();
            if(win.get()==1){
                System.out.println(name+" Win!");
            }
            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getCarsCount() {
        return CARS_COUNT;
    }
}