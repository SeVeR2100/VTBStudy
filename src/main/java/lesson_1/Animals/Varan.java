package lesson_1.Animals;

public class Varan extends Animal{
    private static int varanCount;
    private String name;

    public Varan(String name) {
        animalCount++;
        varanCount++;
        this.name=name;
    }

    public void run(int distance) {
        System.out.println("Варан "+name+" пробежал "+distance);

    }

    public void swim(int distance) {
        System.out.println("Варан "+name+" проплыл "+distance);
    }



    public static int getVaranCount() {
        return varanCount;
    }
}
