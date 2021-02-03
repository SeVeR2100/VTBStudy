package lesson_5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private Map<String, HashSet<String>> phoneBook= new HashMap<>();

    public void add(String name, String phoneNumber){
        if(!phoneBook.containsKey(name)) {
            phoneBook.put(name, new HashSet<>());
        }
        phoneBook.get(name).add(phoneNumber);
    }

    public HashSet<String> get(String name){
        return phoneBook.get(name);
    }
    public Set<String> getAllNames(){
        return phoneBook.keySet();
    }
}
