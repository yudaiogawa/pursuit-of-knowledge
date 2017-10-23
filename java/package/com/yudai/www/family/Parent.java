package com.yudai.www.family;

public class Parent {

  public String name;

  public Parent(String name) {
    this.name = name;
  }

  public void sayName() {
    System.out.println("My child's name is " + this.name);
  }

}
