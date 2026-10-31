package com.learning;

public class Child {
    public static void main(String[] args) {
//        Parent mom = new Parent();
//        mom.name = "mother";
//        mom.returnName();
//        mom.setName("mother1");
//        mom.returnName();

        ChildTwo childTwo = new ChildTwo();
        childTwo.name = "childTwo";
        System.out.println(childTwo.returnName());


    }
}
