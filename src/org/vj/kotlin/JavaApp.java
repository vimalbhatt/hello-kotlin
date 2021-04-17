package org.vj.kotlin;

public class JavaApp {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Ram");
        System.out.println(e.getName());
        Person p = new Person(1,"Krishna", 100, "Universe");
        System.out.println(p.getName());
    }
}
