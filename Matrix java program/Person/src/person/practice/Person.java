package person.practice;
import java.util.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Person {
    String name="yamini";
    int age=22;
    Person()
    {
        System.out.println(name);
        System.out.println(age);
    }
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;

    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
       ArrayList <Person> li=new ArrayList();



        Person a=new Person();
        Person b=new Person("dipali",21);
        System.out.println(a);
        System.out.println(b);
        System.out.println("name "+b.getName() + " age :" + b.getAge() );
        System.out.println("name "+a.getName() + " age :" + a.getAge() );

    }
}

