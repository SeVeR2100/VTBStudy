package lesson_1.Animals;

public class Tiger extends Animal{
    private static int tigerCount;
    private String name;

    public Tiger(String name) {
        animalCount++;
        tigerCount++;
        this.name=name;
    }

    public void run(int distance) {
        System.out.println("Тигр "+name+" пробежал "+distance);
    }

    public void swim(int distance) {
        System.out.println("Тигр "+name+" проплыл "+distance);
    }

    public static int getTigerCount() {
        return tigerCount;
    }
}
