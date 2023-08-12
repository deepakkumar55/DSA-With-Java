package Array;

import java.util.Arrays;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Compare based on age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

public class SortinganObjectArray {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Deepka", 23),
            new Person("Vanshika", 21),
            new Person("Neha", 22),
            new Person("Kunal", 22),
            new Person("Nirbhay", 20)
        };

        Arrays.sort(people);

        System.out.println("Sorted array: " + Arrays.toString(people));
    }
}
