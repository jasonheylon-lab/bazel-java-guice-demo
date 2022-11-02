package com.demo;

import com.person.Person;

public class Demo {
  public static void main(String[] args) {
    System.out.println("start Main");
    Hello.sayHi();


    Person p = new Person("Haha");

    System.out.println("Person name " + p.getName());
  }
}
