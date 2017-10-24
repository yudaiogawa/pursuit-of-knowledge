package com.yudai.lesson.greeting;

public class English {

  protected String greeting;

  public English(String greeting) {
    this.greeting = greeting;
  }

  public void sayHello() {
    System.out.println(this.greeting + "!!");
    System.out.println("What's up??");
  }

}
