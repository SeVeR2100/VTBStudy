package lesson_1.Animals;

public class Rat extends Animal{

    private static int ratCount;
    private String name;

    public Rat(String name) {
        animalCount++;
        ratCount++;
        this.name=name;
    }

    public void run(int distance) {
        System.out.println("Крыса "+name+" пробежалф "+distance);
    }

    public void swim(int distance) {
        System.out.println("Крыса "+name+" проплыла "+distance);
    }


    public static int getRatCount() {
        return ratCount;
    }
}
