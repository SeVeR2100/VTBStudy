package lesson_2.Runners;

public class Human implements IJump,IRun,ICompetitioner{
    private String type;
    private String name;
    private int maxHeightJump;
    private int maxDistanceRun;
    private boolean readyForCompetition = true;


    @Override
    public void getJump(int height) {
        if (maxHeightJump>height){
            System.out.println(type +" "+ name +" смог преодолеть препятсвие в :"+ height + " сантиметров");
        } else {
            System.out.println(type +" "+ name +"  не смог преодолеть препятсвие и выбывает из соревнования!!");
            readyForCompetition = false;
        }
    }

    @Override
    public void getRun(int distance) {
        if (maxDistanceRun>distance){
            System.out.println(type +" "+ name +" смог пробежать кросс длиной в :"+ distance+" метров");
        } else {
            System.out.println(type +" "+ name +"  не смог пробежать кросс и выбывает из соревнования!!");
            readyForCompetition = false;
        }
    }

    @Override
    public boolean canContinue() {
        return readyForCompetition;
    }

    public Human(String type, String name, int maxHeightJump, int maxDistanceRun) {
        this.type = type;
        this.name = name;
        this.maxHeightJump = maxHeightJump;
        this.maxDistanceRun = maxDistanceRun;
    }
}
