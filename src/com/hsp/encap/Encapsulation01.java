package com.hsp.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.getInfo());

    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getInfo() {
        return "name: " + name + " age: " + age + " salary: " + salary;
    }


}
