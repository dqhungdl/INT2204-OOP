package com.uet.int2204.Week11;

public class Person implements Comparable<Person> {

    private String name;

    private Integer age;

    private String address;

    public Person() {

    }

    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person person) {
        if (name.compareTo(person.name) == 0)
            return age.compareTo(person.age);
        return name.compareTo(person.name);
    }
}
