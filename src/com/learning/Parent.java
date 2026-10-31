package com.learning;

//access modifiers
public class Parent {
    //default access modifier
    int age;
    //public access modifier
    public String name;

    //public  access modifier
    public Parent() {

    }

    //method access modifier(private access modifier)
    private void printName() {
        System.out.println("parent name: " + name);
    }

    protected void printAge() {
        System.out.println("parent age: " + age);
    }
}
