package lesson_5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[]stringArray= new String[]{"Я","не","Андрей","Я","Андройд","Меня","не","волнует","не","беспокоит"};
        Map<String,Integer> mapOfsomething = new HashMap<>();
        for(String s: stringArray){
            if(!mapOfsomething.containsKey(s)){
                mapOfsomething.put(s,1);
            }else {
                int count = mapOfsomething.get(s);
                mapOfsomething.put(s,++count);
            }
        }
        System.out.println(mapOfsomething.toString());
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Зильберман Альберт Николавич","+7 904 435 2345");
        phoneBook.add("Алёшина Галина Николаевна","+7 902 358 3648");
        phoneBook.add("Иннокентий Владимирович Смоктуновский","+7 910 335 7845");
        phoneBook.add("Васильев Адексей Петров","+7 569 245 9865");
        phoneBook.add("Руденко Владимир Константинович","+7 654 548 2347");
        phoneBook.add("Зильберман Альберт Николавич","+7 904 435 2344");
        phoneBook.add("Зильберман Альберт Николавич","+7 904 435 2342");
        System.out.println(phoneBook.get("Зильберман Альберт Николавич"));
        System.out.println(phoneBook.getAllNames());
    }
}
