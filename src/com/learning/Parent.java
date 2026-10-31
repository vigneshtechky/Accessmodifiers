package com.learning;

import com.learning.accessmodifiers.SecondChild;

//access modifiers
public class Parent  {
   protected String name;

   protected String returnName() {
        return name;
    }

   protected void setName(String name) {
        this.name = name;
    }

}
