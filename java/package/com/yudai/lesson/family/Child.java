package com.yudai.lesson.family;

public class Child extends Parent {

  public Child() {
    super("yudai");
  }

  @Override
  public void sayName(){
    System.out.println("私の名前は雄大です");
  }

}
