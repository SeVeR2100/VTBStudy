package lesson_13.springTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaySomething {

    @Autowired
    SayHello sayHello;

    @Autowired
    SayMyDear sayMyDear;

    public void saySomething(){
        sayHello.sayHello();
        sayMyDear.sayMyDear();
    }
}
