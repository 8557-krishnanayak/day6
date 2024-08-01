package sorting;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class SortFunction {

    public static int sortMethod(Person p1, Person p2) {
        System.out.println(p1.getName() + " " + p2.getName() + "\t" + (p1.getAge() - p2.getAge()));
        return p1.getAge() - p2.getAge();
    }

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Person 1", 18, 10_000d),
                new Person("Person 2", 12, 23_456d),
                new Person("Person 3", 20, 50_456d),
                new Person("Person 4", 22, 70_456d),
                new Person("Person 5", 14, 50_456d),
                new Person("Person 6", 16, 40_456d)
        );

        List<Person> collect = list.stream().sorted(SortFunction::sortMethod).collect(Collectors.toList());
        System.out.println(collect);
    }

}
