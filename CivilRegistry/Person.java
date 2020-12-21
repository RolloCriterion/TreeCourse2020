package Stream.CivilRegistry;

import java.util.List;

public class Person implements Comparable<Person> {

    private final String name;
    private final String surname;
    private final int age;
    private final String id;
    private final String address;
    private List<String> child;

    public Person(String name, String surname, int age, String id, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.address = address;
    }

    public Person(String name, String surname, int age, String id, String address, List<String> child) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.address = address;
        this.child = child;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getId() {
        return id;
    }
    public String getAddress() {
        return address;
    }
    public List<String> getChild(){
        return child;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
}
