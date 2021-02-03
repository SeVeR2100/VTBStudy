package lesson_1.Animals;

public class Cat extends Animal{
    private static int catCount;
    private String name;

    public Cat(String name) {
        animalCount++;
        catCount++;
        this.name=name;

    }

    public void run(int distance) {
        if(distance<200 & distance>0) {
            System.out.println("Кот "+ name + " пробежал " + distance );
        } else{
            System.out.println("Кот "+ name + "не смог пробежать такую дистанцию!!!");
        }
    }

    public void swim(int distance) {
        System.out.println("Кот "+ name + " не умеет плавать!!!");
    }


    public static int getCatCount() {
        return catCount;
    }
}
