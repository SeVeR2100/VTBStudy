package lesson_1.Animals;

public class Dog extends Animal {
    private static int dogCount;
    private String name;

    public Dog(String name) {
        animalCount++;
        dogCount++;
        this.name=name;
    }

    public void run(int distance) {
        if (distance>0 && distance<500) {
            System.out.println("Собака " + name + " пробежала " + distance);
        } else {
            System.out.println("Собака " + name + "не смогла пробежать такую дистанцию");
        }
    }

    public void swim(int distance) {
        if (distance>0 && distance<10) {
            System.out.println("Собака " + name + "проплыла " + distance);
        } else {
            System.out.println("Собака " + name + " не смогла проплыть дистанцию ");
        }
    }




    public static int getDogCount() {
        return dogCount;
    }



}
