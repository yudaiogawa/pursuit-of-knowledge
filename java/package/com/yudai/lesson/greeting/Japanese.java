package com.yudai.lesson.greeting;

public class Japanese extends English {

  public Japanese(String greeting) {
    super(greeting);
  }

  @Override
  public void sayHello(){
    System.out.println(this.greeting + "！");
    System.out.println("調子はどう？");
  }

}
