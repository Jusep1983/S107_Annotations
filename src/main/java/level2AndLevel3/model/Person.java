package level2AndLevel3.model;

import level2AndLevel3.interfaces.JsonSerializable;

// Person class controls its own serialization directory thanks to the annotation @JsonSerializable
@JsonSerializable(directory = "jsonPersons")
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{name: " + name + ", age: " + age + ", hash code: " + this.hashCode() + "}";
    }

}
