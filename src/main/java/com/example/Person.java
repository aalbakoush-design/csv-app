package com.example;

public class Person {

    private String name;
    private int age;

    /*@
      @ requires name != null;       // الاسم لازم يكون غير null
      @ requires age >= 0;           // العمر لازم يكون رقم موجب أو صفر
      @ ensures this.name.equals(name);
      @ ensures this.age == age;
      @*/
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*@
      @ ensures \result != null;
      @*/
    public String getName() {
        return name;
    }

    /*@
      @ ensures \result >= 0;
      @*/
    public int getAge() {
        return age;
    }

    /*@
      @ ensures \result != null;
      @*/
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
