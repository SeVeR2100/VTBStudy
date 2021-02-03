package lesson_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        String[]stringArray=new String[]{"A","B","A","B","C","A","A","C","A","C","D","A","D","A",};
        String getMaxCountString=Arrays.stream(stringArray)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(e->e.getValue()))
                .get().getKey();
        System.out.println("Самое часто встречающиеся слово: " + getMaxCountString);

        List<Employee>employeeList = new LinkedList<>();
        employeeList.add(new Employee("Alex",20,20000.23));
        employeeList.add(new Employee("Bob",45,28542.24));
        employeeList.add(new Employee("Nick",63,35424.24));
        employeeList.add(new Employee("Rob",23,45153.18));
        employeeList.add(new Employee("Stas",34,65424.54));
        employeeList.add(new Employee("Polly",53,22355.45));
        employeeList.add(new Employee("All",46,65485.25));
        employeeList.add(new Employee("Mike",33,26455.54));

        System.out.println("Средняя зарплата сотрудников: "+
        employeeList.stream().mapToDouble(e-> e.getSalary()).average());

        int countEmployee = 3;
        System.out.println(employeeList.stream()
                .sorted((e1,e2)-> e2.getAge()-e1.getAge())
                .limit(countEmployee)
                .map(Employee::getName)
                .collect(Collectors.joining(", ",countEmployee+" самых возрастных сотрудников(а) :",".")));

    }
}
