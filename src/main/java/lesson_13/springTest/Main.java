package lesson_13.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SaySomething saySomething = context.getBean("saySomething", SaySomething.class);
        saySomething.saySomething();
        ((AnnotationConfigApplicationContext) context).close();
    }
}
