package lesson_2;

import lesson_2.Barriers.IBarrier;
import lesson_2.Barriers.Road;
import lesson_2.Barriers.Wall;
import lesson_2.Runners.Cat;
import lesson_2.Runners.Human;
import lesson_2.Runners.ICompetitioner;
import lesson_2.Runners.Robot;

public class Main {
    public static void main(String[] args) {
        IBarrier[] barriers = new IBarrier[]{
                new Road(300),
                new Wall(50),
                new Road(600),
                new Wall(60),
                new Road(1000),
                new Wall(100),
                new Road(400),
                new Wall(90),
                new Road(1500),
                new Wall(120),
                new Road(500),
                new Wall(50),
        };
        ICompetitioner[] competitioners = new ICompetitioner[] {
                new Cat("Кошка","Мила",100,500),
                new Human("Человек","Иннокентий",90,300),
                new Robot("Робот","Фёдор",70,2000),
                new Cat("Кошка","Алиса",150,800),
                new Human("Человек","Иибрагим",150,1800),
                new Robot("Робот","Абобо",200,2000),
                new Cat("Кошка","Феодосия",160,900),
                new Human("Человек","Усейн",220,3000),
                new Robot("Робот","Тостер",50,563)
        };

        for (ICompetitioner competitioner: competitioners){
                for (IBarrier barrier : barriers) {
                    if(competitioner.canContinue()==true) {
                        if (barrier instanceof Road) {
                                competitioner.getRun(barrier.getValue());
                        } else if (barrier instanceof Wall) {
                             competitioner.getJump(barrier.getValue());

                    }
                }
            }
        }
    }
}
